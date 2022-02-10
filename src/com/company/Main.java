package com.company;

import java.util.*;
//There are three of each lowest subclass of merchandise items (3 CDs, 3 Shirts, 3 Guitars, etc.) in the store
//at the start of the simulation. Determine a name (any way you choose) and a purchase price ($1 to $50) per
//item. The list price will be set to 2 x the purchase price for each item. The attribute dayArrived should be set to
//0 for the initial item set. Condition has five levels: poor, fair, good, very good, or excellent. The attributes
//salePrice and daySold will be set when the item is sold.
// Superclass

// Subclass of Item
class Players extends Item {

    Players(String name, double purchasePrice, int newOrUsed, int dayArrived, int condition) {
        super(name, purchasePrice, newOrUsed, dayArrived, condition);
    }
}

// Subclass of Players
class MP3 extends Players {
    public static int count = 0;
    MP3(String name, double purchasePrice, int newOrUsed, int dayArrived, int condition) {
        super(name, purchasePrice, newOrUsed, dayArrived, condition);
        setItem_type_id(0);
        count++;
    }
}

// Subclass of Players
class CD_P extends Players {
    public static int count = 0;

    CD_P(String name, double purchasePrice, int newOrUsed, int dayArrived, int condition) {
        super(name, purchasePrice, newOrUsed, dayArrived, condition);
        setItem_type_id(1);
        count++;
    }
}

// Subclass of Players
class RecordPlayer extends Players {
    public static int count = 0;

    RecordPlayer(String name, double purchasePrice, int newOrUsed, int dayArrived, int condition) {
        super(name, purchasePrice, newOrUsed, dayArrived, condition);
        setItem_type_id(2);
        count++;
    }
}

// Subclass of Item
class Instruments extends Item {


    Instruments(String name, double purchasePrice, int newOrUsed, int dayArrived, int condition) {
        super(name, purchasePrice, newOrUsed, dayArrived, condition);
    }
}

// Subclass of Instruments
class Stringed extends Instruments {
    private boolean electric_;

    Stringed(String name, double purchasePrice, int newOrUsed, int dayArrived, int condition, boolean electric) {
        super(name, purchasePrice, newOrUsed, dayArrived, condition);
        electric_ = electric;
    }

}

// Subclass of Stringed
class Mandolin extends Stringed {
    public static int count = 0;

    Mandolin(String name, double purchasePrice, int newOrUsed, int dayArrived, int condition, boolean electric) {
        super(name, purchasePrice, newOrUsed, dayArrived, condition, electric);
        setItem_type_id(3);
        count++;
    }
}

// Subclass of Stringed
class Guitar extends Stringed {
    public static int count = 0;

    Guitar(String name, double purchasePrice, int newOrUsed, int dayArrived, int condition, boolean electric) {
        super(name, purchasePrice, newOrUsed, dayArrived, condition, electric);
        setItem_type_id(4);
        count++;
    }
}

// Subclass of Stringed
class Bass extends Stringed {
    public static int count = 0;

    Bass(String name, double purchasePrice, int newOrUsed, int dayArrived, int condition, boolean electric) {
        super(name, purchasePrice, newOrUsed, dayArrived, condition, electric);
        setItem_type_id(5);
        count++;
    }
}

// Subclass of Instruments
class Wind extends Instruments {

    Wind(String name, double purchasePrice, int newOrUsed, int dayArrived, int condition) {
        super(name, purchasePrice, newOrUsed, dayArrived, condition);
    }
}

// Subclass of Wind
class Harmonica extends Wind {
    private String key_;
    public static int count = 0;

    Harmonica(String name, double purchasePrice, int newOrUsed, int dayArrived, int condition, String key) {
        super(name, purchasePrice, newOrUsed, dayArrived, condition);
        key_ = key;
        setItem_type_id(6);
        count++;
    }

    public String getKey_() {
        return key_;
    }

    public void setKey_(String key_) {
        this.key_ = key_;
    }
}

// Subclass of Wind
class Flute extends Wind {
    private String type_;
    public static int count = 0;


    Flute(String name, double purchasePrice, int newOrUsed, int dayArrived, int condition, String type) {
        super(name, purchasePrice, newOrUsed, dayArrived, condition);
        type_ = type;
        setItem_type_id(7);
        count++;
    }

    public String getType_() {
        return type_;
    }
}

// Subclass of Item
class Music extends Item {
    String band_;
    String album_;


    Music(String name, double purchasePrice, int newOrUsed, int dayArrived, int condition, String band, String album) {
        super(name, purchasePrice, newOrUsed, dayArrived, condition);
        band_ = band;
        album_ = album;

    }

    public String getBand_() {
        return band_;
    }

    public String getAlbum_() {
        return album_;
    }
}

// Subclass of Music
class CD_M extends Music {
    public static int count = 0;

    CD_M(String name, double purchasePrice, int newOrUsed, int dayArrived, int condition, String band, String album) {
        super(name, purchasePrice, newOrUsed, dayArrived, condition, band, album);
        setItem_type_id(8);
        count++;
    }
}

// Subclass of Music
class Vinyl extends Music {
    public static int count = 0;


    Vinyl(String name, double purchasePrice, int newOrUsed, int dayArrived, int condition, String band, String album) {
        super(name, purchasePrice, newOrUsed, dayArrived, condition, band, album);
        setItem_type_id(9);
        count++;
    }
}

// Subclass of Music
class PaperScore extends Music {
    public static int count = 0;

