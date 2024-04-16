package OOPS.AbstractionDemo;

public class Animal {
    public String name;
    Animal(){

    }
    Animal (String givenName){
        this.name = givenName;
    }

    public void sleep (){
        System.out.println(name+" is Sleeping");
    }

}
