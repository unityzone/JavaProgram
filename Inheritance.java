
package inheritance;

public class Inheritance {

    public static void main(String[] args) {
        Animals animal = new Animals("Animal", 1, 1, 5, 5);

        Dogs dog = new Dogs("Yorkie", 8, 20, 2, 4, 1, 20, "long silky");
        dog.eat();
        System.out.println("............................");
        dog.move();

    }
    
}
