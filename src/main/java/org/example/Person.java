package org.example;
import java.util.Optional;

// Class representing a Person with optional Dog ownership
public class Person {
    private String name;
    private Integer age;
    private Optional<Dog> dog;

    // Constructor without a Dog
    public Person(String name, Integer age) {
        this(name, age, null);
    }

    // Constructor with a Dog
    public Person(String name, Integer age, Dog dog) {
        this.name = name;
        this.age = age;
        this.dog = Optional.ofNullable(dog);
    }

    // Getter for person's name
    public String getName() {
        return name;
    }

    // Setter for person's name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for person's age
    public Integer getAge() {
        return age;
    }

    // Setter for person's age
    public void setAge(Integer age) {
        this.age = age;
    }

    // Getter for optional Dog
    public Optional<Dog> getDog() {
        return dog;
    }

    // Setter for Dog ownership
    public void setDog(Dog dog) {
        this.dog = Optional.ofNullable(dog);
    }

    // Checks if the person owns a dog and if it's old (>=10 years)
    public boolean hasOldDog() {
        return dog.map(d -> d.getAge() >= 10).orElse(false);
    }

    // Changes the Dog's name if the person owns a Dog, otherwise throws an exception
    public void changeDogsName(String newName) {
        dog.map(d -> { d.setName(newName); return d; })
                .orElseThrow(() -> new RuntimeException("Because, " + this.name + " does not own a dog!😶‍🌫️"));
    }
}

