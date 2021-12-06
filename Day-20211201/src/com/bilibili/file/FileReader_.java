package com.bilibili.file;

import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class FileReader_ {
    public static void main(String[] args) throws IOException {

        FileReader fr = new FileReader("C:\\Users\\zhish\\Desktop\\temp\\temp.txt");
        /*int c;
        while((c = fr.read()) != -1){
            System.out.print((char)c);
            System.out.println("["+c+"]");
        }*/

        int len;
        char[] chars = new char[128];
        while((len = fr.read(chars)) != -1){
            System.out.println(new String(chars, 0, len));
        }

        "你好".getBytes(StandardCharsets.UTF_8);
        fr.close();
    }
}
