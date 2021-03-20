package com.newbetter.sdk.json.gson;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GsonHelper {

    private static final Gson gson = new GsonBuilder().create();

    public static <T> T toBean(String json, Class<T> clazz) {
        return gson.fromJson(json, clazz);
    }

    public static String toJson(Object bean) {
        return gson.toJson(bean);
    }


}
