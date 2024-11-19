//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        MealOrder mealOrder = new MealOrder();
        mealOrder.getBurger().addition1("ketchup", 0.50);
        mealOrder.getBurger().addition2("mustard", 0.60);
        mealOrder.getBurger().addition3("mayonnaise", 0.70);
        System.out.println("Final price is = $" + mealOrder.getBurger().itemizeBurger());

        mealOrder.getDrink().getDrinkSize("L");
        mealOrder.getSideItem().sideItemMenu();
        mealOrder.getBurger().setAddition1Price(0.50);
        mealOrder.getBurger().setAddition2Price(0.60);
        mealOrder.getBurger().setAddition3Price(0.70);
        mealOrder.getDeluxe().setAddition4Price(0.70);
        mealOrder.getDeluxe().setAddition5Price(0.80);


        //total price of meal
        double totalPrice = mealOrder.getBurger().getBasePrice() + mealOrder.getBurger().getAddition1Price() +
                mealOrder.getBurger().getAddition2Price() + mealOrder.getBurger().getAddition3Price() + mealOrder.getDrink().getPrice() +
                mealOrder.getSideItem().getPrice() + mealOrder.getDeluxe().getBasePrice() + mealOrder.getDeluxe().getAddition4Price() +
                mealOrder.getDeluxe().getAddition5Price();

        System.out.println("- - - - - - - - -");


        System.out.println("Price for meal order is: " +
                "\nBurger = " + mealOrder.getBurger().getBasePrice() + "$" +
                "\nAddition1 = " + mealOrder.getBurger().getAddition1Price() + "S" +
                "\nAddition2 = " + mealOrder.getBurger().getAddition2Price() + "S" +
                "\nAddition3 = " + mealOrder.getBurger().getAddition3Price() + "S" +
                "\nDrink = " + mealOrder.getDrink().getSize() + " size " + mealOrder.getDrink().getPrice() + "S" +
                "\nSide item = " + mealOrder.getSideItem().getPrice() + "S" +
                "\nDeluxe burger = " + mealOrder.getDeluxe().getBasePrice() + "S" +
                "\nAddition4 = " + mealOrder.getDeluxe().getAddition4Price() + "S" +
                "\nAddition5 = " + mealOrder.getDeluxe().getAddition5Price() + "S" +
                "\nTotal price for meal is = " + totalPrice + "$");


        System.out.println("- - - - - - - - -");

        DeluxeBurger deluxe = new DeluxeBurger("Deluxe", 17.99);
        deluxe.addition1("salad", 4.99);
        deluxe.addition2("Mustard", 0.60);
        deluxe.addition3("Mayonnaise", 0.60);
        deluxe.addition4("gravy", 0.70);
        deluxe.addition5("Chilli paprika", 0.70);
        System.out.println("Final price of Deluxe burger is = $" + deluxe.itemizeBurger());

    }
}