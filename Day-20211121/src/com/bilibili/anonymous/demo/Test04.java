package com.bilibili.anonymous.demo;

public class Test04 {
//	在下面的代码中，请使用Lambda的省略格式调用 invokeDirect 方法，打印输出“导演拍电影啦！”字样：
    public static void main(String[] args) {
        // TODO 请分别使用Lambda【省略格式】调用invokeDirect方法
        invokeDirect(() -> System.out.println("导演拍电影了!"));
    }

    private static void invokeDirect(Director director) {
        director.makeMovie();
    }
}
//    给定一个导演 Director接口，内含唯一的抽象方法makeMovie，且无参数、无返回值，使用lambda表达式在Test类中完成调用。
@FunctionalInterface
interface Director {
    void makeMovie();
}

