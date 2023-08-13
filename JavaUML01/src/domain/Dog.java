package domain;

public class Dog {
    // attributes
    private String name;
    private Breed breed;
    private short age;
    private short size; // in Kg.
    
    // constructors
    public Dog() {
    }

    public Dog(String name, Breed breed, short age, short size) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.size = size;
    }
     
    // getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Breed getBreed() {
        return breed;
    }

    public void setBreed(Breed breed) {
        this.breed = breed;
    }

    public short getAge() {
        return age;
    }

    public void setAge(short age) {
        this.age = age;
    }

    public short getSize() {
        return size;
    }

    public void setSize(short size) {
        this.size = size;
    }
    
    // toString
    @Override
    public String toString() {
        return "Dog{" + "name=" + name + ", breed=" + breed + ", age=" + age + ", size=" + size + '}';
    }
    
    
}

