package com.xiaohuo.libmanager.services;

import com.xiaohuo.libmanager.dao.UserArray;

public class ActivityImpl implements Activity{
/*
 * @Author XU XIAO
 * */
        @Override
        public boolean register(String name, String password){
            NormalUser normalUser = new NormalUser(name,password);
            normalUser.Add();
            return true;
        }

        @Override
        public boolean login(String name, String password){
            NormalUser normalUser = new NormalUser(name, password);
            boolean user = normalUser.isLoginStatus();
            if (normalUser.isLoginStatus()){
                // check exist user
                return false;
            }else{
                //check password
                String manager = normalUser.getName();
                if (normalUser.getPassword().equals(password)) {
                    return true;
                }else{
                    return false;
                }
            }
        }


    @Override
        public void logout() {
            NormalUser.setLoginStatus();
        }
}
