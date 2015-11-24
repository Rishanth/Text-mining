package com.vaagmi.vtm.service;

import java.util.regex.Pattern;

/**
 * Created by rishii on 7/11/2015.
 */
public class remove_Extra_Comments {
    public static  String remove_Extra(String extra)
    {
        extra = extra.replace(","," ").replace("!","").replace("?","").replace("."," ").replace("...","");
        return extra;
    }
}
