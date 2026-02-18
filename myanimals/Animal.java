package myanimals;

public class Animal {
    int age;
    String name;
    public String makeNoise(){
        return "Animal Noise.";
    }
    public static int numOfAnimals = 0;
    public Animal(){
        this(0, "Animal");
        numOfAnimals += 1;
    }
    public Animal(int age, String name){
        numOfAnimals += 1;
        this.age = age;
        this.name = name;
    }
}