    PaperScore(String name, double purchasePrice, int newOrUsed, int dayArrived, int condition, String band, String album) {
        super(name, purchasePrice, newOrUsed, dayArrived, condition, band, album);
        setItem_type_id(10);
        count++;
    }
}

// Subclass of Item
class Clothing extends Item {

    Clothing(String name, double purchasePrice, int newOrUsed, int dayArrived, int condition) {
        super(name, purchasePrice, newOrUsed, dayArrived, condition);
    }
}

// Subclass of Clothing
class Hats extends Clothing {
    char hatSize_;
    public static int count = 0;

    Hats(String name, double purchasePrice, int newOrUsed, int dayArrived, int condition, char hatSize) {
        super(name, purchasePrice, newOrUsed, dayArrived, condition);
        hatSize_ = hatSize;
        setItem_type_id(11);
        count++;
    }

    public char getHatSize_() {
        return hatSize_;
    }
}

// Subclass of Clothing
class Shirts extends Clothing {
    char shirtSize_;
    public static int count = 0;

    Shirts(String name, double purchasePrice, int newOrUsed, int dayArrived, int condition, char shirtSize) {
        super(name, purchasePrice, newOrUsed, dayArrived, condition);
        shirtSize_ = shirtSize;
        setItem_type_id(12);
        count++;
    }
}

// Subclass of Clothing
class Bandanas extends Clothing {
    public static int count = 0;

    Bandanas(String name, double purchasePrice, int newOrUsed, int dayArrived, int condition) {
        super(name, purchasePrice, newOrUsed, dayArrived, condition);
        setItem_type_id(13);
        count++;
    }
}

// Subclass of Item
class Accessories extends Item {

    Accessories(String name, double purchasePrice, int newOrUsed, int dayArrived, int condition) {
        super(name, purchasePrice, newOrUsed, dayArrived, condition);
    }
}

// Subclass of Accessories
class Strings extends Accessories {
    String type_;
    public static int count = 0;

    Strings(String name, double purchasePrice, int newOrUsed, int dayArrived, int condition, String type) {
        super(name, purchasePrice, newOrUsed, dayArrived, condition);
        type_ = type;
        setItem_type_id(14);
        count++;
    }
}

// Subclass of Accessories
class Cables extends Accessories {
    int length_;
    public static int count = 0;

    Cables(String name, double purchasePrice, int newOrUsed, int dayArrived, int condition, int length) {
        super(name, purchasePrice, newOrUsed, dayArrived, condition);
        length_ = length;
        setItem_type_id(15);
        count++;
    }
}

// Subclass of Accessories
class PracticeAmps extends Accessories {
    int wattage_;
    public static int count = 0;

    PracticeAmps(String name, double purchasePrice, int newOrUsed, int dayArrived, int condition, int wattage) {
        super(name, purchasePrice, newOrUsed, dayArrived, condition);
        wattage_ = wattage;
        setItem_type_id(16);
        count++;
    }
}

class CashRegister {
    public static double money_ = 0;
}

class Customer {
    private static int num_customers = 0;

    public int getCustomer_id_() {
        return customer_id_;
    }

    public void setCustomer_id_(int customer_id_) {
        this.customer_id_ = customer_id_;
    }

    private int customer_id_;

    public boolean isSelling_or_buying_() {
        return selling_or_buying_;
    }

    private boolean selling_or_buying_;

    public int getItem_subclass_() {
        return item_subclass_;
    }

    public void setItem_subclass_(int item_subclass_) {
        this.item_subclass_ = item_subclass_;
    }

    private int item_subclass_;
    private Item item_to_sell;
    private int arrival_day_;

    Customer(boolean selling_or_buying, int arrival_day){
        Random r_ = new Random();
        customer_id_ = num_customers;
        num_customers++;
        item_subclass_ = r_.nextInt(17);
        selling_or_buying_ = selling_or_buying;
        arrival_day_ = arrival_day;
    }




    // void ArriveAtStore() {
    //
    // }

    // void LeaveStore() {
    //
    // }

    // void PayClerk() {
    //
    // }

    // void BuyItem() {
    //
    // }

    // Vector<Item> GetItemsToBuy() {
    //
    // }

    // Vector<Item> GetItemsToSell() {
    //
    // }
}

class Staff {
    private String name_;
    private int consecutive_work_days_;
    private String type_;
    Staff(String name, String type){
        name_ = name;
        type_ = type;
        consecutive_work_days_ = 0;
    }

    public String getName_() {
        return name_;
    }

    public void setName_(String name) {
        this.name_ = name;
    }

    public int getConsecutive_work_days_() {
        return consecutive_work_days_;
    }

    public void setConsecutive_work_days_(int consecutive_work_days) {
        this.consecutive_work_days_ = consecutive_work_days;
    }

    public String getType_() {
        return type_;
    }

    public void setType_(String type_) {
        this.type_ = type_;
    }

    public void ArriveAtStore(int day_arrived) {
        System.out.println(name_ + " arrives at the store on Day " + day_arrived + ".");
    }

    public void LeaveStore(int day) {
        System.out.println(name_ + " locked up the store and went home for day " + day + ".");
    }
}

// Subclass of Staff
class Clerk extends Staff {
    public int getBreak_prob_() {
        return break_prob_;
    }

    private final int break_prob_;
    Clerk(String name, String type, int break_prob) {
        super(name, type);
        break_prob_ = break_prob;
    }

    public double CheckRegister() {
        System.out.println(super.getName_() + " checked the cash register. The amount of cash in the register is " + CashRegister.money_ + ".");
        return CashRegister.money_;
    }

