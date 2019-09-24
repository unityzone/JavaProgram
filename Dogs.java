
package inheritance;

public class Dogs extends Animals{

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dogs(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    private void chew() {
        System.out.println("Dog.chew() called");
    }
    
    private void run(){
        System.out.println("Dog.run() is called! ");
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat() called");
        chew();
        super.eat();
    }
    
    @Override
    public void move() {
        System.out.println("dog.move() is called!");
        run();
        super.move();
    }
}
    
