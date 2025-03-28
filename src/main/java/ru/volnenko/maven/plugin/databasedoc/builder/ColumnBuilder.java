package ru.volnenko.maven.plugin.databasedoc.builder;

import lombok.NonNull;
import ru.volnenko.maven.plugin.databasedoc.api.IColumnBuilder;
import ru.volnenko.maven.plugin.databasedoc.model.CreateTable;
import ru.volnenko.maven.plugin.databasedoc.model.Root;

public final class ColumnBuilder implements IColumnBuilder {

    @NonNull
    private final CreateTableBuilder createTableBuilder;

    public ColumnBuilder(@NonNull final CreateTableBuilder createTableBuilder) {
        this.createTableBuilder = createTableBuilder;
    }

    @NonNull
    public ColumnItemBuilder add() {
        return new ColumnItemBuilder(this);
    }

    @Override
    @NonNull
    public CreateTable createTable() {
        return createTableBuilder.createTable();
    }

    @NonNull
    @Override
    public Root root() {
        return createTableBuilder.root();
    }

    @Override
    @NonNull
    public ChangeBuilder change() {
        return createTableBuilder.change();
    }

}
