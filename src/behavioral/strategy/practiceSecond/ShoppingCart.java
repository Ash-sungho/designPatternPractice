package behavioral.strategy.practiceSecond;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<Item> items;

    public ShoppingCart(){
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void pay(PaymentStrategy paymentMethod){
        int amount = 0 ;

        for (Item item: items) {
            amount += item.getPrice();
        }
        paymentMethod.pay(amount);

    }


}
