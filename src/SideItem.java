public class SideItem {

    private String name;
    private double price;


    public SideItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    /**
     * @return a price of side item
     */

    public double getPrice() {
        return price;
    }

    public String sideItemMenu() {
        return "Side item " + this.name + " cost $" + this.price;
    }
}
