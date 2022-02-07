package com.company;

import java.util.ArrayList;
import java.util.Map;
import java.util.Random;
import java.util.Vector;
//There are three of each lowest subclass of merchandise items (3 CDs, 3 Shirts, 3 Guitars, etc.) in the store
//at the start of the simulation. Determine a name (any way you choose) and a purchase price ($1 to $50) per
//item. The list price will be set to 2 x the purchase price for each item. The attribute dayArrived should be set to
//0 for the initial item set. Condition has five levels: poor, fair, good, very good, or excellent. The attributes
//salePrice and daySold will be set when the item is sold.
// Superclass

// Subclass of Item
class Players extends Item {

    Players(String name, double purchasePrice, boolean newOrUsed, int dayArrived, String condition) {
        super(name, purchasePrice, newOrUsed, dayArrived, condition);
    }
}

// Subclass of Players
class MP3 extends Players {

    MP3(String name, double purchasePrice, boolean newOrUsed, int dayArrived, String condition) {
        super(name, purchasePrice, newOrUsed, dayArrived, condition);
    }
}

// Subclass of Players
class CD_P extends Players {

    CD_P(String name, double purchasePrice, boolean newOrUsed, int dayArrived, String condition) {
        super(name, purchasePrice, newOrUsed, dayArrived, condition);
    }
}

// Subclass of Players
class RecordPlayer extends Players {

    RecordPlayer(String name, double purchasePrice, boolean newOrUsed, int dayArrived, String condition) {
        super(name, purchasePrice, newOrUsed, dayArrived, condition);
    }
}

// Subclass of Item
class Instruments extends Item {


    Instruments(String name, double purchasePrice, boolean newOrUsed, int dayArrived, String condition) {
        super(name, purchasePrice, newOrUsed, dayArrived, condition);
    }
}

// Subclass of Instruments
class Stringed extends Instruments {
    private boolean electric_;


    Stringed(String name, double purchasePrice, boolean newOrUsed, int dayArrived, String condition, boolean electric) {
        super(name, purchasePrice, newOrUsed, dayArrived, condition);
        electric_ = electric;
    }

    public boolean isElectric_() {
        return electric_;
    }

    public void setElectric_(boolean electric_) {
        this.electric_ = electric_;
    }
}

// Subclass of Stringed
class Mandolin extends Stringed {


    Mandolin(String name, double purchasePrice, boolean newOrUsed, int dayArrived, String condition, boolean electric) {
        super(name, purchasePrice, newOrUsed, dayArrived, condition, electric);
    }
}

// Subclass of Stringed
class Guitar extends Stringed {
    Guitar(String name, double purchasePrice, boolean newOrUsed, int dayArrived, String condition, boolean electric) {
        super(name, purchasePrice, newOrUsed, dayArrived, condition, electric);
    }
}

// Subclass of Stringed
class Bass extends Stringed {


    Bass(String name, double purchasePrice, boolean newOrUsed, int dayArrived, String condition, boolean electric) {
        super(name, purchasePrice, newOrUsed, dayArrived, condition, electric);
    }
}

// Subclass of Instruments
class Wind extends Instruments {

    Wind(String name, double purchasePrice, boolean newOrUsed, int dayArrived, String condition) {
        super(name, purchasePrice, newOrUsed, dayArrived, condition);
    }
}

// Subclass of Wind
class Harmonica extends Wind {
    private String key_;


    Harmonica(String name, double purchasePrice, boolean newOrUsed, int dayArrived, String condition, String key) {
        super(name, purchasePrice, newOrUsed, dayArrived, condition);
        key_ = key;
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


    Flute(String name, double purchasePrice, boolean newOrUsed, int dayArrived, String condition, String type) {
        super(name, purchasePrice, newOrUsed, dayArrived, condition);
        type_ = type;
    }

    public String getType_() {
        return type_;
    }
}

// Subclass of Item
class Music extends Item {
    String band_;
    String album_;


    Music(String name, double purchasePrice, boolean newOrUsed, int dayArrived, String condition, String band, String album) {
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


    CD_M(String name, double purchasePrice, boolean newOrUsed, int dayArrived, String condition, String band, String album) {
        super(name, purchasePrice, newOrUsed, dayArrived, condition, band, album);
    }
}

// Subclass of Music
class Vinyl extends Music {


