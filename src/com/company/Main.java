package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(ageAndTemp(29,23));
        System.out.println(ageAndTemp(30,10));
        System.out.println(ageAndTemp(15,18));
        System.out.println(ageAndTemp(25,20));
        System.out.println(ageAndTemp(19,19));

    }


    public static String  ageAndTemp (int age, int temp) {
        if ((age > 20 && age < 45) && (temp > - 20 && temp < 30)) {
            System.out.println("Можно идти гулять");
        }else if ((age < 20) && (temp >= 0 && temp > 28)) {
            System.out.println("Можно идти гулять");
        }else if ((age > 45) && (temp >= -10 && temp < 25)) {
            System.out.println("Можно ити гулять");
        }else {
            System.out.println("Оставайтусь дома");
        }
        return "Age=" + age + "Temp=" + temp;
    }



}