    public int GoToBank() {
        CashRegister.money_ += 1000;
        System.out.println(super.getName_() + " went to the bank and withdrew 1000$, the new balance in the register is " + CashRegister.money_ + ".");
        return 1000;
    }
    //probably need to pass in the inventory ArrayList as an Argument
    public ArrayList<Integer> DoInventory(Map<Integer, ArrayList<Item>> inventory) {
        //loop through all of the items, and count each subclass
        //if the count is equal to 0, then PlaceAnOrder()
        System.out.println(super.getName_() + " checked the inventory.");
        ArrayList<Integer> order_list = new ArrayList<>();
        for(Map.Entry<Integer,ArrayList<Item>> entry : inventory.entrySet()){
            if(entry.getValue().size() == 0){
                order_list.add(entry.getKey());
                System.out.println(super.getName_() + " found 0 items for item type id " + entry.getKey());
            }
        }
        return order_list;
    }

    public ArrayList<Item> PlaceAnOrder(ArrayList<Integer> order_list, int curr_day) {
        //basically just order 3 of whatever item is passed with random purchase price
        //purchase price is payed for by removing money from the cash register
        //items should arrive in the next 1 to 3 days
        //print out what we are doing
        Random r = new Random();
        ArrayList<Item> items_ordered = new ArrayList<>();
        Item item1;
        Item item2;
        Item item3;
        for (Integer integer : order_list) {
            //order 3 of each of the items that match the switch statement below
            int rand_arrival_day = r.nextInt(3) + 1 + curr_day;
            String item_name;
            switch (integer) {
                case 0 -> {
                    item1 = new MP3("MP3 " + MP3.count, r.nextInt(50) + 1, 1, rand_arrival_day, r.nextInt(5) + 1);
                    item2 = new MP3("MP3 " + MP3.count, r.nextInt(50) + 1, 1, rand_arrival_day, r.nextInt(5) + 1);
                    item3 = new MP3("MP3 " + MP3.count, r.nextInt(50) + 1, 1, rand_arrival_day, r.nextInt(5) + 1);
                }
                case 1 -> {
                    item1 = new CD_P("CD Player " + CD_P.count, r.nextInt(50) + 1, 1, rand_arrival_day, r.nextInt(5) + 1);
                    item2 = new CD_P("CD Player " + CD_P.count, r.nextInt(50) + 1, 1, rand_arrival_day, r.nextInt(5) + 1);
                    item3 = new CD_P("CD Player " + CD_P.count, r.nextInt(50) + 1, 1, rand_arrival_day, r.nextInt(5) + 1);
                }
                case 2 -> {
                    item1 = new RecordPlayer("Record Player " + RecordPlayer.count, r.nextInt(50) + 1, 1, rand_arrival_day, r.nextInt(5) + 1);
                    item2 = new RecordPlayer("Record Player " + RecordPlayer.count, r.nextInt(50) + 1, 1, rand_arrival_day, r.nextInt(5) + 1);
                    item3 = new RecordPlayer("Record Player " + RecordPlayer.count, r.nextInt(50) + 1, 1, rand_arrival_day, r.nextInt(5) + 1);
                }
                case 3 -> {
                    item1 = new Mandolin("Mandolin " + Mandolin.count, r.nextInt(50) + 1, 1, rand_arrival_day, r.nextInt(5) + 1, true);
                    item2 = new Mandolin("Mandolin " + Mandolin.count, r.nextInt(50) + 1, 1, rand_arrival_day, r.nextInt(5) + 1, true);
                    item3 = new Mandolin("Mandolin " + Mandolin.count, r.nextInt(50) + 1, 1, rand_arrival_day, r.nextInt(5) + 1, true);
                }
                case 4 -> {
                    item1 = new Guitar("Guitar " + Guitar.count, r.nextInt(50) + 1, 1, rand_arrival_day, r.nextInt(5) + 1, true);
                    item2 = new Guitar("Guitar " + Guitar.count, r.nextInt(50) + 1, 1, rand_arrival_day, r.nextInt(5) + 1, true);
                    item3 = new Guitar("Guitar " + Guitar.count, r.nextInt(50) + 1, 1, rand_arrival_day, r.nextInt(5) + 1, true);
                }
                case 5 -> {
                    item1 = new Bass("Bass " + Bass.count, r.nextInt(50) + 1, 1, rand_arrival_day, r.nextInt(5) + 1, true);
                    item2 = new Bass("Bass " + Bass.count, r.nextInt(50) + 1, 1, rand_arrival_day, r.nextInt(5) + 1, true);
                    item3 = new Bass("Bass " + Bass.count, r.nextInt(50) + 1, 1, rand_arrival_day, r.nextInt(5) + 1, true);
                }
                case 6 -> {
                    item1 = new Harmonica("Harmonica " + Harmonica.count, r.nextInt(50) + 1, 1, rand_arrival_day, r.nextInt(5) + 1, "No clue");
                    item2 = new Harmonica("Harmonica " + Harmonica.count, r.nextInt(50) + 1, 1, rand_arrival_day, r.nextInt(5) + 1, "No clue");
                    item3 = new Harmonica("Harmonica " + Harmonica.count, r.nextInt(50) + 1, 1, rand_arrival_day, r.nextInt(5) + 1, "No clue");
                }
                case 7 -> {
                    item1 = new Flute("Flute " + Flute.count, r.nextInt(50) + 1, 1, rand_arrival_day, r.nextInt(5) + 1, "No clue");
                    item2 = new Flute("Flute " + Flute.count, r.nextInt(50) + 1, 1, rand_arrival_day, r.nextInt(5) + 1, "No clue");
                    item3 = new Flute("Flute " + Flute.count, r.nextInt(50) + 1, 1, rand_arrival_day, r.nextInt(5) + 1, "No clue");
                }
                case 8 -> {
                    item1 = new CD_M("CD " + CD_M.count, r.nextInt(50) + 1, 1, rand_arrival_day, r.nextInt(5) + 1, "Band " + CD_M.count, "Album " + CD_M.count);
                    item2 = new CD_M("CD " + CD_M.count, r.nextInt(50) + 1, 1, rand_arrival_day, r.nextInt(5) + 1, "Band " + CD_M.count, "Album " + CD_M.count);
                    item3 = new CD_M("CD " + CD_M.count, r.nextInt(50) + 1, 1, rand_arrival_day, r.nextInt(5) + 1, "Band " + CD_M.count, "Album " + CD_M.count);
                }
                case 9 -> {
                    item1 = new Vinyl("Vinyl " + Vinyl.count, r.nextInt(50) + 1, 1, rand_arrival_day, r.nextInt(5) + 1, "Band " + Vinyl.count, "Album " + Vinyl.count);
                    item2 = new Vinyl("Vinyl " + Vinyl.count, r.nextInt(50) + 1, 1, rand_arrival_day, r.nextInt(5) + 1, "Band " + Vinyl.count, "Album " + Vinyl.count);
                    item3 = new Vinyl("Vinyl " + Vinyl.count, r.nextInt(50) + 1, 1, rand_arrival_day, r.nextInt(5) + 1, "Band " + Vinyl.count, "Album " + Vinyl.count);
                }
                case 10 -> {
                    item1 = new PaperScore("Paper Score " + PaperScore.count, r.nextInt(50) + 1, 1, rand_arrival_day, r.nextInt(5) + 1, "Band " + PaperScore.count, "Album " + PaperScore.count);
                    item2 = new PaperScore("Paper Score " + PaperScore.count, r.nextInt(50) + 1, 1, rand_arrival_day, r.nextInt(5) + 1, "Band " + PaperScore.count, "Album " + PaperScore.count);
                    item3 = new PaperScore("Paper Score " + PaperScore.count, r.nextInt(50) + 1, 1, rand_arrival_day, r.nextInt(5) + 1, "Band " + PaperScore.count, "Album " + PaperScore.count);
                }
                case 11 -> {
                    item1 = new Hats("Hat " + Hats.count, r.nextInt(50) + 1, 1, rand_arrival_day, r.nextInt(5) + 1, 'S');
                    item2 = new Hats("Hat " + Hats.count, r.nextInt(50) + 1, 1, rand_arrival_day, r.nextInt(5) + 1, 'S');
                    item3 = new Hats("Hat " + Hats.count, r.nextInt(50) + 1, 1, rand_arrival_day, r.nextInt(5) + 1, 'S');
                }
                case 12 -> {
                    item1 = new Shirts("Shirt " + Shirts.count, r.nextInt(50) + 1, 1, rand_arrival_day, r.nextInt(5) + 1, 'S');
                    item2 = new Shirts("Shirt " + Shirts.count, r.nextInt(50) + 1, 1, rand_arrival_day, r.nextInt(5) + 1, 'S');
                    item3 = new Shirts("Shirt " + Shirts.count, r.nextInt(50) + 1, 1, rand_arrival_day, r.nextInt(5) + 1, 'S');
                }
                case 13 -> {
                    item1 = new Bandanas("Bandana " + Bandanas.count, r.nextInt(50) + 1, 1, rand_arrival_day, r.nextInt(5) + 1);
                    item2 = new Bandanas("Bandana " + Bandanas.count, r.nextInt(50) + 1, 1, rand_arrival_day, r.nextInt(5) + 1);
                    item3 = new Bandanas("Bandana " + Bandanas.count, r.nextInt(50) + 1, 1, rand_arrival_day, r.nextInt(5) + 1);
                }
                case 14 -> {
                    item1 = new Strings("Harmonica " + Strings.count, r.nextInt(50) + 1, 1, rand_arrival_day, r.nextInt(5) + 1, "Copper");
                    item2 = new Strings("Harmonica " + Strings.count, r.nextInt(50) + 1, 1, rand_arrival_day, r.nextInt(5) + 1, "Copper");
                    item3 = new Strings("Harmonica " + Strings.count, r.nextInt(50) + 1, 1, rand_arrival_day, r.nextInt(5) + 1, "Copper");
                }
                case 15 -> {
                    item1 = new Cables("Cable " + Cables.count, r.nextInt(50) + 1, 1, rand_arrival_day, r.nextInt(5) + 1, 2);
                    item2 = new Cables("Cable " + Cables.count, r.nextInt(50) + 1, 1, rand_arrival_day, r.nextInt(5) + 1, 2);
                    item3 = new Cables("Cable " + Cables.count, r.nextInt(50) + 1, 1, rand_arrival_day, r.nextInt(5) + 1, 2);
                }
                default -> {
                    item1 = new PracticeAmps("Practice Amp " + PracticeAmps.count, r.nextInt(50) + 1, 1, rand_arrival_day, r.nextInt(5) + 1, 50);
                    item2 = new PracticeAmps("Practice Amp " + PracticeAmps.count, r.nextInt(50) + 1, 1, rand_arrival_day, r.nextInt(5) + 1, 50);
                    item3 = new PracticeAmps("Practice Amp " + PracticeAmps.count, r.nextInt(50) + 1, 1, rand_arrival_day, r.nextInt(5) + 1, 50);
                }
            }
            items_ordered.add(item1);
            items_ordered.add(item2);
            items_ordered.add(item3);
            System.out.println(super.getName_() + " placed an order for the following items: " + item1.getName_() + ", " + item2.getName_() + ", " + item3.getName_() + ".");
            CashRegister.money_ -= item1.getPurchasePrice_();
            CashRegister.money_ -= item2.getPurchasePrice_();
            CashRegister.money_ -= item3.getPurchasePrice_();
        }
        return items_ordered;
    }
    public ArrayList<Item> OpenTheStore(ArrayList<Customer> customers, Map<Integer, ArrayList<Item>> inventory, int curr_day){
        //respond to the arriving customers
        //want to have random customers arrive
        ArrayList<Item> items_sold = new ArrayList<>();
        Random rand = new Random();
        while(customers.size() > 0){ //customer list is not empty
            //need to get a random customer from the list
            Customer curr_customer = customers.get(rand.nextInt(customers.size()));
            System.out.println(super.getName_() + " is helping customer " + curr_customer.getCustomer_id_() + ".");
            //we then need to check if this customer wants to buy or sell and handle those situations as need be
            int item_subclass = curr_customer.getItem_subclass_();
            if(curr_customer.isSelling_or_buying_()){ //buying
                System.out.println("Customer " + curr_customer.getCustomer_id_() + " is looking to buy an item with subclass number " + item_subclass + ".");
                ArrayList<Item> subclass_inventory = inventory.get(item_subclass);
                if(subclass_inventory.size() == 0){
                    //the customer leaves the store
                    System.out.println("There were not items of subclass " + item_subclass + " available in the store, Customer " + curr_customer.getCustomer_id_() + " left the store.");
                }
                else{
                    //run through logic of customer bargaining with the clerk
                    int buy_or_not = rand.nextInt(2); //this will give us the first 50% chance that the item is bought by the customer
                    //pick a random item from the ArrayList of this item type
                    int item_index = rand.nextInt(subclass_inventory.size());
                    Item item_to_buy = subclass_inventory.get(item_index);
                    if(buy_or_not == 1){
                        //lets say a one means the customer will buy the item
                        double list_price = item_to_buy.getListPrice_();
                        System.out.println(super.getName_() + " sold " + item_to_buy.getName_() + " at a list price of $" + list_price + " to Customer " + curr_customer.getCustomer_id_() + ".");
                        item_to_buy.setDaySold_(curr_day);
                        item_to_buy.setSalePrice_(list_price);
                        items_sold.add(item_to_buy); //add the item to the items_sold
                        //then remove the item from the map
                        inventory.get(item_subclass).remove(item_index);
                        //update the money in the cash register
                        CashRegister.money_ += list_price;

                    }
                    else{
                        //otherwise the user is not buying yet
                        buy_or_not = rand.nextInt(100) + 1;
                        if(buy_or_not <= 75){
                            //buy the item
                            double price = item_to_buy.getListPrice_() - 0.1 * item_to_buy.getListPrice_();
                            System.out.println(super.getName_() + " sold " + item_to_buy.getName_() + " for $" + price + " to Customer " + curr_customer.getCustomer_id_() + " for a 10% discount.");
                            item_to_buy.setDaySold_(curr_day);
                            item_to_buy.setSalePrice_(price);
                            items_sold.add(item_to_buy); //add the item to the items_sold
                            //then remove the item from the map
                            inventory.get(item_subclass).remove(item_index);
                            //update the money in the cash register
                            CashRegister.money_ += price;
                        }
                        else{
                            //did not buy
                            //we do not remove the item from the list, we do not update the register money, we simply announce what happened
                            System.out.println(super.getName_() + " and " + " Customer " + curr_customer.getCustomer_id_() + " could not make a deal, " + " Customer " + curr_customer.getCustomer_id_() + " left the store.");
                        }
                    }
                }
            }
            else{ //selling
                int sell_or_not = rand.nextInt(2);
                Item item_to_sell = CheckCustomerItem(item_subclass, curr_day);
                double offer = item_to_sell.getPurchasePrice_();
                if(sell_or_not == 1){
                    //then buy the item from the customer
                    //we need to pay for the item with money from the register
                    CashRegister.money_ -= offer;
                    //add the item to the inventory
                    inventory.get(item_subclass).add(item_to_sell);
                    //then announce what happened
                    System.out.println(super.getName_() + " bought " + item_to_sell.getName_() + " in " + item_to_sell.getString_condition_() + " condition from Customer " + curr_customer.getCustomer_id_() + " for $" + offer + ".");
                }
                else{
                    //then wager
                    sell_or_not = rand.nextInt(100) + 1;
                    if(sell_or_not <= 75){
                        //then offer 10% increase
                        offer += 0.1 * offer;
                        CashRegister.money_ -= offer;
                        //add the item to the inventory
                        item_to_sell.setPurchasePrice_(offer);
                        inventory.get(item_subclass).add(item_to_sell);
                        //then announce what happened
                        System.out.println(super.getName_() + " bought " + item_to_sell.getName_() + " in " + item_to_sell.getString_condition_() + " condition from Customer " + curr_customer.getCustomer_id_() + " for $" + offer + " for a 10% increase from the initial offer.");
                    }
                    else{
                        //the customer did not want to sell the item and left the store
                        System.out.println(super.getName_() + " and " + " Customer " + curr_customer.getCustomer_id_() + " could not make a deal, " + " Customer " + curr_customer.getCustomer_id_() + " left the store.");
                    }
                }
            }
            customers.remove(curr_customer);
        }
        return items_sold;
    }

