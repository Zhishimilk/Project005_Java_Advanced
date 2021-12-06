package com.gitHub.AlgorithmPractice;

import java.util.ArrayList;

public class part29 {
    // 顺时针打印矩阵
    public static void main(String[] args) {

        //定义一个二位数组
        int[][] matrix = {
                /*{  1,   2},
                {  5,   6},*/
                /*{  1},
                {  5},
                {  9},*/
                {  1,   2,   3,   4},
                {  5,   6,   7,   8},
                {  9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        //调用 printMatrix() 将二维数组内容按打印顺序添加到集合并返回
        ArrayList<Integer> list = printMatrix_(matrix);

        //打印 list 集合查看结果
        System.out.println(list);
    }

    private static ArrayList<Integer> printMatrix_(int[][] matrix) {
        //list 集合用来存储结果并作为返回值
        ArrayList<Integer> list = new ArrayList<>();

        //四个变量分别表示二维数组的： row1第一行, row2最后一行, col1第一列, col2最后一列
        int row1 = 0, row2 = matrix.length-1, col1 = 0, col2 = matrix[0].length-1;

        //按打印需求排序
        while(row2>=row1 && col2>=col1 ){
            //打印上方的数字
            for (int i = col1; i <= col2; i++)
                list.add(matrix[row1][i]);

            //打印右边的数字
            for (int i = row1+1; i <= row2; i++)
                list.add(matrix[i][col2]);

            //打印下方的数字
            if(row1 != row2)
                for (int i = col2-1; i >= col1; i--)
                    list.add(matrix[row2][i]);

            //打印左边数字
            if(col1 != col2)
                for (int i = row2-1; i >= row1+1; i--)
                    list.add(matrix[i][col1]);

            //进入下一环
            row1++; row2--; col1++; col2--;
        }

        return list;
    }

    //标准答案
    public static ArrayList<Integer> printMatrix(int[][] matrix) {
        ArrayList<Integer> ret = new ArrayList<>();
        int r1 = 0, r2 = matrix.length - 1, c1 = 0, c2 = matrix[0].length - 1;
        while (r1 <= r2 && c1 <= c2) {
            // 上
            for (int i = c1; i <= c2; i++)
                ret.add(matrix[r1][i]);
            // 右
            for (int i = r1 + 1; i <= r2; i++)
                ret.add(matrix[i][c2]);
            if (r1 != r2)
                // 下
                for (int i = c2 - 1; i >= c1; i--)
                    ret.add(matrix[r2][i]);
            if (c1 != c2)
                // 左
                for (int i = r2 - 1; i > r1; i--)
                    ret.add(matrix[i][c1]);
            r1++; r2--; c1++; c2--;
        }
        return ret;
    }
}
