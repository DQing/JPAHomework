package com.thoughtworks.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "t_user")
public class User {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private String name;
    private String telephoneNumber;

    public User() {
    }

    public User(String name, String telephoneNumber) {
        this.name = name;
        this.telephoneNumber = telephoneNumber;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }
}
