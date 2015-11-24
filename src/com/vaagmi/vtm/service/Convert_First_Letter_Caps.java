package com.vaagmi.vtm.service;

import com.google.gson.Gson;
import com.vaagmi.vtm.service.Convert_File_To_String;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by rishii on 7/11/2015.
 */
public class Convert_First_Letter_Caps {
    String s = "";
    static String Cities_File = "";
    static String match_find = "";
    static String getMatch_find = "";
    static String match_else = "";
    static HashMap mer = new HashMap();

    public static String Convert_First_Char(String r) {
        Gson gson_object = new Gson();
        try {
            Cities_File = Convert_File_To_String.readFileAsString("C:\\Users\\rishii\\IdeaProjects\\Vaagmi\\src\\com\\vaagmi\\vtm\\util\\JSON_Files\\Cities.json");
            Json_Array_Extractor map_conv = gson_object.fromJson(Cities_File, Json_Array_Extractor.class);
            for (int i = 0; i < map_conv.getGet_Countries().length; i++) {
                mer.put(map_conv.getGet_Countries()[i].toUpperCase(), map_conv.getGet_Countries()[i]);
            }
            String Capital_Pattern = "([A-Z]{2,})|(?<=\\().+?(?=\\))";
            //String Caps = "(?<=\\().+?(?=\\))";
            Pattern match_capital = Pattern.compile(Capital_Pattern);
            Matcher capital_match = match_capital.matcher(r);
            while (capital_match.find()) {

                 String s= (String)mer.get(capital_match.group());

                if (s!= null) {

                      r = r.replace(capital_match.group(),s);
                    return r;

                } else {
                    char[] stringArray = capital_match.group().toCharArray();
                    for (int l = 1; l < stringArray.length; l++) {
                        stringArray[l] = Character.toLowerCase(stringArray[l]);
                        match_else = new String(stringArray);

                    }
                    //System.out.println("dee"+match_find);
                   r= r.replace(capital_match.group(), match_else);
                   return  r;
                   // System.out.println("found_unknown"+r);

                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
return "hi";
    }
}







