package org.example;
import java.util.Objects;

// Class representing a Dog with name and age attributes
public class Dog {
    private String name;
    private Integer age;

    // Constructor to initialize Dog object
    public Dog(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    // Getter method for dog's name
    public String getName() {
        return name;
    }

    // Setter method for dog's name
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for dog's age
    public Integer getAge() {
        return age;
    }

    // Setter method for dog's age
    public void setAge(Integer age) {
        this.age = age;
    }

    // Override equals method for object comparison
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Dog dog = (Dog) obj;
        return Objects.equals(name, dog.name) && Objects.equals(age, dog.age);
    }

    // Override hashCode method
    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}

