public class Main {
}
class Dog extends Main {
    private void eat()
    {
        System.out.println("Dog is  Eating  meat");
    }

    public static void main(String[] args)
    {
        Dog obj1 = new Dog();
        obj1.eat();
    }
}