package Bonus;

public class Spider extends Animal{

    public Spider(){
        super(8);
    }

    @Override
    public void eat(){
        System.out.println("THe spider eats smaller insects");
    }
}
