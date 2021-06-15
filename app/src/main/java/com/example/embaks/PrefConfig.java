package com.example.embaks;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class PrefConfig {

    public static void writeListInPref(Context context, List<SoruModel1> list,String LIST_KEY){

        Gson gson = new Gson();
        String jsonString = gson.toJson(list);
        
        SharedPreferences pref = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = pref.edit();
        editor.putString(LIST_KEY,jsonString);
        editor.apply();
    }

    public static List<SoruModel1> readListFromPref(Context context,String LIST_KEY){
        SharedPreferences pref = PreferenceManager.getDefaultSharedPreferences(context);
        String jsonString = pref.getString(LIST_KEY,"");

        Gson gson = new Gson();
        Type type = new TypeToken<ArrayList<SoruModel1>>(){}.getType();
        List<SoruModel1> list = gson.fromJson(jsonString,type);
        return list;
    }
}
