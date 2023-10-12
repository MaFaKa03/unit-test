import java.util.ArrayList;
import java.util.List;

public class TestShop {
    public static void main(String[] args) {
        Product apple = new Product("Golden",100.5);
        Product pear = new Product("beautiful", 0);
        Product kiwi = new Product("fresh", -100);
        Product ginger = new Product("root", 350);
        Product orange = new Product(null, 350);
        Product pommel = new Product("red", 400);
        Product lemon = new Product("yellow", -0);
        Shop shop = new Shop();
        List<Product> products = new ArrayList<>();
        products.add(apple);
        products.add(pear);
        products.add(kiwi);
        products.add(ginger);
        products.add(orange);
        products.add(pommel);
        products.add(lemon);
        shop.setAllProductsInShop(products);
        for (int i = 0; i < shop.getAllProductsInShop().size(); i++) {
            System.out.println(shop.getAllProductsInShop().get(i).toString());
        }
        shop.sortProductsByPrice();
        System.out.println();
        for (int i = 0; i < shop.getAllProductsInShop().size(); i++) {
            System.out.println(shop.getAllProductsInShop().get(i).toString());
        }
        System.out.println();
        System.out.println(shop.getMostExpensiveProduct());
        Shop shopTest = new Shop();
        List<Product> testList = new ArrayList<>();
        shopTest.setAllProductsInShop(testList);//проверяю поведение методов при пустом листе
        shopTest.sortProductsByPrice();
        System.out.println(shopTest.getMostExpensiveProduct());
    }
}
