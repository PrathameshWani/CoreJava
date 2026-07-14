package com.practice.nestedclass.nonstaticnestedclass;

class OuterClass {
    int instanceVariable = 10;
    static int staticVariable = 20;

    public class MemberNonStaticNestedClass {
        public static void main(String[] args) {
            OuterClass outerObj = new OuterClass();
            OuterClass.InnerClass innerObj = outerObj.new InnerClass();
            innerObj.print();
        }




    }

    class InnerClass {
        public void print(){
            System.out.println("Inner class print");
            System.out.println(instanceVariable + staticVariable);
        }
    }
}

