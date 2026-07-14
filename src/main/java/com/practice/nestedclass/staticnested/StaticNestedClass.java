package com.practice.nestedclass.staticnested;

class OuterClass {
    int instanceVariable = 10;
    static int classVariable = 20;

    static class InnerClass {
        public void print(){
            System.out.println("In Inner class");
            // Here not able to access instanceVariable
            System.out.println(classVariable);
        }
    }
}

public class StaticNestedClass {
    public static void main(String[] args) {
        OuterClass.InnerClass obj = new OuterClass.InnerClass();
        obj.print();
    }
}
