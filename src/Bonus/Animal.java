package Bonus;

abstract public class Animal{
    protected int legs;

    protected Animal(int legs){
        this.legs = legs;
    }

    public void walk(){
        System.out.println("");
    }

    public abstract void eat();

}