    private Item CheckCustomerItem(int id, int arrival_day){
        //do a switch statement match
        Item item;
        Random r = new Random();
        int new_or_used = r.nextInt(2);
        int condition = r.nextInt(5) + 1;
        //need to determine purchase price based on the condition
        double purchase_price = switch (condition) {
            case 1 -> r.nextInt(10) + 1;
            case 2 -> r.nextInt(10) + 10;
            case 3 -> r.nextInt(10) + 20;
            case 4 -> r.nextInt(10) + 30;
            case 5 -> r.nextInt(10) + 40;
            default -> 0;
        };
        switch (id) {
            case 0 -> item = new MP3("MP3 " + MP3.count, purchase_price, new_or_used, arrival_day, condition);
            case 1 -> item = new CD_P("CD Player " + CD_P.count, purchase_price, new_or_used, arrival_day, condition);
            case 2 -> item = new RecordPlayer("Record Player " + RecordPlayer.count, purchase_price, new_or_used, arrival_day, condition);
            case 3 -> item = new Mandolin("Mandolin " + Mandolin.count, purchase_price, new_or_used, arrival_day, condition, true);
            case 4 -> item = new Guitar("Guitar " + Guitar.count, purchase_price, new_or_used, arrival_day, condition, true);
            case 5 -> item = new Bass("Bass " + Bass.count, purchase_price, new_or_used, arrival_day, condition, true);
            case 6 -> item = new Harmonica("Harmonica " + Harmonica.count, purchase_price, new_or_used, arrival_day, condition, "No clue");
            case 7 -> item = new Flute("Flute " + Flute.count, purchase_price, new_or_used, arrival_day, condition, "No clue");
            case 8 -> item = new CD_M("CD " + CD_M.count, purchase_price, new_or_used, arrival_day, condition, "Band " + CD_M.count, "Album " + CD_M.count);
            case 9 -> item = new Vinyl("Vinyl " + Vinyl.count, purchase_price, new_or_used, arrival_day, condition, "Band " + Vinyl.count, "Album " + Vinyl.count);
            case 10 -> item = new PaperScore("Paper Score " + PaperScore.count, purchase_price, new_or_used, arrival_day, condition, "Band " + PaperScore.count, "Album " + PaperScore.count);
            case 11 -> item = new Hats("Hat " + Hats.count, purchase_price, new_or_used, arrival_day, condition, 'S');
            case 12 -> item = new Shirts("Shirt " + Shirts.count, purchase_price, new_or_used, arrival_day, condition, 'S');
            case 13 -> item = new Bandanas("Bandana " + Bandanas.count, purchase_price, new_or_used, arrival_day, condition);
            case 14 -> item = new Strings("Harmonica " + Strings.count, purchase_price, new_or_used, arrival_day, condition, "Copper");
            case 15 -> item = new Cables("Cable " + Cables.count, purchase_price, new_or_used, arrival_day, condition, 2);
            default -> item = new PracticeAmps("Practice Amp " + PracticeAmps.count, purchase_price, new_or_used , arrival_day, condition, 50);
        }
        return item;
    }
    public void CleanTheStore(Map<Integer, ArrayList<Item>> inventory) {
        Random r = new Random();
        System.out.println(getName_() + " is cleaning the store.");
        if(r.nextInt(100) + 1 <= break_prob_){
            //something gets broken by the cleaning clerk
            //need a random type first
            int rand_subclass = r.nextInt(17);
            int rand_item_index = r.nextInt(inventory.get(rand_subclass).size());
            Item item_to_be_broken = inventory.get(rand_subclass).get(r.nextInt(rand_item_index));
            if(item_to_be_broken.getCondition_() == 1){
                //remove the item
                System.out.println(getName_() + " broke a poor condition item " + item_to_be_broken.getName_() + ", therefore this item has been removed from the store.");
                inventory.get(rand_subclass).remove(rand_item_index);
            }
            else{
                //just decrement the condition status
                //decrease listPrice by 20%
                double old_list_price = item_to_be_broken.getListPrice_();
                String old_condition = item_to_be_broken.getString_condition_();
                item_to_be_broken.ItemBroke();
                System.out.println(getName_() + " broke a " + old_condition + " condition item " + item_to_be_broken.getName_() + " listed at a price of $" + old_list_price +
                        ". The new condition is " + item_to_be_broken.getString_condition_()  + " and the new list price is $" + item_to_be_broken.getListPrice_() + ".");

            }
        }

    }
}

