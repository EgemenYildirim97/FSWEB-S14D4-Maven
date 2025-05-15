package org.example.model;

public class Chocolate extends ProductForSale{
    private String cocoaPercentage;
    public Chocolate(String type, int price, String description) {
        super(type, price, description);
    }

    public Chocolate(String type, int price, String description, String cocoaPercentage) {
        super(type, price, description);
        this.cocoaPercentage = cocoaPercentage;
    }
    public String getCocoaPercentage() {
        return cocoaPercentage;
    }

    @Override
    public void showDetails() {
        System.out.println("Ürün Tipi: " + getType());
        System.out.println("Fiyat: " + getPrice() + " TL");
        System.out.println("Açıklama: " + getDescription());
        System.out.println("Kakao Oranı: " + cocoaPercentage);
        System.out.println("--------------------");
    }
}
