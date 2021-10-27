package com.c130.vendingmachine;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.c130.vendingmachine.controller.VendingMachineController;


public class App {

    public static void main(String[] args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        VendingMachineController controller = 
           ctx.getBean("controller", VendingMachineController.class);
        controller.run();
    }
}