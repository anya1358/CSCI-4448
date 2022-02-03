package com.company;

import java.util.Vector;

// Superclass
class Item {
    String name;
    float purchasePrice;
    float listPrice;
    boolean newOrUsed;
    String dayArrived;
    String condition;
    float salePrice;
    String daySold;
}

// Subclass of Item
class Players extends Item {

}

// Subclass of Players
class MP3 extends Players {

}

// Subclass of Players
class CD_P extends Players {

}

// Subclass of Players
class RecordPlayer extends Players {

}

// Subclass of Item
class Instruments extends Item {

}

// Subclass of Instruments
class Stringed extends Instruments {
    boolean electric;
}

// Subclass of Stringed
class Mandolin extends Stringed {

}

// Subclass of Stringed
class Guitar extends Stringed {

}

// Subclass of Stringed
class Bass extends Stringed {

}

// Subclass of Instruments
class Wind extends Instruments {

}

// Subclass of Wind
class Harmonica extends Wind {
    String key;
}

// Subclass of Wind
class Flute extends Wind {
    String type;
}

// Subclass of Item
class Music extends Item {
    String band;
    String album;
}

// Subclass of Music
class CD_M extends Music {

}

// Subclass of Music
class Vinyl extends Music {

}

// Subclass of Music
class PaperScore extends Music {

}

// Subclass of Item
class Clothing extends Item {

}

// Subclass of Clothing
class Hats extends Clothing {
    char hatSize;
}

// Subclass of Clothing
class Shirts extends Clothing {
    char shirtSize;
}

// Subclass of Clothing
class Bandanas extends Clothing {

}

// Subclass of Item
class Accessories extends Item {

}

// Subclass of Accessories
class Strings extends Accessories {
    String type;
}

// Subclass of Accessories
class Cables extends Accessories {
    int length;
}

// Subclass of Accessories
class PracticeAmps extends Accessories {
    int wattage;
}

class Store {
    String name;
    Vector<Item> items = new Vector<Item>();
    Vector<Staff> staff_members = new Vector<Staff>;
    boolean is_store_open;
    Vector<Item> sold_items = new Vector<Item>();
    int money_earned;
    Vector<Customer> customers = new Vector<Customer>();

    // Not sure if needed
    // Store() {
    //
    // }

    // void PrintSummary() {
    //
    // }

    // void Simulate() {
    //
    // }

    // void EndSimulation() {
    //
    // }

}

class CashRegister {
    float money;
}

class Customer {
    int customer_number;
    boolean selling_or_buying;
    Vector<Item> items_to_sell = new Vector<Item>();
    Vector<Item> items_to_buy = new Vector<Item>();

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
    String name;
    int work_days;
    String type;

    // void ArriveAtStore() {
    //
    // }

    // void LeaveStore() {
    //
    // }
}

// Subclass of Staff
class Clerk extends Staff {
    // void OpenStore() {
    //
    // }

    // void CheckRegister() {
    //
    // }

    // void GoToBank() {
    //
    // }

    // void DoInventory() {
    //
    // }

    // void PlaceAnOrder() {
    //
    // }

    // void CleanTheStore() {
    //
    // }
}

// Main
public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}
