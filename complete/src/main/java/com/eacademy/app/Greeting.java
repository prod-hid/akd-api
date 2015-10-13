package com.eacademy.app;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.List;

public class Greeting {

//    private final long id;
//    private final String content;
    private final List<ExampleClass> record;

//    public Greeting(long id, String content, List<String> list) {
//        this.id = id;
//        this.content = content;
//        this.list = list;
//    }

    public Greeting(List<ExampleClass> records){
        this.record = records;
    }

//    public long getId() {
//        return id;
//    }
//
//    public String getContent() {
//        return content;
//    }

    public List<ExampleClass> getRecords(){
        return record;
    }
}

