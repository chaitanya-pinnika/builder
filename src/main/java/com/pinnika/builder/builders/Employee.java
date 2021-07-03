package com.pinnika.builder.builders;
public class Employee
{
    private final String firstName;
    private final String lastName;
    private final int age;
    private final int id;
    private final String phone;
    private final String address;
    private final String mail;

    private Employee(EmployeeBuilder employeeBuilder)
    {
        this.firstName = employeeBuilder.firstName;
        this.lastName = employeeBuilder.lastName;
        this.age = employeeBuilder.age;
        this.id = employeeBuilder.id;
        this.phone = employeeBuilder.phone;
        this.address = employeeBuilder.address;
        this.mail = employeeBuilder.mail;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public String getMail() {
        return mail;
    }

    

    @Override
    public String toString() {
        return "Employee [address=" + address + ", age=" + age + ", firstName=" + firstName + ", id=" + id
                + ", lastName=" + lastName + ", mail=" + mail + ", phone=" + phone + "]";
    }



    public static class EmployeeBuilder{
        private final String firstName;
        private final String lastName;
        private final int age;
        private final int id;
        private String phone="";
        private String address="";
        private String mail="";

        public EmployeeBuilder(String firstName,String lastName,int age,int id)
        {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.id = id;
        }

        public EmployeeBuilder withPhone(String phone)
        {
            this.phone = phone;
            return this;
        }

        public EmployeeBuilder withAddress(String address)
        {
            this.address = address;
            return this;
        }

        public EmployeeBuilder withMail(String mail)
        {
            this.mail = mail;
            return this;
        }

        public Employee build()
        {
            return new Employee(this);
        }

    }
}