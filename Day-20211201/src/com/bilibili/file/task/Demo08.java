package com.bilibili.file.task;

import java.io.*;
import java.util.Scanner;

public class Demo08 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
//        模拟歌曲复制和删除过程：假设在D：\\songs文件夹中存在一些歌曲(均为mp3格式)
//        循环显示该菜单：请选择您要进行的操作：1：查询所有歌曲   2：根据歌曲名称复制  3：根据歌曲名称删除 4: 退出
//        举例：
//        用户输入：1
//        存在以下歌曲：
//        蒙娜丽莎的眼泪
//                烟花易冷
//        上海滩
//                小苹果
//        夜空中最亮的星
//
//        用户输入：2
//        请输入要复制的歌曲名称: 上海滩
//        请输入存储路径: E:\\songs  (说明:该路径如果存在则不创建,不存在则创建)
//        复制结果: 歌曲上海滩已经成功复制到E:\\songs目录中
//
//        用户输入：3
//        请输入要删除的歌曲名称: 上海滩
//        删除结果: 歌曲上海滩已经成功删除
//
//        用户输入: 4
//        退出系统


        w : while (true) {
            System.out.println("---------------------------------------------xxVVVxx---------------------------------------------");
            System.out.println("请选择您要进行的操作：1：查询所有歌曲   2：根据歌曲名称复制  3：根据歌曲名称删除 4: 退出");
            String choose = sc.nextLine();
            switch (choose){
                case "1" -> show();
                case "2" ->{
                    show();
                    System.out.println("请输入要复制的歌曲名:");
                    musicCopy(sc.nextLine());
                }
                case "3" ->{
                    show();
                    System.out.println("请输入要删除的歌曲名:");
                    deleteMusic(sc.nextLine());
                }
                case "4" -> {
                    System.out.println("感谢使用!");
                    break w;
                }
                default -> System.out.println("你的选项有误!");
            }
        }
    }

    //删除歌曲
    private static void deleteMusic(String name) {
        File sourceDirs = new File("C:\\Users\\zhish\\Desktop\\temp\\music");

        boolean flag = false;
        String musicFile = null;

        //遍历文件判断是否存在指定音乐文件
        for (File file : sourceDirs.listFiles()) {
            musicFile = file.getName();
            String[] names = musicFile.split("\\.");
            if (names[0].equals(name)){
                flag = true;
                break;
            }
        }

            //根据结果选择进行复制或是提示不存在
        if(flag){
            new File(sourceDirs, musicFile).delete();
            System.out.println("歌曲"+musicFile+"已经成功删除");
        }else {
            System.out.println("您想删除的歌曲不存在!");
        }
    }

    //复制歌曲
    private static void musicCopy(String name) throws IOException {
        File sourceDirs = new File("C:\\Users\\zhish\\Desktop\\temp\\music");
        boolean flag = false;
        String musicFile = null;

        //遍历文件判断是否存在指定音乐文件
        for (File file : sourceDirs.listFiles()) {
            musicFile = file.getName();
            String[] names = musicFile.split("\\.");
            if (names[0].equals(name)){
                flag = true;
                break;
            }
        }

        //根据结果选择进行复制或是提示不存在
        if(flag){
            System.out.println("请输入存储路径:");
            File targetFile = new File(sc.nextLine());

            //判断输出的目录是否存在, 否则创建
            if(!targetFile.exists())
                targetFile.mkdirs();

            BufferedInputStream bis = new BufferedInputStream(new FileInputStream(new File(sourceDirs, musicFile)));
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(new File(targetFile, musicFile)));

            byte[] bytes = new byte[1024];
            int len;
            while((len = bis.read(bytes)) != -1){
                bos.write(bytes, 0, len);
            }
            bos.close();
            bis.close();

            System.out.println("歌曲"+musicFile+"已经成功复制到"+targetFile.getAbsolutePath()+"目录中");
        }else {
            System.out.println("您输入的歌曲不存在!");
        }
    }

    //展示歌曲目录
    private static void show() {
        File dirs = new File("C:\\Users\\zhish\\Desktop\\temp\\music");
        for (File file : dirs.listFiles()) {
            System.out.println(file.getName());
        }
    }
}
