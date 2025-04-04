package ru.volnenko.maven.plugin.databasedoc.generator;

import lombok.NonNull;
import ru.volnenko.maven.plugin.databasedoc.model.impl.CreateType;

public interface ICreateTypeGenerator extends IGenerator {

    @NonNull
    ICreateTypeGenerator createType(@NonNull CreateType createType);

    @NonNull
    ICreateTypeGenerator serviceName(@NonNull String serviceName);

    @NonNull
    ICreateTypeGenerator dataBaseInfo(@NonNull String dataBaseInfo);

}
