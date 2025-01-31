import org.example.Dog;
import org.example.Person;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Optional;

class PersonTest {
    @Test
    void testPersonWithoutDog() {
        Person person = new Person("Liam", 30);
        assertEquals("Liam", person.getName());
        assertEquals(30, person.getAge());
        assertFalse(person.getDog().isPresent());
    }

    @Test
    void testPersonWithDog() {
        Dog dog = new Dog("Suzy", 3);
        Person person = new Person("Liam", 30, dog);
        assertTrue(person.getDog().isPresent());
        assertEquals("Suzy", person.getDog().get().getName());
    }

    @Test
    void testHasOldDog() {
        Dog oldDog = new Dog("Max", 12);
        Person person = new Person("Liam", 30, oldDog);
        assertTrue(person.hasOldDog());
    }

    @Test
    void testHasYoungDog() {
        Dog youngDog = new Dog("Suzy", 3);
        Person person = new Person("Liam", 30, youngDog);
        assertFalse(person.hasOldDog());
    }

    @Test
    void testChangeDogsName() {
        Dog dog = new Dog("Suzy", 3);
        Person person = new Person("Liam", 30, dog);
        person.changeDogsName("Milo");
        assertEquals("Milo", person.getDog().get().getName());
    }

    @Test
    void testChangeDogsNameWithoutDog() {
        Person person = new Person("Liam", 30);
        Exception exception = assertThrows(RuntimeException.class, () -> {
            person.changeDogsName("Milo");
        });
        assertEquals("Because, Liam does not own a dog!😶‍🌫️", exception.getMessage());
    }
}