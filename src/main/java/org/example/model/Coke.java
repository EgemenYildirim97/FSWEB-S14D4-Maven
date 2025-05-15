package org.example.model;

public class Coke extends ProductForSale{
    private String size;

    public Coke(String type, int price, String description) {
        super(type, price, description);
    }

    public Coke(String type, int price, String description, String size) {
        super(type, price, description);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    @Override
    public void showDetails() {
        System.out.println("Ürün Tipi: " + getType());
        System.out.println("Fiyat: " + getPrice() + " TL");
        System.out.println("Açıklama: " + getDescription());
        System.out.println("Boyut: " + size);
        System.out.println("--------------------");
    }



}