class Store {
    private String name;
    private double money_withdrawn_;
    private final ArrayList<Staff> staff_members = new ArrayList<>();
    private boolean is_store_open;
    private final ArrayList<Item> sold_items_ = new ArrayList<>();
    private int money_earned_;
    private final Map<Integer, ArrayList<Item>> inventory = new HashMap<>();
    private final ArrayList<Item> items_waiting = new ArrayList<>();
    private final ArrayList<Customer> customers = new ArrayList<>();
    private final Random r;
    // Not sure if needed
    Store() {
        //need to initialize the simulation here, we want to run num_days iterations
        //when we first initialize the simulation we know
        //add Shaggy and Velma to the staff Array list
        money_withdrawn_ = 0;
        r = new Random();
        //need to add customers to come into the store here
        //there should be 1 to 4 selling and 4 to 10 buying

        //need to now add items to the store initially
        for (int i = 0; i < 3; i++){
            Item paper_score = new PaperScore("Paper Score " + i, r.nextInt(50) + 1, r.nextInt(2), 0, r.nextInt(5) + 1, "Band " + i, "Album " + i);
            Item cd_m = new CD_M("CD " + i, r.nextInt(50) + 1, r.nextInt(2), 0, r.nextInt(5) + 1, "Band " + i, "Album " + i);
            Item vinyl = new Vinyl("Vinyl " + i, r.nextInt(50) + 1, r.nextInt(2), 0, r.nextInt(5) + 1, "Band " + i, "Album " + i);
            Item cd_p = new CD_P("CD Player " + i, r.nextInt(50) + 1, r.nextInt(2), 0, r.nextInt(5) + 1);
            Item record_player = new RecordPlayer("Record Player " + i, r.nextInt(50) + 1, r.nextInt(2), 0, r.nextInt(5) + 1);
            Item mp3 = new MP3("MP3 " + i, r.nextInt(50) + 1, r.nextInt(2), 0, r.nextInt(5) + 1);
            Item guitar = new Guitar("Guitar " + i, r.nextInt(50) + 1, r.nextInt(2), 0, r.nextInt(5) + 1, true);
            Item bass = new Bass("Bass " + i, r.nextInt(50) + 1, r.nextInt(2), 0, r.nextInt(5) + 1, true);
            Item mandolin = new Mandolin("Mandolin " + i, r.nextInt(50) + 1, r.nextInt(2), 0, r.nextInt(5) + 1, true);
            Item flute = new Flute("Flute " + i, r.nextInt(50) + 1, r.nextInt(2), 0, r.nextInt(5) + 1, "No clue");
            Item harmonica = new Harmonica("Harmonica " + i, r.nextInt(50) + 1, r.nextInt(2), 0, r.nextInt(5) + 1, "No clue");
            Item hat = new Hats("Hat " + i, r.nextInt(50) + 1, r.nextInt(2), 0, r.nextInt(5) + 1, 'S');
            Item shirt = new Shirts("Shirt " + i, r.nextInt(50) + 1, r.nextInt(2), 0, r.nextInt(5) + 1, 'S');
            Item bandana = new Bandanas("Bandana " + i, r.nextInt(50) + 1, r.nextInt(2), 0, r.nextInt(5) + 1);
            Item practice_amp = new PracticeAmps("Practice Amp " + i, r.nextInt(50) + 1, r.nextInt(2), 0, r.nextInt(5) + 1, 50);
            Item cable = new Cables("Cable " + i, r.nextInt(50) + 1, r.nextInt(2), 0, r.nextInt(5) + 1, 2);
            Item string = new Strings("Harmonica " + i, r.nextInt(50) + 1, r.nextInt(2), 0, r.nextInt(5) + 1, "Copper");
            inventory.computeIfAbsent(0, k -> new ArrayList<>()).add(mp3);
            inventory.computeIfAbsent(1, k -> new ArrayList<>()).add(cd_p);
            inventory.computeIfAbsent(2, k -> new ArrayList<>()).add(record_player);
            inventory.computeIfAbsent(3, k -> new ArrayList<>()).add(mandolin);
            inventory.computeIfAbsent(4, k -> new ArrayList<>()).add(guitar);
            inventory.computeIfAbsent(5, k -> new ArrayList<>()).add(bass);
            inventory.computeIfAbsent(6, k -> new ArrayList<>()).add(harmonica);
            inventory.computeIfAbsent(7, k -> new ArrayList<>()).add(flute);
            inventory.computeIfAbsent(8, k -> new ArrayList<>()).add(cd_m);
            inventory.computeIfAbsent(9, k -> new ArrayList<>()).add(vinyl);
            inventory.computeIfAbsent(10, k -> new ArrayList<>()).add(paper_score);
            inventory.computeIfAbsent(11, k -> new ArrayList<>()).add(hat);
            inventory.computeIfAbsent(12, k -> new ArrayList<>()).add(shirt);
            inventory.computeIfAbsent(13, k -> new ArrayList<>()).add(bandana);
            inventory.computeIfAbsent(14, k -> new ArrayList<>()).add(string);
            inventory.computeIfAbsent(15, k -> new ArrayList<>()).add(cable);
            inventory.computeIfAbsent(16, k -> new ArrayList<>()).add(practice_amp);
        }
        //probably add a new function here
        //now iterate through the days
         //this variable is responsible for keeping track of how many weeks we are open for,
        //assume each week begins on monday, so the 7th day we will always be closed
    }

