package com.example.wang_.mymvptesting;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import java.util.List;

import javax.inject.Inject;

import static org.junit.Assert.*;

public class PresenterMainTest {

    @Rule
    public MockitoRule mockitoRule = MockitoJUnit.rule();

    @Mock
    IViewMain mainactivity;

    @InjectMocks
    PresenterMain presenterMain;

    @Before
    public void init(){

    }

    @Test
    public void getList() {
        List<Integer> list = presenterMain.getList();
        assertEquals(list.size(), 10);
    }
}