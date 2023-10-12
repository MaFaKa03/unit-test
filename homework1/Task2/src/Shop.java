import java.util.List;
import java.util.stream.IntStream;

public class Shop {
    private List<Product> allProductsInShop;

    public Shop(List<Product> allProductsInShop) {
        this.allProductsInShop = allProductsInShop;
    }
    public Shop(){}

    public List<Product> getAllProductsInShop() {
        return allProductsInShop;
    }

    public void setAllProductsInShop(List<Product> allProductsInShop) {
        this.allProductsInShop = allProductsInShop;
    }

    public List<Product> sortProductsByPrice(){
        List<Product> sortedList = allProductsInShop;
        while (!isSorted(sortedList)) {
            for (int i = 0; i < sortedList.size() - 1; i++) {
                if (sortedList.get(i).getPrice() > sortedList.get(i + 1).getPrice()) {
                    Product value = sortedList.get(i);
                    sortedList.set(i, sortedList.get(i + 1));
                    sortedList.set(i + 1, value);
                }
            }
        }
        return sortedList;
    }
    private boolean isSorted(List<Product> list){
        if (list.size() == 1)
            return true;
        return IntStream.range(0,list.size()-1).noneMatch(i -> list.get(i).getPrice() > list.get(i+1).getPrice() );
    }
    public Product getMostExpensiveProduct() {
        Product max = null;
        if (allProductsInShop != null) {
            for (int i = 0; i < allProductsInShop.size() - 1; i++) {
                if (allProductsInShop.get(i).getPrice() > allProductsInShop.get(i+1).getPrice())
                    max = allProductsInShop.get(i);
                else max = allProductsInShop.get(i+1);
            }
        }
        return max;
    }

}
