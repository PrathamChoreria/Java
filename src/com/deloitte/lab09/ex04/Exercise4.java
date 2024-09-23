package com.deloitte.lab09.ex04;

public class Exercise4 {
	public static void main(String[] args) {
        PersonFactory personFactory = Person::new;

        Person person1 = personFactory.create("Vettel", 5);
        Person person2 = personFactory.create("lewis", 44);

        System.out.println(person1); 
        System.out.println(person2);  
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}

interface PersonFactory {
    Person create(String name, int age);
}


