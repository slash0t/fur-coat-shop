package database.interaction;

import database.interaction.models.*;

public abstract class Connection {
    private User user;
    private Type type;
    private Product product;
    private Collection collection;
    private ProductSet productSet;
    private Payment payment;
    private Order order;
    private ProductCart productCart;

    public User getUser() {
        return user;
    }

    public Type getType() {
        return type;
    }

    public Product getProduct() {
        return product;
    }

    public Collection getCollection() {
        return collection;
    }

    public ProductSet getProductSet() {
        return productSet;
    }

    public Payment getPayment() {
        return payment;
    }

    public Order getOrder() {
        return order;
    }

    public ProductCart getProductCart() {
        return productCart;
    }
}
