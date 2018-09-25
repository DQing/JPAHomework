package com.thoughtworks.demo;

import com.thoughtworks.demo.entity.Privilege;
import com.thoughtworks.demo.entity.Role;
import com.thoughtworks.demo.entity.User;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class EntityTest {

    @Test
    void should_create_user() {
        User user = new User();
        assertNotNull(user);
        assertEquals(0, user.getId());
        assertNull(user.getName());
    }

    @Test
    void should_create_role() {
        Role role = new Role();
        assertNotNull(role);
        assertEquals(0,role.getId());
        assertNull(role.getName());
    }

    @Test
    void should_create_privilege() {
        Privilege privilege = new Privilege();
        assertNotNull(privilege);
        assertEquals(0,privilege.getId());
        assertNull(privilege.getCode());
    }
}
