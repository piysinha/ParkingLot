package OOPS.AbstractionDemo;

public class Dog extends Animal{
    public String breed;

    Dog(String dogName){
        this.name = dogName;
        breed = "Golden Retriver";
    }

    public void makeSound(){
        System.out.println(name + " is making bark sound");
    }


}
