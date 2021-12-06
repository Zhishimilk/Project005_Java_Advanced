package com.bilibili.file.task;

import java.io.*;
import java.util.ArrayList;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Demo07 {
    public static void main(String[] args) throws IOException {
//        项目根路径下有个questions.txt文件内容如下：
//        5+5
//        150-25
//        155*155
//        2555/5
//        要求：读取内容计算出结果，将结果写入到results.txt文件中
//        5+5=10

        //读取每行算式并添加到集合中
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\zhish\\Desktop\\temp\\temp.txt"));
        ArrayList<String> nums = new ArrayList<>();
        String line;
        while ((line = br.readLine()) != null) {
            nums.add(line);
        }
        br.close();

//        ArrayList<String> algorithms = nums.stream().map(s -> {
//            if (s.contains("+"))
//                return "+";
//            else if (s.contains("-"))
//                return "-";
//            else if (s.contains("*"))
//                return "*";
//            else if (s.contains("/"))
//                return "/";
//            return null;
//        }).collect(Collectors.toCollection(ArrayList::new));

//        ArrayList<Integer> results = calculation(nums, algorithms);

        //calculation(), 计算结果并返回
        ArrayList<Integer> results = calculation(nums);

        //按照格式写入结果到文件
        BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\zhish\\Desktop\\temp\\temp.txt"));
        for (int i = 0; i < nums.size(); i++) {
            bw.write(nums.get(i) + "=" + results.get(i));
            bw.newLine();
        }
        bw.close();
    }

    //计算结果
    public static ArrayList<Integer> calculation(ArrayList<String> nums) {
        ArrayList<Integer> results = new ArrayList<>();

        for (String num : nums) {
            if (num.contains("+")) {
                int liftNum = Integer.parseInt(num.substring(0, num.indexOf("+")));
                int rightNum = Integer.parseInt(num.substring(num.indexOf("+") + 1));
                int result = liftNum + rightNum;
                results.add(result);
            } else if (num.contains("-")) {
                int liftNum = Integer.parseInt(num.substring(0, num.indexOf("-")));
                int rightNum = Integer.parseInt(num.substring(num.indexOf("-") + 1));
                int result = liftNum - rightNum;
                results.add(result);
            } else if (num.contains("*")) {
                int liftNum = Integer.parseInt(num.substring(0, num.indexOf("*")));
                int rightNum = Integer.parseInt(num.substring(num.indexOf("*") + 1));
                int result = liftNum * rightNum;
                results.add(result);
            } else if (num.contains("/")) {
                int liftNum = Integer.parseInt(num.substring(0, num.indexOf("/")));
                int rightNum = Integer.parseInt(num.substring(num.indexOf("/") + 1));
                int result = liftNum / rightNum;
                results.add(result);
            }
        }
        return results;
    }
    public static ArrayList<Integer> calculation(ArrayList<String> nums, ArrayList<String> algorithms) {
        ArrayList<Integer> results = new ArrayList<>();
        for (int i = 0; i < algorithms.size(); i++) {
            switch (algorithms.get(i)) {
                case "+" -> {
                    String num = nums.get(i);
                    int liftNum = Integer.parseInt(num.substring(0, num.indexOf("+")));
                    int rightNum = Integer.parseInt(num.substring(num.indexOf("+") + 1));
                    int result = liftNum + rightNum;
                    results.add(result);
                }
                case "-" -> {
                    String num = nums.get(i);
                    int liftNum = Integer.parseInt(num.substring(0, num.indexOf("-")));
                    int rightNum = Integer.parseInt(num.substring(num.indexOf("-") + 1));
                    int result = liftNum - rightNum;
                    results.add(result);
                }
                case "*" -> {
                    String num = nums.get(i);
                    int liftNum = Integer.parseInt(num.substring(0, num.indexOf("*")));
                    int rightNum = Integer.parseInt(num.substring(num.indexOf("*") + 1));
                    int result = liftNum * rightNum;
                    results.add(result);
                }
                case "/" -> {
                    String num = nums.get(i);
                    int liftNum = Integer.parseInt(num.substring(0, num.indexOf("/")));
                    int rightNum = Integer.parseInt(num.substring(num.indexOf("/") + 1));
                    int result = liftNum / rightNum;
                    results.add(result);
                }
                default -> System.out.println("error");
            }
        }

        return results;
    }
}
