package com.bilibili.anonymous;

public class Parse_ {
    public static void main(String[] args) {

        parse(Integer::parseInt);
//        parse(new ParseInt_() {
//            @Override
//            public int method(String s) {
//                return Integer.parseInt(s);
//            }
//        });
    }

    public static void parse(ParseInt_ p){
        System.out.println(p.method("666"));
    }
}

interface ParseInt_{
    public int method(String s);
}
