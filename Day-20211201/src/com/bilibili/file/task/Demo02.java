package com.bilibili.file.task;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Demo02 {
    public static void main(String[] args) throws IOException {
//        统计当前项目下info2.txt文件中, 每个字符出现的个数
//        文件内容如下:
//        welcome to itheima!!!
//                最终效果如下:
//        w(1) (2)!(3)t(2)e(3)c(1)a(1)o(2)l(1)m(2)h(1)i(2)
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("C:\\Users\\zhish\\Desktop\\temp\\temp.txt"));
        HashMap<Integer, Integer> chm = new HashMap<>();

        int d;
        while((d = bis.read()) != -1){
            if(chm.containsKey(d)){
                chm.put(d, chm.get(d)+1);
            }else {
                chm.put(d, 1);
            }
        }

        bis.close();

        for (Map.Entry<Integer, Integer> entry : chm.entrySet()) {
            int key = entry.getKey();
            System.out.print((char)key + "("+entry.getValue()+")");
        }
    }
}
