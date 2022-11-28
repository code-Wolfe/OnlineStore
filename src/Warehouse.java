import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Warehouse {

    private final Map<String,Integer> map;
    private final Map<String,Integer> stock;

    public Warehouse(){
        map = new HashMap<>();
        stock = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock){
        map.put(product, price);
        this.stock.put(product, stock);


    }

    public int price(String product){
        if(!map.containsKey(product)){
            return -99;
        }

        return map.get(product);
    }

    /*
    public int stock(String product){
        if(!map.containsKey(product)){
            return 0;
        }
        return this.stock.get(product);
    }
    */

    public boolean take(String product){
        if((!stock.containsKey(product)) || stock.get(product) == 0){
            return false;
        }
        int newStock = stock.get(product)-1;
        stock.put(product, newStock);
        return true;
    }

    public Set<String> products(){
        return map.keySet();


    }

}