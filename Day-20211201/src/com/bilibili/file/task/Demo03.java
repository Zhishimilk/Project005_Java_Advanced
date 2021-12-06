package com.bilibili.file.task;

import java.io.*;

public class Demo03 {
    public static void main(String[] args) throws IOException {

        File source = new File("C:\\Users\\zhish\\Desktop\\temp");
        File target = new File("C:\\Users\\zhish\\Desktop\\temp1");

        copyDir(source, target);
    }

    private static void copyDir(File source, File target) throws IOException {
        File dir = new File(target, source.getName());
        dir.mkdirs();

        File[] files = source.listFiles();
        for (File file : files) {
            if(file.isFile()){
                save(file, new File(dir, file.getName()));
            }else {
                copyDir(file, dir);
            }
        }
    }

    private static void save(File file, File dir) throws IOException {
        if (file.getName().endsWith(".java")){
            BufferedInputStream fis = new BufferedInputStream(new FileInputStream(file));
            BufferedOutputStream fos = new BufferedOutputStream(new FileOutputStream(dir));

            int b;
            while ((b = fis.read()) != -1) {
                fos.write(b);
            }

            fos.close();
            fis.close();
        }
    }
}
