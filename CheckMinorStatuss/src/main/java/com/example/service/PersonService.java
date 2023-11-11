package com.example.service;
import com.example.model.Person;
import com.example.util.PersonUtil;

import java.sql.SQLOutput;

public class PersonService {
    public void displayBirthYearOfPerson(Person person){
        int BirthYear = PersonUtil.calculateBirthYear(person.getAge());
        System.out.println(person.getName() + "|" + "Was born in the year" + "|" + BirthYear);
    }
    public void checkMinorStatus(Person person){
        if(person.getAge()<18) {
            System.out.println(person.getName() + "is a minor.");
        }
        else{
            System.out.println(person.getName() +"|" + "is an adult");

        }
    }
}