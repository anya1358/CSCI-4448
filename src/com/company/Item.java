package com.company;

public class Item {
    Item(String name, double purchasePrice, int newOrUsed, int dayArrived, int condition){
        name_ = name;
        purchasePrice_ = purchasePrice;
        listPrice_ = 2 * purchasePrice;
        newOrUsed_ = newOrUsed;
        dayArrived_ = dayArrived;
        condition_ = condition;
        setString_condition_(condition);
    }
    private String name_;
    private double purchasePrice_;
    private double listPrice_;
    private int newOrUsed_;
    private int dayArrived_;
    private int condition_;
    private double salePrice_;
    private int daySold_;
    private int item_type_id;

    public String getString_condition_() {
        return string_condition_;
    }

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

    public void ItemBroke(){
        this.condition_--;
        setString_condition_(this.condition_);
        this.listPrice_ -= 0.2 * this.listPrice_;
    }
    public String getName_() {
        return name_;
    }

    public void setName_(String name_) {
        this.name_ = name_;
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

    public void setListPrice_(double listPrice_) {
        this.listPrice_ = listPrice_;
    }

    public int isNewOrUsed_() {
        return newOrUsed_;
    }

    public void setNewOrUsed_(int newOrUsed_) {
        this.newOrUsed_ = newOrUsed_;
    }

    public int getDayArrived_() {
        return dayArrived_;
    }

    public void setDayArrived_(int dayArrived_) {
        this.dayArrived_ = dayArrived_;
    }

    public int getCondition_() {
        return condition_;
    }

    public void setCondition_(int condition_) {
        this.condition_ = condition_;
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
