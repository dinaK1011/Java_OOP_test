package Bonus;

public class Fish extends Animal implements Pet{
    private String name;

    public Fish() {
        super(0);
    }

    @Override
    public String getName(){
        return name;
    }

    @Override
    public void setName(String name){
    this.name = name;
    }

    @Override
    public void play(){
        System.out.println(name + " plays with his reflection in the tank");
    }

    @Override
    public void walk(){
        System.out.println("the fish only swims");
    }

    @Override
    public void eat(){
        System.out.println("The fish eats a smaller fishes");
    }
}
