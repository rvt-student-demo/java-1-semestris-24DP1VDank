package rvt;

import java.util.ArrayList;

public class Person_and_subclasses {
    public static void main(String[] args) {
        Teacher ada = new Teacher("Ada Lovelace", "24 Maddox St. London W1S 2QN", 1200);
        Teacher esko = new Teacher("Esko Ukkonen", "Mannerheimintie 15 00100 Helsinki", 5400);
        System.out.println(ada);
        System.out.println(esko);

        Student ollie = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");

        int i = 0;
        while (i < 25) {
            ollie.study();
            i++;
        }
        System.out.println(ollie);

        ArrayList<Person> persons = new ArrayList<>();
        persons.add(ada);
        persons.add(ollie);

        printPersons(persons);
    }

    public static void printPersons(ArrayList<Person> persons) {
        for (Person p : persons) {
            System.out.println(p);
        }
    }
}

class Person {
    protected String fullname;
    protected String address;

    public Person(String fullname, String address) {
        this.fullname = fullname;
        this.address = address;
    }

    @Override
    public String toString() {
        return fullname + "\n  " + address;
    }
}

class Student extends Person {
    private int credits;

    public Student(String fullname, String address) {
        super(fullname, address);
        credits = 0;
    }

    public void study() {
        credits++;
    }

    public int credits() {
        return credits;
    }

    @Override
    public String toString() {
        return super.toString() + "\n  Study credits " + credits;
    }
}

class Teacher extends Person {
    private int salary;

    public Teacher(String fullname, String address, int salary) {
        super(fullname, address);
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + "\n  salary " + salary + " euro/month";
    }
}
