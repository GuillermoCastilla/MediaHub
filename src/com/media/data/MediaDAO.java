package com.media.data;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.media.service.MediaService;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;

import java.util.ArrayList;

public class MediaDAO {
    private Gson gson = new Gson().newBuilder().setPrettyPrinting().create();
    //private Type listType = new TypeToken<ArrayList<MediaService>>(){}.getType();

    public void saveToJson(ArrayList<MediaService> serviceList){

    }

    public ArrayList loadFromJson(){

        ArrayList<String> list = new ArrayList();

        return list;
    }
}
