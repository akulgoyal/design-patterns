package com.akulgoyal.creational.builder;

public class Employee {

    private final String id;
    private final String name;
    private final String dept;
    private final String phone;

    private Employee(String id, String name, String dept, String phone) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.phone = phone;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDept() {
        return dept;
    }

    public String getPhone() {
        return phone;
    }

    static class Builder {
        private String id;
        private String name;
        private String dept;
        private String phone;

        public Builder() {
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setDept(String dept) {
            this.dept = dept;
            return this;
        }

        public Builder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public Employee build() {
            return new Employee(id, name, dept, phone);
        }
    }
}
