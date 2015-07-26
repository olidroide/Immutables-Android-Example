package es.olidroide.immutablesexample.model.mapper;

import android.support.annotation.NonNull;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import es.olidroide.immutablesexample.model.GsonAdaptersUser;
import es.olidroide.immutablesexample.model.User;

public class UserFromJson implements Mapper<User, String> {

    @Override
    public User map(@NonNull String in) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapterFactory(new GsonAdaptersUser());
        Gson gson = gsonBuilder.create();

        return gson.fromJson(in, User.class);
    }
}
