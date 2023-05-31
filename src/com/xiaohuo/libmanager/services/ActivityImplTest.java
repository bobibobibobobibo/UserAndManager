package com.xiaohuo.libmanager.services;

import org.junit.jupiter.api.Test;

public class ActivityImplTest {
    @Test
    void register(){
        ActivityImpl activity = new ActivityImpl();
        activity.register("","");
    }

    @Test
    void login(){
        ActivityImpl activity = new ActivityImpl();
        activity.login("","");
    }
    void logout(){
        ActivityImpl activity = new ActivityImpl();
        activity.logout();
    }

}
