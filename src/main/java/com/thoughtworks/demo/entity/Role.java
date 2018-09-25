package com.thoughtworks.demo.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "t_role")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String code;

    @ManyToMany
    @JoinTable(
            name = "t_role_privilege",
            inverseJoinColumns =
                    @JoinColumn(name = "privilege_code", referencedColumnName = "code"),
            joinColumns =
                    @JoinColumn(name = "role_code", referencedColumnName = "code")
    )
    private List<Privilege> privileges;

    @OneToOne
    private User user;

    public Role() {
    }

    public Role(String code) {
        this.code = code;
    }
}
