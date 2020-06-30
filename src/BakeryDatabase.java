import java.util.ArrayList;

public class BakeryDatabase {


    private ArrayList< BakeryItem > dataBase;
    public BakeryDatabase (){
        dataBase = new ArrayList<>();
    }

    public void setPreloadDatabase(){
        ArrayList <String> restriction= new ArrayList<>();

        restriction.add("sugar");

        BakeryItem item1 = new BakeryItem( "cookie", 1.00,"july, 7,2020",20, restriction);
        dataBase.add(item1);

        BakeryItem item2 = new BakeryItem( "brownie", 2.00,"july, 20,2020",45, restriction);
        dataBase.add(item2);

        restriction = new ArrayList<>();
        restriction.add("gluten");
        BakeryItem item3 = new BakeryItem( "muffin", 1.50,"july, 7,2020", 100 ,restriction);
        dataBase.add(item3);

        BakeryItem item4 = new BakeryItem( "begal", 1.00,"july, 31,2020", 30, restriction );
        dataBase.add(item4);

        restriction = new ArrayList<>();
        restriction.add("peanuts");
        BakeryItem item5 = new BakeryItem( "pie", 2.50,"August, 20,2021", 67, restriction );
        dataBase.add(item5);

        BakeryItem item6 = new BakeryItem( "croissant", 2.50, "july, 31,2020",7,
                restriction );
        dataBase.add(item6);

        BakeryItem item7 = new BakeryItem( "choc croisant", 2.50, "july, 28,2020",78,restriction );
        dataBase.add(item7);

        restriction = new ArrayList<>();
        restriction.add("dairy");
        BakeryItem item8 = new BakeryItem( "cake", 10.50,"july, 20,2020",9, restriction );
        dataBase.add(item8);

        restriction = new ArrayList<>();
        restriction.add("soy");
        BakeryItem item9 = new BakeryItem( "banana bread", 10.50, "july, 15 ,2020", 34,restriction );
        dataBase.add(item9);

        BakeryItem item10 = new BakeryItem( "wheat grain bread", 10.50, "july, 10,2020", 67, restriction );
        dataBase.add(item10);
        BakeryItem item11 = new BakeryItem( "roll", 10.50, "july, 16,2020", 35,restriction );
        dataBase.add(item11);

        restriction = new ArrayList<>();
        restriction.add("canola oil");
        BakeryItem item12 = new BakeryItem( "tart", 10.50,"july, 7,2020,",3, restriction );
        dataBase.add(item12);

        restriction = new ArrayList<>();
        restriction.add("eggs");
        BakeryItem item13 = new BakeryItem( "empanadas", 4.50, "july, 10,2020", 5, restriction );
        dataBase.add(item13);

        BakeryItem item14 = new BakeryItem( "pudding", 1.50, "july,10,2020", 7, restriction );
        dataBase.add(item14);

        BakeryItem item15 = new BakeryItem( "pizza", 3.50,"july, 7,2020", 6, restriction );
        dataBase.add(item15);

    }
        public ArrayList<BakeryItem> getItems(String restriction){
             ArrayList <BakeryItem> result = new ArrayList<>();
             if (restriction.equals("all")){
                 return dataBase;
             }
            for ( BakeryItem item: dataBase){
                for (String rst: item.getRestriction()){
                    if (restriction.equals(rst)){
                        result.add(item);
                    }
                }
            }
                    return result;
    }

}
