package Functional_StreamAPI;

public class A {

    // Method 1: accepts String parameter
    // This is more specific because String is a subclass of Object
    public void m1(String s){
        System.out.println("string called");
    }

    // Method 2: accepts Object parameter
    // This is more general because every class in Java extends Object
    public void m1(Object s){
        System.out.println("object called");
    }

    // reference is ambiguous
//    public void m1(int[] arr){
//        System.out.println("array");
//    }

    public static void main(String[] args) {
        A a = new A();
        a.m1(null);
    }
}