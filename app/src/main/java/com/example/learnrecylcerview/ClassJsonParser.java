package com.example.learnrecylcerview;

import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class ClassJsonParser {
    private static List<Cours> classes;
    private static final String TAG = "CLASS_JSON_PARSER";
    public static List<Cours> parse(String jsonStr){
        classes = new ArrayList<>();

        try {
            JSONArray jsonArray = new JSONArray(jsonStr);
            JSONObject jsonObject = jsonArray.getJSONObject(0);
            Log.d(TAG, jsonObject.toString());

            for (int i = 0; i < jsonArray.length(); i++) {
                jsonObject = jsonArray.getJSONObject(i);
                classes.add(new Cours(jsonObject.getInt("id"),
                        jsonObject.getString("title"),
                        jsonObject.getString("description")));
            }

        } catch (JSONException e) {
            e.printStackTrace();
        }
        return classes;
    }
}
