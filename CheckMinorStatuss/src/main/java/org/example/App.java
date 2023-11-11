package org.example;

import com.example.model.Person;
import com.example.service.PersonService;

public class App {
    public static void main(String[] args) {
        Person person = new Person("Alice", 30);
        PersonService personService = new PersonService();
        personService.displayBirthYearOfPerson(person);
        personService.checkMinorStatus(person);
    }
}