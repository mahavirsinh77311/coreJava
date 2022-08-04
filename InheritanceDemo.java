package com.topics.coreJava;

/** 
 * Represents the Inheritance
 * Animal class have its child classes like Dog, Cow, Hippo.
 * @author mahavirsinh parmar
 * @version 1.8
 */
class Animal {
	
    public void printAnimal() {
        System.out.println("Class Animal");
    }
    
}

/** 
 * Represents the Inheritance
 * Dog class extends the Animal class which shows single level inheritance
 * @author mahavirsinh parmar
 * @version 1.8
 */
class Dog extends Animal {
	
    public void printDog() {
        System.out.println("Class Dog");
    }
    
}

/** 
 * Represents the Inheritance
 * Cow class extends the Animal class so class Dog and Cow shows Hierarchical inheritance
 * @author mahavirsinh parmar
 * @version 1.8
 */
class Cow extends Animal {
	
    public void printCow() {
        System.out.println("Class Cow");
    }
    
}

/** 
 * Represents the Inheritance
 * Hippo class extends the Animal class so class Dog, Cow, and Hippo shows Hierarchical inheritance
 * @author mahavirsinh parmar
 * @version 1.8
 */
class Hippo extends Animal {
	
    public void printHippo() {
        System.out.println("Class Hippo");
    }
    
}

/** 
 * Represents the Inheritance
 * SmallHippo class extends the Hippo class which extends Animal class so class SmallHippo, Hippo, and Animal shows multilevel inheritance
 * @author mahavirsinh parmar
 * @version 1.8
 */
class SmallHippo extends Hippo {
	
    public void printSmallHippo() {
        System.out.println("Class SmallHippo");
    }
    
}

public class InheritanceDemo {

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.printAnimal();
        dog.printDog();

        Cow cow = new Cow();
        cow.printAnimal();
        cow.printCow();

        Hippo hippo = new Hippo();
        hippo.printAnimal();
        hippo.printHippo();

        SmallHippo smallHippo = new SmallHippo();
        smallHippo.printAnimal();
        smallHippo.printHippo();
        smallHippo.printSmallHippo();

    }

}