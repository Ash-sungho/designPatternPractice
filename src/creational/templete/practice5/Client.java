package creational.templete.practice5;

public class Client {
    public static void main(String[] args) {

        CaffeineBeverage coffee = new Coffee();
        System.out.println("커피 만드는중...");
        coffee.prepareRecipe();

        System.out.println("\n--------------------------------\n");

        CaffeineBeverage tea = new Tea();
        System.out.println("홍차 만드는중...");
        tea.prepareRecipe();
    }
}