    Vinyl(String name, double purchasePrice, boolean newOrUsed, int dayArrived, String condition, String band, String album) {
        super(name, purchasePrice, newOrUsed, dayArrived, condition, band, album);
    }
}

// Subclass of Music
class PaperScore extends Music {

    PaperScore(String name, double purchasePrice, boolean newOrUsed, int dayArrived, String condition, String band, String album) {
        super(name, purchasePrice, newOrUsed, dayArrived, condition, band, album);
    }
}

// Subclass of Item
class Clothing extends Item {

    Clothing(String name, double purchasePrice, boolean newOrUsed, int dayArrived, String condition) {
        super(name, purchasePrice, newOrUsed, dayArrived, condition);
    }
}

// Subclass of Clothing
class Hats extends Clothing {
    char hatSize_;

    Hats(String name, double purchasePrice, boolean newOrUsed, int dayArrived, String condition, char hatSize) {
        super(name, purchasePrice, newOrUsed, dayArrived, condition);
        hatSize_ = hatSize;
    }

    public char getHatSize_() {
        return hatSize_;
    }
}

// Subclass of Clothing
class Shirts extends Clothing {
    char shirtSize_;

    Shirts(String name, double purchasePrice, boolean newOrUsed, int dayArrived, String condition, char shirtSize) {
        super(name, purchasePrice, newOrUsed, dayArrived, condition);
        shirtSize_ = shirtSize;
    }
}

// Subclass of Clothing
class Bandanas extends Clothing {

    Bandanas(String name, double purchasePrice, boolean newOrUsed, int dayArrived, String condition) {
        super(name, purchasePrice, newOrUsed, dayArrived, condition);
    }
}

// Subclass of Item
class Accessories extends Item {

    Accessories(String name, double purchasePrice, boolean newOrUsed, int dayArrived, String condition) {
        super(name, purchasePrice, newOrUsed, dayArrived, condition);
    }
}

// Subclass of Accessories
class Strings extends Accessories {
    String type_;

    Strings(String name, double purchasePrice, boolean newOrUsed, int dayArrived, String condition, String type) {
        super(name, purchasePrice, newOrUsed, dayArrived, condition);
        type_ = type;
    }
}

// Subclass of Accessories
class Cables extends Accessories {
    int length_;

    Cables(String name, double purchasePrice, boolean newOrUsed, int dayArrived, String condition, int length) {
        super(name, purchasePrice, newOrUsed, dayArrived, condition);
        length_ = length;
    }
}

// Subclass of Accessories
class PracticeAmps extends Accessories {
    int wattage_;

    PracticeAmps(String name, double purchasePrice, boolean newOrUsed, int dayArrived, String condition, int wattage) {
        super(name, purchasePrice, newOrUsed, dayArrived, condition);
        wattage_ = wattage;
    }
}

class CashRegister {
    public static double money_ = 0;
}

class Customer {
    int customer_number;
    boolean selling_or_buying;
    Vector<Item> items_to_sell;

    {
        items_to_sell = new Vector<Item>();
    }

    Vector<Item> items_to_buy;

    {
        items_to_buy = new Vector<Item>();
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

    public void setName_(String name_) {
        this.name_ = name_;
    }

    public int getConsecutive_work_days_() {
        return consecutive_work_days_;
    }

    public void setConsecutive_work_days_(int consecutive_work_days_) {
        this.consecutive_work_days_ = consecutive_work_days_;
    }

    public String getType_() {
        return type_;
    }

    public void setType_(String type_) {
        this.type_ = type_;
    }

    void ArriveAtStore(int day_arrived) {
        System.out.println(name_ + " arrives at the store on Day " + day_arrived + ".");
    }

    // void LeaveStore() {
    //
    // }
}

// Subclass of Staff
class Clerk extends Staff {
    Clerk(String name, String type) {
        super(name, type);
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
    public void DoInventory() {
        //loop through all of the items, and count each subclass
        //if the count is equal to 0, then PlaceAnOrder()
    }

    public void PlaceAnOrder(Item item) {
        //basically just order 3 of whatever item is passed with random purchase price
        //purchase price is payed for by removing money from the cash register
        //items should arrive in the next 1 to 3 days
        //print out what we are doing
    }
    public void OpenTheStore(ArrayList<Customer> customers){
        //respond to the arriving customers
    }
    // void CleanTheStore() {
    //
    // }
}

class Store {
    private String name;
    private ArrayList<Item> items;

