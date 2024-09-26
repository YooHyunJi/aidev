package kr.co.shinhands.edu.aidev;

public class Person {
    private String name;
    private int age;
    private String address;
    private String phone;
    private String email;

    // constructor

    public Person(String name, int age) {
        if (name.isEmpty()) {
            throw new NullPointerException("Name cannot be null");
        }
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
        this.name = name;
        this.age = age;
    }

    // toString

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


    // getter and setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty()) {
            throw new NullPointerException("Name cannot be null");
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

