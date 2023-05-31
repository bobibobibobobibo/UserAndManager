package com.xiaohuo.libmanager.services;

import org.junit.jupiter.api.Test;

public class OperationImplTest {
    @Test
    void Add(){
        ManagerService managerService = new ManagerService();
        managerService.Add("","");
    }
    @Test
    void delete(){
        ManagerService managerService = new ManagerService();
        managerService.Delete("name","password");
    }
}
