package snacks1;

import java.util.ArrayList;
import java.util.List;

public class Customers extends User {
    private List<BillingInfo> billing;
    private String shopingCart;

    public Customers(String name, int age, String email, String address, String password, String phone) {
        super(name, age, email, address, password, phone);
        this.billing = new ArrayList<>();
        this.shopingCart = new ShoppingCart().toString();
    }

}
