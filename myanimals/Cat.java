package myanimals;

public class Cat extends Animal{
    @Override
    public String makeNoise (){
        return "Meow meow meow";
    }
    public Cat(int age, String name){
        super(age, name);
        catCount++;
        livesRemaining = MAX_LIVES;
    }
    /* Below is from the video Static vs Non-Static Variables and Methods In Java - Full Simple Tutorial
        The link is https://www.youtube.com/watch?v=-Y67pdWHr9Y
     */
    public static final int MAX_LIVES = 9;
    private static int catCount = 0;
    int livesRemaining;
    public Cat () {
        catCount++;
        livesRemaining = MAX_LIVES;
    }
    public static int getCatCount(){
        return catCount;
    }
}
