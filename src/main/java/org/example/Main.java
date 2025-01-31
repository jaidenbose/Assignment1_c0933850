package org.example;
// Main class to test the functionality of Person and Dog
public class Main {
    public static void main(String[] args) {
        // Creating a person without a Dog
        Person person = new Person("Jaiden", 22);

        try {
            // Attempt to change the dog's name, expecting an exception
            person.changeDogsName("sumbie");
        } catch (RuntimeException e) {
            // Catch the exception and print an error message
            System.out.println("Unable to change dog's name: " + e.getMessage());
        }
    }
}
