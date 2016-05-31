package com.jniu.baidutakeoutui.bean;

/**
 * Created by Administrator on 2015/9/10.
 */
public class ShopInfo {

    private int shopImgResourceId;//图片资源ID
    private String shopName;//店名
    private float shopRating;//店铺评分
    private int salesVolume;//月销量
    private double playPrice;//起送费
    private double distribution;//配送费
    private int distributionTime;//平均配送时长
    private boolean isCard,isPay,isCoupons,isTicket;

    public ShopInfo(){
        salesVolume = 0;
        shopRating = 0;
        playPrice = 0;
        distribution = 0;
        distributionTime = 0;
        isCard = false;
        isPay = false;
        isCoupons = false;
        isTicket = false;
    }

    public boolean isCard() {
        return isCard;
    }

    public boolean isCoupons() {
        return isCoupons;
    }

    public boolean isPay() {
        return isPay;
    }

    public boolean isTicket() {
        return isTicket;
    }

    public void setIsCard(boolean isCard) {
        this.isCard = isCard;
    }

    public void setIsCoupons(boolean isCoupons) {
        this.isCoupons = isCoupons;
    }

    public void setIsPay(boolean isPay) {
        this.isPay = isPay;
    }

    public void setIsTicket(boolean isTicket) {
        this.isTicket = isTicket;
    }

    public double getDistribution() {
        return distribution;
    }

    public double getPlayPrice() {
        return playPrice;
    }

    public float getShopRating() {
        return shopRating;
    }

    public int getDistributionTime() {
        return distributionTime;
    }

    public int getSalesVolume() {
        return salesVolume;
    }

    public String getShopName() {
        return shopName;
    }

    public void setDistribution(double distribution) {
        this.distribution = distribution;
    }

    public void setDistributionTime(int distributionTime) {
        this.distributionTime = distributionTime;
    }

    public void setPlayPrice(double playPrice) {
        this.playPrice = playPrice;
    }

    public void setSalesVolume(int salesVolume) {
        this.salesVolume = salesVolume;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public void setShopRating(float shopRating) {
        this.shopRating = shopRating;
    }

    public int getShopImgResourceId() {
        return shopImgResourceId;
    }

    public void setShopImgResourceId(int shopImgResourceId) {
        this.shopImgResourceId = shopImgResourceId;
    }
}
