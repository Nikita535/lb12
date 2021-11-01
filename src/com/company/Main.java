package com.company;

public class Main {

    public static void main(String[] args) {
        String s1 = "Faa1_Password";
        String s2 = "TrySpy1a_";
        String s3 = "smart_pass";
        String s4 = "A007";
        String pat = "((?=^.{8,}$)((?=.*\\d)|(?=.*[_]))(?=.*[A-Z])(?=.*[a-z])).*$";
        //(?=^.{8,}$) от начала и до конца строки минимум 8 символов
        //(?=.*\\d) содержит хотя бы 1 цифру
        //(?=.*[_]) может содержать знак подчеркивания

        for (int i=1;i<=4;i++) {
            switch (i) {
                case (1):
                    if (s1.matches(pat)) {
                        System.out.println(s1+"-Пароль действителен");
                    } else {
                        System.out.println("Пароль недействителен");
                    }
                    break;
                case (2):
                    if (s2.matches(pat)) {
                        System.out.println(s2+"-Пароль действителен");
                    } else {
                        System.out.println("Пароль недействителен");
                    }
                    break;
                case (3):
                    if (s3.matches(pat)) {
                        System.out.println("Пароль действителен");
                    } else {
                        System.out.println(s3+"-Пароль недействителен");
                    }
                    break;
                case (4):
                    if (s4.matches(pat)) {
                        System.out.println("Пароль действителен");
                    } else {
                        System.out.println(s4+"-Пароль недействителен");
                    }
                    break;
            }
        }
    }
}
