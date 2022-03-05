class Animal {
    public void eat() {
        System.out.println("Eat Method");
    }

    public void sleep() {
        System.out.println("Sleep method");
    }

}

class Bird extends Animal {
    @Override
    public void eat() {
        super.eat();
        System.out.println("override eat method");
    }

    @Override
    public void sleep() {
        super.sleep();
        System.out.println("override sleep method ");
    }
    public void fly(){
        System.out.println("fly method");
    }
}

public class NewClass2 {
    public static void main(String[] args) {
        Animal a = new Animal();
        Bird b = new Bird();
        a.eat();
        a.sleep();
        b.eat();
        b.sleep();
        b.fly();



    }
}
