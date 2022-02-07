package com.company;

public class Item {
    Item(String name, double purchasePrice, boolean newOrUsed, int dayArrived, String condition){
        name_ = name;
        purchasePrice_ = purchasePrice;
        listPrice_ = 2 * purchasePrice;
        newOrUsed_ = newOrUsed;
        dayArrived_ = dayArrived;
        condition_ = condition;
    }
    private String name_;
    private double purchasePrice_;
    private double listPrice_;
    private boolean newOrUsed_;
    private int dayArrived_;
    private String condition_;
    private double salePrice_;
    private String daySold_;

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
    }

    public double getListPrice_() {
        return listPrice_;
    }

    public void setListPrice_(double listPrice_) {
        this.listPrice_ = listPrice_;
    }

    public boolean isNewOrUsed_() {
        return newOrUsed_;
    }

    public void setNewOrUsed_(boolean newOrUsed_) {
        this.newOrUsed_ = newOrUsed_;
    }

    public int getDayArrived_() {
        return dayArrived_;
    }

    public void setDayArrived_(int dayArrived_) {
        this.dayArrived_ = dayArrived_;
    }

    public String getCondition_() {
        return condition_;
    }

    public void setCondition_(String condition_) {
        this.condition_ = condition_;
    }

    public double getSalePrice_() {
        return salePrice_;
    }

    public void setSalePrice_(double salePrice_) {
        this.salePrice_ = salePrice_;
    }

    public String getDaySold_() {
        return daySold_;
    }

    public void setDaySold_(String daySold_) {
        this.daySold_ = daySold_;
    }
}
