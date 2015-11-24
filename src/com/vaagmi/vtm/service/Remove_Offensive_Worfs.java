package com.vaagmi.vtm.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

/**
 * Created by rishii on 7/12/2015.
 */
public class  Remove_Offensive_Worfs {
    static String yk = "";
    static Map mr= new HashMap<>();
    static String [] op = new String[100];
    public static String remove_vulgar(String s) {
        try {
            String output = Convert_File_To_String.readFileAsString("C:\\Users\\rishii\\IdeaProjects\\Vaagmi\\src\\com\\vaagmi\\vtm\\util\\badwords.txt");
            //System.out.println(output);
            op =output.split("\n");}
        catch (Exception ex) {
            ex.printStackTrace();
        }
for(int i =0;i<op.length;i++)
{
    mr.put(op[i],op[i]);
}
       if(s.equals(mr.get(s)))
       {
           yk = s.replace(mr.get(s).toString(),"");
           return yk;
       }
        else
       {
           return s;
       }
    }
}
