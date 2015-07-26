package es.olidroide.immutablesexample.model;

import org.immutables.gson.Gson;
import org.immutables.value.Value;

@Gson.TypeAdapters
@Value.Immutable
public abstract class User {

    public abstract int id();

    public abstract String username();
}
