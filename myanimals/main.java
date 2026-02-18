package myanimals;

public class main {
    public static void main(String[] args){
        Animal a1 = new Animal(11, "clove");
        System.out.println("Name: " + a1.name + " Age: " + a1.age + " Total animals:" + Animal.numOfAnimals);
        Cat c1 = new Cat(7, "Coffee");
        System.out.println("Name: " + c1.name + " Age: " + c1.age + " Total animals:" + Animal.numOfAnimals);
        Dog d1 = new Dog(2, "Pluto");
        System.out.println("Name: " + d1.name + " Age: " + d1.age + " Total animals:" + Animal.numOfAnimals);
        Cat c2 = new Cat(6, "Java");
        System.out.println("Name: " + c2.name + " Age: " + c2.age + " Total animals:" + Animal.numOfAnimals + " Total Cats: " + Cat.getCatCount());
    }
}
