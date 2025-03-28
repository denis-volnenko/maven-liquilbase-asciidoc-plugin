package ru.volnenko.maven.plugin.databasedoc.builder;

import lombok.NonNull;
import ru.volnenko.maven.plugin.databasedoc.api.IChangeSetBuilder;
import ru.volnenko.maven.plugin.databasedoc.model.Root;

public final class ChangeSetBuilder implements IChangeSetBuilder {

    @NonNull
    private final DatabaseChangeLogBuilder databaseChangeLogBuilder;

    public ChangeSetBuilder(@NonNull final DatabaseChangeLogBuilder databaseChangeLogBuilder) {
        this.databaseChangeLogBuilder = databaseChangeLogBuilder;
    }

    @NonNull
    @Override
    public Root root() {
        return databaseChangeLogBuilder.root();
    }

    @Override
    @NonNull
    public ChangeSetItemBuilder add() {
        return new ChangeSetItemBuilder(this);
    }

}
