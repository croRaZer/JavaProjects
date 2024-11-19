public class MealOrder {

    private Burger burger;
    private Drink drink;
    private SideItem sideItem;
    private DeluxeBurger deluxe;
    private double totalPrice;


    public MealOrder() {
        burger = new Burger("Cheeseburger", 7.99);
        drink = new Drink("Pepsi");
        sideItem = new SideItem("Salad", 4.99);
        deluxe = new DeluxeBurger("Deluxe", 17.99);
    }

    public MealOrder(Burger burger, Drink drink, SideItem sideItem, DeluxeBurger deluxe) {
        this.burger = burger;
        this.drink = drink;
        this.sideItem = sideItem;
        this.deluxe = deluxe;
        totalPrice = 0.0;
    }

    public Burger getBurger() {
        return burger;
    }

    public Drink getDrink() {
        return drink;
    }

    public SideItem getSideItem() {
        return sideItem;
    }

    public DeluxeBurger getDeluxe() {
        return deluxe;
    }

    /**
     * @return the total price in meal order
     */

    public double getTotalPrice() {
        return totalPrice;
    }

    public void commonMeal() {
        System.out.println("Regular order includes: regular burger, small coca-cola and fries!");
    }
}
