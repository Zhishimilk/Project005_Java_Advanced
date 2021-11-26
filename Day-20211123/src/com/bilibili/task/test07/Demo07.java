package com.bilibili.task.test07;

public class Demo07 {
    public static void main(String[] args) {
        int mouth = 23;
        int sum = _fibonacci(mouth);
        System.out.println(sum);
    }

    private static int _fibonacci(int mouth) {
        if(mouth == 2 || mouth == 1){
            return 1;
        }
        return _fibonacci(mouth - 1) + _fibonacci(mouth - 2);
    }
}

// 1 1 2 3 5 8 13
