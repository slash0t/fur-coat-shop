package database.interaction.models;

import database.data.ProductSetData;

public abstract class ProductSet {
    public abstract void create(ProductSetData productSet);

    public abstract ProductSetData getWithCart(String cartId);
    public abstract ProductSetData getWithCartProductSize(String cartId, String productId, String size);

    public abstract void changeCountById(String id, int count);

    public abstract void deleteById(String id);
}
