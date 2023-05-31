package com.xiaohuo.libmanager.services;

import com.xiaohuo.libmanager.dao.UserArray;

import java.util.Scanner;

/*
 * @Author XU XIAO
 * */


public class ManagerService implements Operation {
    @Override
    public void Add(String name, String password) {
        System.out.println("Please inter your name");
        UserArray userArray = new UserArray();
        String[] mum = userArray.getMember();
        Scanner scanner = new Scanner(System.in);
        name = scanner.nextLine();
        System.out.println("Please inter your password");
        password = scanner.nextLine();
        int i;
        for (i = 0; i < Manager.size; i++){
            //adding a User and giving corresponding series number
            if (!(i == 0)) {
                break;
            }
        }
        userArray.add(name, password);
        System.out.println("Welcome to the e-library"+ name);
        System.out.println(i + " " + name);
}

//delete User
    @Override
    public void Delete(String name, String password) {
        System.out.println("Please enter your name");
        UserArray userArray = new UserArray();
        String[] mum = userArray.getMember();
        Scanner scanner = new Scanner(System.in);
        name = scanner.nextLine();
        Manager managerName = Manager.getName();
        Manager managerPassword = Manager.getPassword();
        System.out.println("Please inter your password");
        password = scanner.nextLine();
        int i;
        for(i = 0; i < Manager.getSize(); i++) {
            if (managerName.getName().equals(name) && managerPassword.getPassword().equals(password)){
                i--;
            }
            else {
                System.out.println("Your name or password are not correct");
            }
        }
        System.out.println(mum[i]);
    }
    @Override
    public boolean CheckAdmin(){
        Manager manager = new Manager();
        int num = manager.setSize();
        for (int i = 0; i< Manager.getSize(); i++) {
            System.out.println(i);
        }
        return false;
    }

    @Override
    public void exit(Manager manager) {
        System.out.println("GoodBye!");
        System.exit(0);
    }

}
