package student.fix;
	
public class MallardDuck implements Duck {
	
    private QuackBehavior quackBehavior;
    private FlyBehavior flyBehavior;
    
    public MallardDuck(QuackBehavior quackBehavior, FlyWithWings flyBehavior) {
        this.quackBehavior = quackBehavior;
        this.flyBehavior = flyBehavior;
    }
	
    @Override
    public final void display() {
	System.out.println("I'm a Mallard Duck");
    }

    public final QuackBehavior getQuackBehavior() {
        return quackBehavior;
    }

    @Override
    public final void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public final FlyBehavior getFlyBehavior() {
        return flyBehavior;
    }

    @Override
    public final void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }
    
    @Override
    public final void performQuack(){
        quackBehavior.quack();
    }
	
    @Override
    public final void performFly(){
        flyBehavior.fly();
    }
}
