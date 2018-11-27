package com.example.wang_.mymvptesting;


import dagger.Module;
import dagger.Provides;

@Module
public class MyTestModule  extends MyModule {

    @Override
    public IViewMain getMain() {
        return null;
    }
}
