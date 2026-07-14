package com.practice.interface_;

public class AnnonimousClass {

    public static void main(String[] args) {

//        Bird eagleObj = new Bird() {
//            @Override
//            public void canFlay(String val) {
//                System.out.println(val);
//            }
//        };

        Bird<String, Integer> obj =  (Integer data) ->{
            return data.toString();

        };

        System.out.println(obj.canFlay(13));

    }
}
