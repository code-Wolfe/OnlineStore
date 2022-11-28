import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<Item> items;

    public ShoppingCart() {
        items = new ArrayList<>();
    }

    public void add(String product, int price) {

        Item newItem = new Item(product, price);
        boolean found = false;

        for(Item i: items){
            if(i.equals(newItem)){
                i.increaseQuantity();
                found = true;
            }
        }

        if(!found){
            items.add(newItem);
        }

        /*
        if (items.contains(newItem)) {
            for (Item i : items) {
                if (i.getName().equals(product)) {
                    i.increaseQuantity();
                }
            }
        } else {
            items.add(newItem);
        }
        */

    }

    public int price() {
        int total = 0;

        for (Item i : items) {
            total += i.price();
        }

        return total;
    }

    public void print() {
        for (Item i : items) {
            System.out.println(i);;
        }
    }

}
