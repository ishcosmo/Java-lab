package Assignment8;

import java.io.*;


class Person implements Serializable {
    private static final long serialVersionUID = 1L; 
    private String name;
    private int age;

    
    public Person(String name, int age) {
        this.name = name;
    this.age = age;
    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class q5 {
    public static void main(String[] args) {
       
        Person p1 = new Person("Ishita", 20);

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.txt"))) {
            oos.writeObject(p1);
            System.out.println("Serialization successful: " + p1);
        } catch (IOException e) {
            System.err.println("Error during serialization: " + e.getMessage());
        }

        
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.txt"))) {
            Person deserializedPerson = (Person) ois.readObject();
            System.out.println("Deserialization successful: " + deserializedPerson);

            
            if (p1.getName().equals(deserializedPerson.getName()) &&
                p1.getAge() == deserializedPerson.getAge()) {
                System.out.println("The deserialized object has the same field values.");
            } else {
                System.out.println("The deserialized object does not match the original.");
            }
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error during deserialization: " + e.getMessage());
        }
    }
}
