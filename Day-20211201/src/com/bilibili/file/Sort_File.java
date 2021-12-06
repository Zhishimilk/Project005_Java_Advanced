package com.bilibili.file;

import java.io.*;
import java.util.Arrays;

public class Sort_File {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\zhish\\Desktop\\temp\\temp.txt"));
        String[] arr = br.readLine().split(" ");
        br.close();

        Integer[] integers = Arrays.stream(arr).map(Integer::parseInt).toArray(Integer[]::new);
        Arrays.sort(integers);

        BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\zhish\\Desktop\\temp\\temp.txt"));
        for (Integer integer : integers) {
            bw.write(integer + " ");
        }
        bw.close();
    }
}
