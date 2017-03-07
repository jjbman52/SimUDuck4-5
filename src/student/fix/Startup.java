package student.fix;

public class Startup {
    public static void main(String[] args) {
        Duck duck = new MallardDuck(new Quack(), new FlyWithWings());
        
        duck.display();
        duck.performFly();
        duck.performQuack();
        System.out.println("Change in fly bahavior...");
        duck.setFlyBehavior(new FlyRocketPowered());
        duck.performFly();
    }
}
