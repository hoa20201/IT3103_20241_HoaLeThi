package Lab02;

public class Amis_HoaLT {
    public static void main(String[] args) {
        //Create a new cart
        CartHoaLT anOrder = new CartHoaLT();

        //Create new dvd objects and add them to the cart
        DigitalVideoDiscHoaLT dvd1 = new DigitalVideoDiscHoaLT("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        if (anOrder.addDigitalVideoDiscHoaLT(dvd1)) {
            System.out.println("Add successful");
        }


        DigitalVideoDiscHoaLT dvd2 = new DigitalVideoDiscHoaLT("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        if (anOrder.addDigitalVideoDiscHoaLT(dvd2)) {
            System.out.println("Add successful");
        }

        DigitalVideoDiscHoaLT dvd3 = new DigitalVideoDiscHoaLT("Aladin", "Animation", 18.99f);
        if (anOrder.addDigitalVideoDiscHoaLT(dvd3)) {
            System.out.println("Add successful");
            System.out.println();
        }

        anOrder.showCart();

        //print total cost of the items in the cart
        System.out.println("Total Cost is: " + String.format("%.2f", anOrder.calculateTotalCost()));
        System.out.println();

        // Remove the dvd1
        if (anOrder.removeDigitalVideoDiscHoaLT(dvd1)) {
            System.out.println("Remove successful");
            System.out.println();
        }

        anOrder.showCart();

        //print total cost of the items in the cart after remove
        System.out.println("Total Cost after remove is: " + String.format("%.2f", anOrder.calculateTotalCost()));
    }
}
