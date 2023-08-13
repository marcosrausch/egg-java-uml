package domain;

public class Person {
    // attributes
    private String firstName;
    private String lastName;
    private short age;
    private String DNI;
    private Dog dog;
    
    // constructors
    public Person() {
    }

    public Person(String firstName, String lastName, short age, String DNI) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.DNI = DNI;
    }
    
    // getters & setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public short getAge() {
        return age;
    }

    public void setAge(short age) {
        this.age = age;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }
    
    // toString
    @Override
    public String toString() {
        return "Person{" + "firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", DNI=" + DNI + ", dog=" + dog + '}';
    }
    
}

