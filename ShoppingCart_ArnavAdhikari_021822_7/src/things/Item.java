package things;

class Item {
    private String name;
    private double price;

    public Item()
    {
      this.name = "";
      this.price = 0.0;
    }

    public Item(String name, double price) {
            this.name = name;
            this.price = price;
    }

    public double getPrice() {
            return price;
    }

    public String valueToString(double value) {
            String result = "" + Math.abs(value);
            if(result.indexOf(".") == result.length() - 2) {
                result += "0";
            }
            result = "$" + result;
            return result;
    }

    public String toString() {
            return name + " " + valueToString(price);
    }
}
   