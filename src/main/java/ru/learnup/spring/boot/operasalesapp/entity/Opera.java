package ru.learnup.spring.boot.operasalesapp.entity;

import org.springframework.stereotype.Component;

@Component
public class Opera {

    private String name;
    private String description;
    private int age;
    private int seats;

    public Opera(String name, String description, int age, int seats) {
        this.name = name;
        this.description = description;
        this.age = age;
        this.seats = seats;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public String toString() {
        return "Opera{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", age=" + age +
                ", seats=" + seats +
                '}';
    }

    public Opera() {
    }


}
