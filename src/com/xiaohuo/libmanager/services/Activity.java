package com.xiaohuo.libmanager.services;

import com.xiaohuo.libmanager.dao.UserArray;
import com.xiaohuo.libmanager.exception.CollectionException;

/*
 * @Author XU XIAO
 * */
public interface Activity {
        public boolean register(String name, String password);
        public boolean login(String name, String password);
        public void logout();
}
