package kr.co.shinhands.edu.aidev;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Test;

public class PersonTest {

    @Test
    public void testPersonConstructorAndGetters() {
        Person person = new Person("John Doe", 30);
        assertEquals("John Doe", person.getName());
        assertEquals(30, person.getAge());
    }

    @Test
    public void testSetName() {
        Person person = new Person("Jane Doe", 25);
        person.setName("Jane Smith");
        assertEquals("Jane Smith", person.getName());
    }

    @Test
    public void testSetAge() {
        Person person = new Person("Bob", 40);
        person.setAge(41);
        assertEquals(41, person.getAge());
    }

    @Test
    public void testToString() {
        Person person = new Person("Alice", 35);
        assertEquals("Person{name='Alice', age=35}", person.toString());
    }

    @Test
    public void testConstructorWithNullName() {
        assertThrows(NullPointerException.class, () -> new Person(null, 20));
    }

    @Test
    public void testConstructorWithNegativeAge() {
        assertThrows(IllegalArgumentException.class, () -> new Person("Test", -1));
    }

    @Test
    public void testSetNameWithNull() {
        Person person = new Person("Test", 25);
        assertThrows(NullPointerException.class, () -> person.setName(null));
    }

    @Test
    public void testSetAgeWithNegativeValue() {
        Person person = new Person("Test", 25);
        assertThrows(IllegalArgumentException.class, () -> person.setAge(-5));
    }
}