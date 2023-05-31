package com.xiaohuo.libmanager.services;

import com.xiaohuo.libmanager.dao.UserArray;

/*
 * @Author XU XIAO
 * */
public class OperationImpl implements Operation{
    @Override
    public void Delete(String name, String password) {
        ManagerService managerService = new ManagerService();
        managerService.Delete(name,password);
    }
    @Override
    public void Add(String name, String password) {
        ManagerService managerService = new ManagerService();
        managerService.Add(name, password);
    }

    @Override
    public boolean CheckAdmin() {
        return true;
    }

    @Override
    public void exit(Manager manager) {

    }

    public boolean verifyNameExist(String name)
    {
        UserArray userArray = new UserArray();
        userArray.verifyNameExist(name);
        return false;
    }
}
