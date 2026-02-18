package myanimals;

public class Dog extends Animal {
    @Override
    public String makeNoise (){
        return "ruff ruff";
    }
    public Dog(int age, String name){
        super(age, name);
    }
}
