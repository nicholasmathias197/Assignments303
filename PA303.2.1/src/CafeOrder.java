public class CafeOrder {
    public static void main(String[] args) {

        double coffee = 2.50;
        double cappuccino = 3.75;
        double espresso = 2.25;


        int coffeeQty = 3;
        int cappuccinoQty = 4;
        int espressoQty = 2;


        double subtotal = (coffee * coffeeQty) +
                (cappuccino * cappuccinoQty) +
                (espresso * espressoQty);


        final double SALES_TAX = 0.085;


        double taxAmount = subtotal * SALES_TAX;
        double totalSale = subtotal + taxAmount;


        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Tax Amount: $" + taxAmount);
        System.out.println("Total Sale: $" +totalSale);
    }
}