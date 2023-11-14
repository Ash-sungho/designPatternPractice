package creational.templete.practice4;

public abstract class Higher {

    public void print(int num) {
        System.out.println("num = " + num);
    }

    abstract int calculate(int n1, int n2);

}

