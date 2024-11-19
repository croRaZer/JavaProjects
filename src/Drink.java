public class Drink {

    private String name;
    private String size;
    private double price;

    /**
     * constants of drink sizes and their prices
     */

    private static final String sizeDrink1 = "Small";
    private static final double priceDrink1 = 0.99;


    private static final String sizeDrink2 = "Medium";
    private static final double priceDrink2 = 1.99;

    private static final String sizeDrink3 = "Large";
    private static final double priceDrink3 = 2.99;


    /**
     * Created a new Drink object.
     * name - initializing a name of drink
     * size  - initializing a size of drink
     * price - initializing a price of drink
     */

    public Drink(String name) {
        this.name = name;
        this.price = 0.0;
    }


    public String getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }

    /**
     * @param drinkSize - represent a size of drink
     */

    public void getDrinkSize(String drinkSize) {
        this.size = drinkSize;
        switch (size.toUpperCase().charAt(0)) {
            case 'S' -> System.out.println(sizeDrink1 + " " + this.name + " cost $" + priceDrink1);
            case 'M' -> System.out.println(sizeDrink2 + " " + this.name + " cost $" + priceDrink2);
            case 'L' -> System.out.println(sizeDrink3 + " " + this.name + " cost $" + priceDrink3);
            default -> System.out.println("Other size of drinks");
        }

        /**
         * assigning the price with priceDrink to get price of each size of drink
         */

        if (price == priceDrink1) {
            price += priceDrink1;
        } else if (price == priceDrink2) {
            price += priceDrink2;
        } else {
            price += priceDrink3;
        }
    }
}
