package things;
import java.util.*;

class ShoppingCart
{
    private ArrayList<Item> order;
    private double total;
    private double internalDiscount;

    public ShoppingCart()
    {
        order = new ArrayList<Item>();
        total = 0.0;
        internalDiscount = 0.0;
    }

    public void add(Item i) {
        order.add(i);
        total += i.getPrice();
        if (i instanceof DiscountedItem)
           internalDiscount += ((DiscountedItem) i).getDiscount();
    }

   /** printOrder() will call toString() to print */
    public void printOrder() {
        System.out.println(this);
    }

    public String toString() {
        return discountToString();
    }

    public String discountToString() {
        return orderToString() + "\nSub-total: " + valueToString(total) + "\nDiscount: " + valueToString(internalDiscount) + "\nTotal: " + valueToString(total - internalDiscount);
    }

    private String valueToString(double value) {
        value = Math.rint(value * 100) / 100.0;
        String result = "" + Math.abs(value);
        if(result.indexOf(".") == result.length() - 2) {
            result += "0";
        }
        result = "$" + result;
        return result;
    }

    public String orderToString() {
        String build = "\nOrder Items:\n";
        for(int i = 0; i < order.size(); i++) {
            build += "   " + order.get(i);
            if(i != order.size() - 1) {
                build += "\n";
            }
        }
        return build;
    }
  }
