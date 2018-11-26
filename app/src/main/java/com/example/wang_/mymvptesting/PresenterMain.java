package com.example.wang_.mymvptesting;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

public class PresenterMain implements IPresenterMain {

    IViewMain viewMain;

    @Inject
    public PresenterMain(IViewMain viewMain) {
        this.viewMain = viewMain;
    }

    @Override
    public List<Integer> getList() {

        List<Integer> mylist = new ArrayList<>();
        for(int i=0; i<10; i++) {
            mylist.add(i);
        }
        return mylist;
    }
}
