package com.thoughtworks.demo;

import com.thoughtworks.demo.entity.Privilege;
import com.thoughtworks.demo.entity.Role;
import com.thoughtworks.demo.entity.User;
import com.thoughtworks.demo.repository.RoleRepository;
import com.thoughtworks.demo.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.persistence.OneToOne;
import java.lang.reflect.AnnotatedType;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class EntityTest {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Test
    void should_return_user() {
        User user = userRepository.findById(1).get();
        Role role = user.getRole();
        assertEquals("2", role.getCode());
    }

    @Test
    void should_return_role() {
        Role role = roleRepository.findById(1).get();
        String name = role.getUser().getName();
        assertEquals("douqing", name);
    }

    @Test
    void should_use_reflect() throws NoSuchFieldException {
        User user = new User();

        Field role = user.getClass().getDeclaredField("role");
        assertEquals(OneToOne.class, role.getAnnotations()[0].annotationType());
    }

    @Test
    void should_create_user() {
        User user = new User();

        assertNotNull(user);
        assertEquals(0, user.getId());
        assertNull(user.getName());
        assertNull(user.getRole());
    }

    @Test
    void should_create_role() {
        Role role = new Role();
        assertNotNull(role);
        assertEquals(0,role.getId());
    }

    @Test
    void should_create_privilege() {
        Privilege privilege = new Privilege();
        assertNotNull(privilege);
        assertEquals(0,privilege.getId());
        assertNull(privilege.getCode());
    }
}
