import java.util.ArrayList;
import java.util.Scanner;

public class BakeryApp {
    public static void main(String[] args) {

        BakeryDatabase db = new BakeryDatabase();
        db.setPreloadDatabase();
        Scanner scan = new Scanner(System.in);


        System.out.println("Welcome to the Brookley's Better Bakery App! \n" +
                "We contain sugar, peanut, gluten, soy, canola oil, eggs and dairy in our products." +
                "To search for foods that you can eat, please enter the name of the diet restriction: \n" +
                "To see a list of all our foods, please type \"all\". ");

        String restriction = scan.next();
         ArrayList<BakeryItem>RestrictedItem = db.getItems(restriction);

        System.out.println("Item contain " + restriction+ " are:"+ RestrictedItem);


    }
}
