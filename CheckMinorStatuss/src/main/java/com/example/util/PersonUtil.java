package com.example.util;

public class PersonUtil
{
    public static int calculateBirthYear(int age) {
        return java.time.Year.now().getValue() - age;
    }
}
