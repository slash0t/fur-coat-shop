package database.interaction.models;

import database.data.ProductCartData;

public abstract class ProductCart {
    public abstract void create(ProductCart cart);

    public abstract ProductCartData getWithEditor(String editorId);

    public abstract void changeEditorById(String cartId, String editorId);
}
