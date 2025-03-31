package ru.volnenko.maven.plugin.databasedoc.api;

import lombok.NonNull;
import ru.volnenko.maven.plugin.databasedoc.generator.ValueGenerator;
import ru.volnenko.maven.plugin.databasedoc.model.Value;

public interface IValueGenerator extends IGenerator {

    @NonNull
    IValueGenerator stringBuilder(@NonNull StringBuilder stringBuilder);

    @NonNull
    IValueGenerator index(@NonNull Integer index);

    @NonNull
    IValueGenerator value(@NonNull Value value);

}
