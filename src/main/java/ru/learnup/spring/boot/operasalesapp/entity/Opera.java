package ru.learnup.spring.boot.operasalesapp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Entity
@Table(name = "Operas")
@Data

public class Opera {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "description")
    private String description;
    @Column(name = "age")
    private int age;
    @Column(name = "seats")
    private int seats;


    public Opera(String name, String description, int age, int seats) {
        this.name = name;
        this.description = description;
        this.age = age;
        this.seats = seats;
    }

    public Opera() {

    }
}
