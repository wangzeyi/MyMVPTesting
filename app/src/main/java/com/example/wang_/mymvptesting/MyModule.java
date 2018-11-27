package com.example.wang_.mymvptesting;


import dagger.Module;
import dagger.Provides;

@Module
public class MyModule {

    IViewMain viewMain;
    ApiService apiService;

    @Provides
    public IViewMain getMain(){
        viewMain =  new MainActivity();
        return viewMain;
    }

    @Provides
    public ApiService getApiService(){
        apiService = new ApiService("IamAndy");
        return apiService;
    }

    @Provides
    public IPresenterMain getPresenter(IViewMain viewMain, ApiService apiService){
        return new PresenterMain(viewMain, apiService);
    }


}
