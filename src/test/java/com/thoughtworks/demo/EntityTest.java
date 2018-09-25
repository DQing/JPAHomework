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
        Optional<User> user = userRepository.findById(1);
        Role role = user.orElse(null).getRole();
        assertEquals("2", role.getCode());
    }

    @Test
    void should_return_role() {
        Optional<Role> role = roleRepository.findById(1);
        String name = role.get().getUser().getName();
        assertEquals("douqing", name);
    }

    @Test
    void should_create_user() throws NoSuchFieldException {
        User user = new User();

        Arrays.stream(user.getClass().getDeclaredFields()).forEach(item ->{
            if (item.getName().equals("role")) {
                assertEquals(OneToOne.class, item.getAnnotations()[0].annotationType());
            }
        });


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