    {
        items = new ArrayList<>();
    }
    private double money_withdrawn_;
    private ArrayList<Staff> staff_members = new ArrayList<>();
    private boolean is_store_open;
    private ArrayList<Item> sold_items = new ArrayList<>();
    private int money_earned;
    private ArrayList<Item> inventory = new ArrayList<>();
    private ArrayList<Item> items_waiting = new ArrayList<>();
    private ArrayList<Customer> customers = new ArrayList<>();
    // Not sure if needed
    Store(int num_days) {
        //need to initialize the simulation here, we want to run num_days iterations
        //when we first initialize the simulation we know
        //add Shaggy and Velma to the staff Array list

        Clerk velma = new Clerk("Velma", "clerk");
        Clerk shaggy = new Clerk("Shaggy", "clerk");
        staff_members.add(velma);
        staff_members.add(shaggy);
        money_withdrawn_ = 0;

        //need to add customers to come into the store here
        //there should be 1 to 4 selling and 4 to 10 buying
        Random r = new Random();

        //need to now add items to the store initially
        for (int i = 0; i < 3; i++){
            Item paper_score = new PaperScore("Paper Score " + String.valueOf(i + 1), );
            Item cd = new CD_M();
            Item vinyl = new Vinyl();
            Item cd_p = new CD_P();
            Item record_player = new RecordPlayer();
            Item mp3 = new MP3();
            Item guitar = new Guitar();
            Item bass = new Bass();
            Item mandolin = new Mandolin();
            Item flute = new Flute();
            Item harmonica = new Harmonica();
            Item hat = new Hats();
            Item shirt = new Shirts();
            Item bandana = new Bandanas();
            Item practice_amps = new PracticeAmps();
            Item cable = new Cables();
            Item string = new Strings();
            inventory.add(paper_score);
            inventory.add(cd);
            inventory.add(vinyl);
            inventory.add(cd_p);
            inventory.add(record_player);
            inventory.add(mp3);
            inventory.add(guitar);
            inventory.add(bass);
            inventory.add(mandolin);
            inventory.add(flute);
            inventory.add(harmonica);
            inventory.add(hat);
            inventory.add(shirt);
            inventory.add(bandana);
            inventory.add(practice_amps);
            inventory.add(cable);
            inventory.add(string);
        }
        //probably add a new function here
        //now iterate through the days
        int weekly_day_count = 0; //this variable is responsible for keeping track of how many weeks we are open for,
        //assume each week begins on monday, so the 7th day we will always be closed
        Clerk daily_clerk;
        for(int i = 0; i < num_days; i++){
            //each step in here represents one day
            //we need to first assign an employee to this day
            //pick a random staff
            if(weekly_day_count == 6){
                is_store_open = false;
                System.out.println("Today is Sunday, we are closed! Sorry for the inconvenience. Best, FNMS simulation.");
                weekly_day_count = 0;
                continue;
            }
            is_store_open = true;

            //okay so now we can assign an employee to this day
            //pick a random number between 0 and the size of the staff
            weekly_day_count++;
            Random r = new Random();
            int low = 10;
            int high = 100;
            int rand_staff_index = r.nextInt(2);
            if(rand_staff_index == 1){
                //then we have velma
                if(velma.getConsecutive_work_days_() <= 3){
                    daily_clerk = velma;
                }
                else{
                    daily_clerk = shaggy;
                }
            }
            else {
                //then we have shaggy work
                if(shaggy.getConsecutive_work_days_() <= 3){
                    daily_clerk = shaggy;
                }
                else{
                    daily_clerk = velma;
                }
            }

            //now that we have our clerk for the day we can start writing out the tasks the clerks should complete
            daily_clerk.ArriveAtStore(i + 1);
            double money_in_register = daily_clerk.CheckRegister();
            if(money_in_register < 75){
                money_withdrawn_ += daily_clerk.GoToBank();
            }
            daily_clerk.DoInventory();
        }
    }
}


// Main
public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}
