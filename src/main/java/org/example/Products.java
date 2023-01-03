package org.example;
import java.util.HashMap;
import java.util.Map;

public class Products {
    private static HashMap<String, Integer> products = new HashMap<>();
    //Разделяй и властвуй...
    //Тут хранятся все товары имеющиеся в ассортименте
    static {
        products.put("Хлеб", 56);
        products.put("Масло", 153);
        products.put("Колбаса", 211);
        products.put("Пирожок", 45);
    }
    //Метод вывода в консоль ассортимента продуктов
    public static void productsAssortment() {
        System.out.println("Ассортимент товаров: ");
        for (Map.Entry<String, Integer> productAndPrice : products.entrySet()) {
            System.out.println(productAndPrice.getKey() + " за " + productAndPrice.getValue() + " руб./шт.");
        }
    }

    public static HashMap<String, Integer> getProducts() {
        return products;
    }
}
