package mystuff;

public class Driver{
    public static void main(String[] args) {
        MyStuff fridge = new MyStuff();
        fridge.weight = 500.4;
        fridge.isOpen = false;
        fridge.isFull = true;
        fridge.price = 1799;
        fridge.brand = "LG";
        System.out.println("The fridge costs " + fridge.price + " and weigh " + fridge.weight + " lbs.");
        System.out.println("It costs " + fridge.price + " dollars and its from " + fridge.brand + ".");
        System.out.println("It is " + fridge.isFull + " that the fridge is full, and is " + fridge.isOpen + " that the fridge door is open.");

    }
}