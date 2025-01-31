import org.example.Dog;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Optional;

// DogTest.java
class DogTest {
    @Test
    void testDogInitialization() {
        Dog dog = new Dog("Suzy", 3);
        assertEquals("Suzy", dog.getName());
        assertEquals(3, dog.getAge());
    }

    @Test
    void testSetDogName() {
        Dog dog = new Dog("Suzy", 3);
        dog.setName("Milo");
        assertEquals("Milo", dog.getName());
    }

    @Test
    void testSetDogAge() {
        Dog dog = new Dog("Suzy", 3);
        dog.setAge(6);
        assertEquals(6, dog.getAge());
    }

    @Test
    void testDogEquality() {
        Dog dog1 = new Dog("Suzy", 3);
        Dog dog2 = new Dog("Suzy", 3);
        assertEquals(dog1, dog2);
    }
}