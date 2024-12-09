package database.interaction.models;

import database.data.ProductData;

public abstract class Product {
    public abstract Iterable<ProductData> getWithCollection(String collectionId);
    public abstract Iterable<ProductData> getWithType(String typeId);
}
