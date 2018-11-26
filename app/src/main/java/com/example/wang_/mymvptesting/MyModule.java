package com.example.wang_.mymvptesting;


import dagger.Module;
import dagger.Provides;

@Module
public class MyModule {

    IViewMain viewMain;

    @Provides
    public IViewMain getMain(){
        viewMain =  new MainActivity();
        return viewMain;
    }

    @Provides
    public IPresenterMain getPresenter(IViewMain viewMain){
        return new PresenterMain(viewMain);
    }


}
