public class Burger {

    private String name;
    private double basePrice;
    private double finalPrice;

    private String addition1;
    private double addition1Price;

    private String addition2;
    private double addition2Price;

    private String addition3;
    private double addition3Price;

    /**
     * Creating a new Burger object and initializing fields.
     *
     * @param name      - initialize a name of burger
     * @param basePrice - initialize a base price of burger
     *                  finalPrice - set a value to 0.0 because we don't know a total price of burger
     */

    public Burger(String name, double basePrice) {
        this.name = name;
        this.basePrice = basePrice;
        this.finalPrice = 0.0;
    }


    /**
     * @return values of breadType, meatType and basePrice
     * we don't return a values of name because name is static and it will not change
     */


    public double getBasePrice() {
        return basePrice;
    }

    /**
     * @param extraToppings - assign with additions 1,2,3 and adding to burger
     * @param price         - assign with addition price 1,2,3 and adding to price of burger
     */

    public void addition1(String extraToppings, double price) {
        this.addition1 = extraToppings;
        this.addition1Price = price;
        System.out.println("Added " + addition1 + " for an extra $" + addition1Price);
    }

    public void addition2(String extraToppings, double price) {
        this.addition2 = extraToppings;
        this.addition2Price = price;
        System.out.println("Added " + addition2 + " for an extra $" + addition2Price);
    }

    public void addition3(String extraToppings, double price) {
        this.addition3 = extraToppings;
        this.addition3Price = price;
        System.out.println("Added " + addition3 + " for an extra $" + addition3Price);
    }

    public double itemizeBurger() {

        System.out.println(this.name + " cost $" + basePrice);

        if (addition1 != null) {
            finalPrice = basePrice + addition1Price;
        }

        if (addition2 != null) {
            finalPrice = basePrice + addition1Price + addition2Price;
        }

        if (addition3 != null) {
            finalPrice = basePrice + addition1Price + addition2Price + addition3Price;
        }
        return finalPrice;
    }

    /**
     * getters for getting a values and setters to set a different price for additions
     */

    public double getAddition1Price() {
        return addition1Price;
    }

    public void setAddition1Price(double addition1Price) {
        this.addition1Price = addition1Price;
    }

    public double getAddition2Price() {
        return addition2Price;
    }

    public void setAddition2Price(double addition2Price) {
        this.addition2Price = addition2Price;
    }

    public double getAddition3Price() {
        return addition3Price;
    }

    public void setAddition3Price(double addition3Price) {
        this.addition3Price = addition3Price;
    }
}
