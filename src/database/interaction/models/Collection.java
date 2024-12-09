package database.interaction.models;

import database.data.CollectionData;

public abstract class Collection {
    public abstract Iterable<CollectionData> getAll();
}
