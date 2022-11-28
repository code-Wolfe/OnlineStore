
import java.util.Objects;

public class Item {

    private String product;
    private int qty = 0;
    private int unitPrice;

    public Item(String product, int qty, int unitPrice) {
        this.product = product;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }

    public Item(String product, int unitPrice) {
        this.product = product;
        this.qty ++;
        this.unitPrice = unitPrice;
    }

    public int price() {
        return (this.unitPrice * this.qty);
    }

    public void increaseQuantity() {
        this.qty++;
    }

    public String toString() {
        return (this.product + ": " + this.qty);
    }
    public String getName(){
        return this.product;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.product);
        hash = 97 * hash + this.unitPrice;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Item other = (Item) obj;
        if (this.unitPrice != other.unitPrice) {
            return false;
        }
        if (!Objects.equals(this.product, other.product)) {
            return false;
        }
        return true;
    }


}
