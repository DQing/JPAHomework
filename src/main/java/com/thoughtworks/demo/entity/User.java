package com.thoughtworks.demo.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "t_user")
public class User {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private String name;
    private String telephoneNumber;

    @OneToOne
    private Role role;

    @OneToMany
    @JoinColumn(name = "user_id")
    private List<Address> addresses;

    public User() {
    }

    public User(String name, String telephoneNumber) {
        this.name = name;
        this.telephoneNumber = telephoneNumber;
    }
}
