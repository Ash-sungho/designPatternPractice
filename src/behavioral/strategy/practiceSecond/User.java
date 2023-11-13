package behavioral.strategy.practiceSecond;

public class User {
    public static void main(String[] args) {
        // 쇼핑카트 전략 컨텍스트 등록
        ShoppingCart cart = new ShoppingCart();

        // 쇼핑 물품
        Item A = new Item("맥북 프로", 10000);
        Item B = new Item("플레이스테이션", 30000);
        cart.addItem(A);
        cart.addItem(B);

        // LUNACard로 결제 전략 실행
        cart.pay(new LUNACardStrategy("andykr12@example.com", "pukubababo")); // 4000원 paid using LUNACard.

        // KAKACard로 결제 전략 실행
        cart.pay(new KAKAOCardStrategy("sungho", "123456789", "123", "12/01")); // 4000원 paid using KAKAOCard.
    }
}
