package com.example.wang_.mymvptesting;

import javax.inject.Singleton;

import dagger.Component;

@Component(modules = {MyModule.class})
@Singleton
public interface MyComponent {

    void inject(MainActivity mainActivity);
}
