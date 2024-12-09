package database.interaction.models;

import database.data.UserData;

public abstract class User {
    public abstract void create(UserData user);

    public abstract UserData getByMail(String mail);
    public abstract UserData getById(String id);

    public abstract void updateAddress(String id, String address);

    public abstract void deleteById(String id);
}
