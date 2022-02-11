package com.company;

//super class
public class Item {

    //super class constructor
    Item(String name, double purchasePrice, int newOrUsed, int dayArrived, int condition){
        name_ = name;
        purchasePrice_ = purchasePrice;
        listPrice_ = 2 * purchasePrice; //list price is automatically 2 times the purchase price
        newOrUsed_ = newOrUsed;
        dayArrived_ = dayArrived;
        condition_ = condition;
        setString_condition_(condition);
        setNew_or_used_string_(newOrUsed_);
    }
    //private variables
    private final String name_;
    private double purchasePrice_;
    private double listPrice_;
    private final int newOrUsed_;
    private final int dayArrived_;
    private int condition_;
    private double salePrice_;
    private int daySold_;
    private int item_type_id;

    public String getNew_or_used_string_() {
        return new_or_used_string_;
    }

    public void setNew_or_used_string_(int new_or_used) {
        if(new_or_used == 1){
            this.new_or_used_string_ = "new";
        }
        else{
            this.new_or_used_string_ = "used";
        }
    }

    private String new_or_used_string_;

    public String getString_condition_() {
        return string_condition_;
    }

    //this function takes the numbered condition and converts it to a string
    public void setString_condition_(int condition) {
        this.string_condition_ = switch (condition) {
            case 1 -> "poor";
            case 2 -> "fair";
            case 3 -> "good";
            case 4 -> "very good";
            case 5 -> "excellent";
            default -> "";
        };
    }

    private String string_condition_;

    //function that handles when an item is broke by a staff member cleaning the store
    public void ItemBroke(){
        this.condition_--;
        setString_condition_(this.condition_);
        this.listPrice_ -= 0.2 * this.listPrice_; //list price decrements by 20%
    }
    public String getName_() {
        return name_;
    }

    public double getPurchasePrice_() {
        return purchasePrice_;
    }

    public void setPurchasePrice_(double purchasePrice_) {
        this.purchasePrice_ = purchasePrice_;
        this.listPrice_ = 2 * purchasePrice_;
    }

    public double getListPrice_() {
        return listPrice_;
    }

    public int isNewOrUsed_() {
        return newOrUsed_;
    }

    public int getDayArrived_() {
        return dayArrived_;
    }

    public int getCondition_() {
        return condition_;
    }

    public double getSalePrice_() {
        return salePrice_;
    }

    public void setSalePrice_(double salePrice_) {
        this.salePrice_ = salePrice_;
    }

    public int getDaySold_() {
        return daySold_;
    }

    public void setDaySold_(int daySold_) {
        this.daySold_ = daySold_;
    }

    public int getItem_type_id() {
        return item_type_id;
    }

    public void setItem_type_id(int item_type_id) {
        this.item_type_id = item_type_id;
    }
}
