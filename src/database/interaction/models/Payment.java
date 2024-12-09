package database.interaction.models;

import database.data.PaymentData;

public abstract class Payment {
    public abstract void create(PaymentData payment);

    public abstract PaymentData getById(String id);

    public abstract void makeSuccessful(String id);
    public abstract void makeCancelled(String id);
}
