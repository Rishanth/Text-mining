
package com.vaagmi.vtm.model;
import com.google.gson.Gson;
import com.vaagmi.vtm.service.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by rishii on 7/11/2015.
 */
public class Text_Filteration {




    public static void main(String[] args) {
        Gson gson_object = new Gson();
        String  Input_File="";
        String Read_File_as_A_String = "";
        String Cities_File = "";
        String Input_file = "";
        Map return_map = new HashMap<>();
        try {
             Input_File =Convert_File_To_String.readFileAsString("C:\\Users\\rishii\\IdeaProjects\\Vaagmi\\src\\com\\vaagmi\\vtm\\util\\JSON_Files\\file4.json");
             Cities_File = Convert_File_To_String.readFileAsString("C:\\Users\\rishii\\IdeaProjects\\Vaagmi\\src\\com\\vaagmi\\vtm\\util\\JSON_Files\\Cities.json");
             Json_Array_Extractor map_conv= gson_object.fromJson(Cities_File, Json_Array_Extractor.class);
             return_map= Hash_Map_Converter.Convert_Hashmap(map_conv.getGet_Countries().length,map_conv);
              Wrap m=gson_object.fromJson(Input_File,Wrap.class);
              List regex_array = new ArrayList();
              regex_array.add("^([\\w,.\\(\\)]+\\s*){20}");//capture the first 20 words
              regex_array.add("[\\,\\!\\?\\...]");//unneccesary_actions
              //regex_array.add("[\\w]+(\\,|\\.|\\?|\\!|\\...)");
              regex_array.add("[fF]uck|[sS]hit|[bB]itch|I Love You|[C]rap");
              //System.out.println(m.r.body.getBpart()[0]);
              Iterator it = regex_array.iterator();
              while (it.hasNext()) {
                  //System.out.println();
                  Pattern pattern = Pattern.compile(it.next().toString());
                  Matcher match = pattern.matcher(m.r.body.getBpart()[0]);
                  while (match.find()) {
                      if (pattern.toString().equals("^([\\w,.\\(\\)]+\\s*){20}")) {

                       Input_file =  Convert_First_Letter_Caps.Convert_First_Char(match.group());//Action
                      }
                      else if(pattern.toString().equals("[\\,\\!\\?\\...]"))
                      {
                        Input_file=  remove_Extra_Comments.remove_Extra(Input_file);//Action

                      }
                      else
                      {
                         Input_file =   Remove_Offensive_Worfs.remove_vulgar(Input_file);
                      }
                  }
              }
            System.out.println(Input_file);
        }catch (Exception e) {
            e.printStackTrace();
        }

    }
  }
