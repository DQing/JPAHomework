package com.thoughtworks.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "t_privilege")
public class Privilege {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String code;

    private String name;

    public Privilege() {
    }

    public Privilege(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }
}
