package es.olidroide.immutablesexample.model.mapper;

import android.support.annotation.NonNull;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import es.olidroide.immutablesexample.model.GsonAdaptersUser;
import es.olidroide.immutablesexample.model.User;

public class JsonFromUser implements Mapper<String, User> {

    @Override
    public String map(@NonNull User user) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapterFactory(new GsonAdaptersUser());
        Gson gson = gsonBuilder.create();

        return gson.toJson(user);
    }
}
