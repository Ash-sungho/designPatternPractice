package creational.templete.practice5;

public abstract class CaffeineBeverage {

    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (CustomerWantsCondiments()) {
            addCondiments();
        }

    }

    public void boilWater() {
        System.out.println("물 끓이기");
    }

    public void pourInCup() {
        System.out.println("컵에 따르는 중");
    }

    abstract void addCondiments();

    abstract void brew();

    //  hook method
    boolean CustomerWantsCondiments() {
        return false;
    }

    ;
}
