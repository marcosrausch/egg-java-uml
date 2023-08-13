package javauml01;

import domain.Breed;
import domain.Dog;
import domain.Person;

public class Main {

    public static void main(String[] args) {
    
        Dog procer = new Dog("Procer", Breed.COLLIE, (short)3, (short)10);
        Dog ayudanteDeSanta = new Dog("Ayudante de Santa", Breed.GREYHOUND, (short)6, (short)8);
    
        Person bart = new Person("Bart", "Simpson", (short)10, "unknown");
        
        Person mitchell = new Person("Mitchell", "unknown", (short)41, "unknown");
    
        bart.setDog(ayudanteDeSanta);
        mitchell.setDog(procer);
        
        System.out.println(bart.toString());
        System.out.println(mitchell.toString());
    }
    
}
