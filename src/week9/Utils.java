/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week9;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
/**
 *
 * @author Administrator
 */
public class Utils {
    public static String readContentFromFile(String path) throws FileNotFoundException, IOException{
        BufferedReader br= null;
        try{
            br= new BufferedReader(new FileReader(path));
            System.out.println("đọc nội dung file sử dụng phương thức readline()");
            String line;
            while((line=br.readLine())!=null){
                System.out.println(line);
            }
        }catch(IOException e){
            e.printStackTrace();
        }
        br.close();
        return null;
}
    public static  void writeContentToFile(String path) {
        try{
        FileWriter fw=new FileWriter(new File(path), true);
            Scanner sc= new Scanner(System.in);
            String data= sc.nextLine();
        fw.write(data);
        fw.close();
        }catch(IOException e){
    e.printStackTrace();
}
}
    public static File findFileByName(String folderPath,String fileName){
        String a= folderPath+"\\"+ fileName;
        File f=new File(a);
        if(f.exists()){
            return f;
        }
        return null;
    }

    public static void main(String[] args) {
        //writeContentToFile("C:\\New folder\\manh.txt");
        System.out.println(findFileByName("C:\\New folder","thuy.txt"));
    }
}

