package database.interaction.models;

import database.data.OrderData;

public abstract class Order {
    public abstract void create(OrderData order);

    public abstract Iterable<OrderData> getWithUser(String userId);
    public abstract Iterable<OrderData> getDoneWithUser(String userId);
    public abstract Iterable<OrderData> getPendingWithUser(String userId);
}
