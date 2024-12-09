package database.interaction.models;

import database.data.TypeData;

public abstract class Type {
    public abstract TypeData getById(String id);
    public abstract Iterable<TypeData> getWithParent(String parentId);
}
