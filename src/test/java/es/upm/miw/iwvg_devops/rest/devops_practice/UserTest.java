package es.upm.miw.iwvg_devops.rest.devops_practice;

import es.upm.miw.iwvg_devops.devops_practice.User;
import org.apache.commons.lang3.math.Fraction;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTest {

    private User user;
    private User user2;

    @BeforeEach
    void before() {
        List<Fraction> fractions = new ArrayList<>();
        this.user = new User("0", "Daniel", "Gallardo", fractions);
    }

    @Test
    void testUserId() {
        assertEquals(0, user.getId());
    }

    @Test
    void testUserName() {
        assertEquals("Daniel", user.getName());
    }

    @Test
    void testUserFamilyName() {
        assertEquals("Gallardo", user.getFamilyName());
    }

    @Test
    void testUserFractions() {
        assertEquals(null, user.getFractions());
    }

    @Test
    void testEmptyConstructor() {
        user = new User();
        assertEquals(null, user.getFractions());
    }

    @Test
    void testSetName() {
        user = new User();
        user.setName("Daniel");
        assertEquals("Daniel", user.getName());
    }

    @Test
    void testSetFamilyName() {
        user = new User();
        user.setFamilyName("Gallardo");
        assertEquals("Gallardo", user.getFamilyName());
    }

    @Test
    void testSetFractions() {
        user = new User();
        user.setFractions(null);
        assertEquals(null, user.getFractions());
    }
/*
    @Test
    void testAddFraction() {
        user = new User();
        Fraction fraction = new Fraction();
        user.addFraction(fraction);
        assertEquals(fraction, user.getFractions().get(0));
    }

 */

    @Test
    void testFullName() {
        user = new User();
        user.setName("Daniel");
        user.setFamilyName("Gallardo");
        assertEquals("Daniel Gallardo", user.fullName());
    }

    @Test
    void testInitials() {
        user = new User();
        user.setName("Daniel");
        assertEquals("Da.", user.initials());
    }
}
