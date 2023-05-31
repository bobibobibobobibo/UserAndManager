package com.xiaohuo.libmanager.services;
/*
 * @Author XU XIAO
 * */
public class UserService extends NormalUser{

        protected boolean Borrow;
        protected Operation[] operations;

        public UserService(String name, String password) {
            super(name, password);
        }

        public void UserMassage(String name, String password, boolean Borrow)
        {
            this.name = name;
            this.password = password;
        }
}