    ArrayList<Customer> GenerateDailyCustomers(int curr_day){
        //need to add daily customers
        ArrayList<Customer> daily_customers = new ArrayList<>();
        int num_buying_customers = r.nextInt(7) + 4;
        int num_selling_customers = r.nextInt(4) + 1;
        for(int i = 0; i < num_buying_customers; i++){
            Customer new_customer = new Customer(true, curr_day);
            daily_customers.add(new_customer);
        }
        for(int i = 0; i < num_selling_customers; i++){
            Customer new_customer = new Customer(false, curr_day);
            daily_customers.add(new_customer);
        }
        return daily_customers;
    }

    void RunSimulation(int num_days){
        Clerk daily_clerk;
        int weekly_day_count = 0;
        Clerk velma = new Clerk("Velma", "clerk", 5);
        Clerk shaggy = new Clerk("Shaggy", "clerk", 20);
        staff_members.add(velma);
        staff_members.add(shaggy);
        for(int i = 0; i < num_days; i++){
            //each step in here represents one day
            if(weekly_day_count == 6){
                is_store_open = false;
                System.out.println("Today is Sunday, we are closed! Sorry for the inconvenience. Best, FNMS simulation.");
                weekly_day_count = 0;
                continue;
            }
            is_store_open = true;
            //we need to first assign an employee to this day
            //pick a random staff
            //okay so now we can assign an employee to this day
            //pick a random number between 0 and the size of the staff
            weekly_day_count++;
            int rand_staff_index = r.nextInt(2);
            if(rand_staff_index == 1){
                //then we have velma
                if(velma.getConsecutive_work_days_() <= 3){
                    daily_clerk = velma;
                    shaggy.setConsecutive_work_days_(0);
                    velma.setConsecutive_work_days_(velma.getConsecutive_work_days_() + 1);
                }
                else{
                    daily_clerk = shaggy;
                    velma.setConsecutive_work_days_(0);
                    shaggy.setConsecutive_work_days_(shaggy.getConsecutive_work_days_() + 1);
                }
            }
            else {
                //then we have shaggy work
                if(shaggy.getConsecutive_work_days_() <= 3){
                    daily_clerk = shaggy;
                    velma.setConsecutive_work_days_(0);
                    shaggy.setConsecutive_work_days_(shaggy.getConsecutive_work_days_() + 1);
                }
                else{
                    daily_clerk = velma;
                    shaggy.setConsecutive_work_days_(0);
                    velma.setConsecutive_work_days_(velma.getConsecutive_work_days_() + 1);
                }
            }

            //now that we have our clerk for the day we can start writing out the tasks the clerks should complete
            daily_clerk.ArriveAtStore(i);
            //have the daily clerk go through the items waiting and see if they need to be added to the inventory/if they have arrived
            for(int j = 0; j < items_waiting.size(); j++){
                //first get the day the item is supposed to arrive and compare it to today
                Item current_item_waiting = items_waiting.get(j);
                if(current_item_waiting.getDayArrived_() == i){
                    //then we add it to the map corresponding to the item type id
                    inventory.get(current_item_waiting.getItem_type_id()).add(current_item_waiting);
                    //then remove it from the items waiting ArrayList
                    items_waiting.remove(current_item_waiting);
                    //log the item that was added to the inventory
                    System.out.println(daily_clerk.getName_() + " added the waiting item " + current_item_waiting.getName_() + " to the inventory.");
                }
            }
            //get the money in the register
            double money_in_register = daily_clerk.CheckRegister();
            //if the money in the register is less than 75 we need to have the clerk go to the bank
            if(money_in_register < 75){
                money_withdrawn_ += daily_clerk.GoToBank(); //increment the money withdrawn from the bank
            }
            ArrayList<Integer> order_list = daily_clerk.DoInventory(inventory); // we need to get a shopping list after the clerk checks the inventory
            if(order_list.size() != 0){ //if we actually had items we need to order
                ArrayList<Item> items_ordered = daily_clerk.PlaceAnOrder(order_list, i); //find the items the daily clerk need to order
                items_waiting.addAll(items_ordered); //add them to the items waiting ArrayList
            }

            //There will be 4 to 10 buying Customers and 1 to 4 selling Customers each day.
            ArrayList<Customer> daily_customers = GenerateDailyCustomers(i);
            //the clerk will now deal with each customer that arrives at the store
            sold_items_.addAll(daily_clerk.OpenTheStore(daily_customers, inventory, i));

            //then clerk cleans the store
            daily_clerk.CleanTheStore(inventory);
            //then clerk leaves the store
            daily_clerk.LeaveStore(i);


        }
        PrintSummary();
    }
    private void PrintSummary(){
        //print items left in the inventory and the sum of their purchasePrices
        System.out.println("The simulation has concluded, below is a summary of the final state of the store.");
        System.out.println("::::::::::Final Inventory::::::::::");
        double total_purchase_price = 0;
        for (Map.Entry<Integer, ArrayList<Item>> entry : inventory.entrySet()) {
            System.out.println();
            for(Item item: entry.getValue()) {
                System.out.print(item.getName_() + "   ");
                total_purchase_price += item.getPurchasePrice_();
            }
            System.out.println();
        }
        System.out.println("Total Inventory Value: $" + total_purchase_price);
        System.out.println("::::::::::Sold Items::::::::::");
        //print the items sold, including the day sold and the sale price
        double money_from_sales = 0;
        for(Item item: sold_items_){
            System.out.println(item.getName_() + "  Day Sold: " + item.getDaySold_() + "  Sale Price: $" + item.getSalePrice_());
            money_from_sales += item.getSalePrice_();
        }
        System.out.println("Total Money from Sales: $" + money_from_sales);

        System.out.println("::::::::::Money In Cash Register::::::::::");
        //print the amount of money left in the register
        System.out.println("Amount: $" + CashRegister.money_);


        System.out.println("::::::::::Money Withdrawn from Cash Register::::::::::");
        //print the amount of money withdraw from the register
        System.out.println("Amount: $" + money_withdrawn_);
    }
}


// Main
public class Main {

    public static void main(String[] args) {
	// write your code here
        Store store = new Store();
        store.RunSimulation(2);
    }
}
