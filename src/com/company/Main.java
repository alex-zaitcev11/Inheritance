package com.company;

class Person {
    private String name;
    private String surname;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Person(String name, String surname, Integer age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
}
class Employee extends Person {
    private Integer inn;
    private Integer salary;

    public Employee(String name, String surname, Integer age, Integer inn, Integer salary) {
        super(name, surname, age);
        this.inn = inn;
        this.salary = salary;
    }

    public Integer getInn() {
        return inn;
    }

    public void setInn(Integer inn) {
        this.inn = inn;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }
}
class Developer extends Employee {
    private String level;

    public Developer(String name, String surname, Integer age, Integer inn, Integer salary, String level) {
        super(name, surname, age, inn, salary);
        this.level = level;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
}
public class Main {

    public static void main(String[] args){
    Developer developer1 = new Developer("Alex", "Zaitcev", 19, 3456721, 20000, "Trainee");
    Developer developer2 = new Developer("Vlad", "Bagach", 20, 3567123, 30000, "Junior");
        System.out.println(developer1.getName() + " " + developer1.getSurname() + " " + developer1.getAge() + " " + developer1.getInn() + " " + developer1.getSalary() + " " + developer1.getLevel());
        System.out.println(developer2.getName() + " " + developer2.getSurname() + " " + developer2.getAge() + " " + developer2.getInn() + " " + developer2.getSalary() + " " + developer2.getLevel());
    }
}
