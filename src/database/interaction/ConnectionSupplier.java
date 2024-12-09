package database.interaction;

public abstract class ConnectionSupplier<T extends Connection> {
    public abstract T getConnection();
    public abstract void returnConnection(T connection);
}
