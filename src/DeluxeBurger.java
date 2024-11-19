public class DeluxeBurger extends Burger{

    private double finalPrice;

    private String addition4;
    private double addition4Price;

    private String addition5;
    private double addition5Price;


    public DeluxeBurger(String name, double basePrice) {
        super(name, basePrice);
    }

    /**
     * getters for getting a values and setters to set a different price for additions
     */

    public double getAddition4Price() {
        return addition4Price;
    }

    public double getAddition5Price() {
        return addition5Price;
    }

    public void setAddition4Price(double addition4Price) {
        this.addition4Price = addition4Price;
    }

    public void setAddition5Price(double addition5Price) {
        this.addition5Price = addition5Price;
    }

    @Override
    public void addition1(String extraToppings, double price) {
        super.addition1(extraToppings, price);

    }

    @Override
    public void addition2(String extraToppings, double price) {
        super.addition2(extraToppings, price);

    }

    @Override
    public void addition3(String extraToppings, double price) {
        super.addition3(extraToppings, price);
    }

    /**
     * @param extraToppings - represent a fourth and fifth extra toppings on burger
     * @param price         - represent a price of fourth and fifth additions
     */

    public void addition4(String extraToppings, double price) {
        this.addition4 = extraToppings;
        this.addition4Price = price;
        System.out.println("Added " + addition4 + " for an extra $" + addition4Price);
    }

    public void addition5(String extraToppings, double price) {
        this.addition5 = extraToppings;
        this.addition5Price = price;
        System.out.println("Added " + addition5 + " for an extra $" + addition5Price);
    }


    @Override
    public double itemizeBurger() {

        if (addition4 != null) {
            finalPrice = getBasePrice();
        }

        if (addition5 != null) {
            finalPrice = getBasePrice();
        }

        return finalPrice;
    }
}
