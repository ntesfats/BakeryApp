import java.util.ArrayList;

public class BakeryItem {
    private String name;
    private double price;
    private String expDate;
    private int quantityInStock;
    private ArrayList <String> restriction;

    public BakeryItem(String name, double price,String expDate,int quantityInStock,  ArrayList restriction){

        this.name = name;
        this.price = price;
        this.restriction = restriction;
        this.expDate = expDate;
        this.quantityInStock = quantityInStock;
    }
        public ArrayList<String> getRestriction(){
        return restriction;
    }
    public String toString(){
        return this.name +"\n\t|\n\t ---> Price: " + this.price+  ", Exp Date: \""+ this.expDate+
                "\", In Stock: " + this.quantityInStock + ", Restriction: " + this.restriction;
    }
}
