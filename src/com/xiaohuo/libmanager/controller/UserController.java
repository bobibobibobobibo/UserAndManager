package com.xiaohuo.libmanager.controller;

import com.xiaohuo.libmanager.services.Manager;

import java.util.Scanner;

public class UserController {
    public void menu() {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Hello" + name);
        boolean notLogin = true;
        while(notLogin){
            System.out.println("Please input your username: ");
            String username = scanner.nextLine();
            System.out.println("Password：");
            String password = scanner.nextLine();
            Manager manager = new Manager();
            if (manager.getName().equals(name)) { // check name

                if (manager.getPassword().equals(password)) {
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
        System.out.println("2.Borrowing books");
        System.out.println("3.Returning books");
        System.out.println("4.Checking books");
        System.out.println("5.Print out all the information");
        System.out.println("0.exit");
        System.out.println("Please enter your services");
    }
}
