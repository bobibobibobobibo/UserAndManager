package com.xiaohuo.libmanager.controller;

/*
 * @Author XU XIAO
 * */

import com.xiaohuo.libmanager.services.Manager;

import java.util.Scanner;

public class ManagerController extends Manager {
   /* public UserController(String name, String password) {
        super(name, password);
        operations = new Operation();
        }*/
        public int menu(){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Hello" + name);
            boolean notLogin = true;
            while(notLogin){
                System.out.println("Please input your username: ");
                String username = scanner.nextLine();
                System.out.println("Password：");
                String password = scanner.nextLine();
                Manager manager = new Manager();
                if (manager.Delete()) { // check name

                    if (Manager.getName().getPassword().equals(password)) {
                        System.out.println("Login success.");
                        notLogin = false;
                    }else{
                        System.out.println("Your password is incorrect");
                    }

                }else{
                    System.out.println("Your username is not find.");
                }
            }

            System.out.println("1.Verify");
            System.out.println("2.Add User");
            System.out.println("3.Delete User");
            System.out.println("4.Checking User");
            System.out.println("0.exit");
            System.out.println("Please enter your services");
            int choice = scanner.nextInt();
            return choice;
    }
}
