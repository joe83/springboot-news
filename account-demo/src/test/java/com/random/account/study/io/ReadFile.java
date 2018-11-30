package com.random.account.study.io;

import java.io.*;

public class ReadFile {

    public static void main(String[] args) {
        //InputStream inputStream;
        try {
            //inputStream = new FileInputStream("C:\\Users\\YZCLIKE\\Desktop\\FILE\\nihao.txt");
            File file = new File("C:\\Users\\YZCLIKE\\Desktop\\FILE\\nihao.txt");
            InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file));
            BufferedReader reader = new BufferedReader(inputStreamReader);
            StringBuffer buffer = new StringBuffer();
            while (reader.readLine() != null) {
                buffer.append(reader.readLine() + "/br");
            }
            System.out.println(buffer.toString());
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
