package com.imooc.order.utils;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Created by Patrick
 * 2018/5/16
 */
public class JsonUtil {

    public static String toJSON(Object object) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.setPrettyPrinting();
        Gson gson = gsonBuilder.create();
        return gson.toJson(object);
    }
}
