package com.example.wang_.mymvptesting;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.List;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity implements IViewMain {

    @Inject
    IPresenterMain presenterMain;

    MyComponent myComponent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //presenterMain = new PresenterMain(this);

        myComponent = DaggerMyComponent.builder().myModule(new MyModule()).build();
        myComponent.inject(this);

        List<Integer> mylist= presenterMain.getList();
        for(int i : mylist){
            Log.d("MyTag", ""+i);
        }

        String nm = presenterMain.getApiName();
        Log.d("MyTag", nm);

    }

    @Override
    public void sendList(List<Integer> list) {

    }
}
