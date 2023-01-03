package org.example;
import java.util.Map;

public class Basket {
    public Purchase[] purchases = new Purchase[Products.getProducts().size()]; //Магическое число 4 убрано!
    // Теперь при добавлении еще товара в ассортимент ничего не сломается

    public void addPurchase(String title, int count) {
        for (int i = 0; i < purchases.length; i++) {
            if (purchases[i] == null) {
                purchases[i] = new Purchase(title, count);
                return;
            }
            if (purchases[i].title.equals(title)) {
                purchases[i].count += count;
                return;
            }
        }
    }

    //Метод подсчета корзины
    public long sum(Map<String, Integer> prices) {
        long sum = 0;
        System.out.println("Корзина: ");
        for (int i = 0; i < purchases.length; i++) {
            Purchase purchase = purchases[i];
            if (purchase == null) continue;
            System.out.println("\t" + purchase.title + " " + purchase.count + " шт. в сумме " + (purchase.count * prices.get(purchase.title)) + " руб.");
            sum += purchase.count * prices.get(purchase.title);
        }
        return sum;
    }

}
