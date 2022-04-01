package main.data;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Serializer {


    Data data = new Data();

    Gson gson = new GsonBuilder().serializeNulls().create();




}
