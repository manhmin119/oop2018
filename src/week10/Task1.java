/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week10;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrator
 */
public class Task1 {
  public static  List<String>getAllFuncitions(File path) {
        List<String> ls=new ArrayList<String>();
        
        try{
           BufferedReader br= new BufferedReader(new FileReader(path));
            System.out.println("đọc nội dung file sử dụng phương thức readline()");
            String line;
            while((line=br.readLine())!=null){
                line=line.trim();
                if(line.contains("static")==true){
                    ls.add(line);
                }
                //xong 1 phần chưa,t hỏi sao độc coin tain static là đc r aschi can tim dong nao co static la dc
            }
            br.close();
        }catch(IOException e){
            e.printStackTrace();
        }
      return ls;
    }
  public static String findAllFuncitionsByName(String name){
      int dem=0;
      try{
          BufferedReader br= new BufferedReader(new FileReader("F:\\Program Files\\week9\\src\\week9\\Utils.java"));
          String line;
          while((line=br.readLine())!=null){
              line=line.trim();
              if(line.contains(name)==true){
                  dem++;
              }
          }
                  
      } catch (IOException e) {
          e.printStackTrace();
      }
      if(dem==0) return null;
      else return name;
  }
    public static void main(String[] args) {
        List<String> ls=new ArrayList<String>();
       ls=getAllFuncitions(new File("F:\\Program Files\\week9\\src\\week9\\Utils.java"));
       for(String s:ls){
           System.out.println(s);
       }
         String t= findAllFuncitionsByName("xxx");
         if(t==null) System.out.println("khong tim thay "+ t+" trong file");
         else System.out.println("da tim thay "+ t+" trong file");
    }
}
