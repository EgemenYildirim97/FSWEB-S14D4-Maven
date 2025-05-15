package org.example.model;

public class Store {
    public static void main(String[] args) {
        ProductForSale[] productsForSale = new ProductForSale[3];

        productsForSale[0] = new Chocolate("Çikolata", 15, "Sütlü çikolata keyfi", "%55");
        productsForSale[1] = new Coke("İçecek", 5, "Gazlı ferahlatıcı", "1 Litre");
        productsForSale[2] = new Bread("Unlu Mamül", 8, "Taze ve lezzetli", "Tam Buğday");

        Store myStore = new Store();
        myStore.listProducts(productsForSale);
    }

    public static void listProducts(ProductForSale[] products) {
        System.out.println("Mağazadaki Ürünler:");
        for (ProductForSale product : products) {
            product.showDetails();
        }
    }
}