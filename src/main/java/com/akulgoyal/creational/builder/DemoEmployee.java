package com.akulgoyal.creational.builder;

import java.util.UUID;

public class DemoEmployee {

    public static void main(String args[]) {

        Employee employee = new Employee.Builder()
                .setId(UUID.randomUUID().toString())
                .setDept("IT")
                .setName("Akul")
                .setPhone("+91-9999999999")
                .build();

        System.out.println("Employee id: " + employee.getId());
        System.out.println("Employee name: " + employee.getName());
        System.out.println("Employee works in " + employee.getDept() + " department");
        System.out.println("Employee's mobile number: " + employee.getPhone());
    }
}
