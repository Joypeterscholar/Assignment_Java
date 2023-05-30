package snacks1;

public class Product {

        private int productId;
        private String productName;
        private double price;
        private String description;
        private enum category{};
        Product(int productId, String productName, double price, String description, ProductCategory category){
                this.productId = productId;
                this.productName = productName;
                this.price = price;
                this.description = description;

        }
}
