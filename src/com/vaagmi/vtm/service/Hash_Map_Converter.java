package com.vaagmi.vtm.service;

import java.util.HashMap;

/**
 * Created by rishii on 7/11/2015.
 */
public class Hash_Map_Converter {

   public static HashMap map_convertor = new HashMap();
    public static  HashMap Convert_Hashmap(int range,Json_Array_Extractor js)
    {
        for (int i = 0; i <range; i++) {
            map_convertor.put(js.getGet_Countries()[i].toUpperCase(),js.getGet_Countries()[i]);

        }
        return map_convertor;
    }
}
