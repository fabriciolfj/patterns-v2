package com.github.patterns.factorymethod;

interface Animal {

    void speak();
    void preferredAction();
}

class Dog implements Animal {

    @Override
    public void speak() {
        System.out.println("Dog says: bow-wow.");
    }

    @Override
    public void preferredAction() {
        System.out.println("dog prefer barking ...\n");
    }
}

class Tiger implements Animal {

    @Override
    public void speak() {
        System.out.println("Tiger says: Halum.");
    }

    @Override
    public void preferredAction() {
        System.out.println("Tigers prefer hunting...\n");
    }
}

abstract class AnimalFactory {

    public abstract Animal createAnimal();
}

class DogFactory extends AnimalFactory {

    @Override
    public Animal createAnimal() {
        return new Dog();
    }
}

class TigerFactory extends AnimalFactory {

    @Override
    public Animal createAnimal() {
        return new Tiger();
    }
}

class Simulacao {

    public static void main(String[] args) {
        var dog = new DogFactory()
                .createAnimal();

        dog.speak();
    }
}
