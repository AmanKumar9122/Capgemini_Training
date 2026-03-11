package Functional_StreamAPI;

public class B {
    public static void main(String[] args) {
        AnonymousIC a = new AnonymousIC() {
            @Override
            public void m1() {
                System.out.println("Overriding m1 in class B");
            }
        };
        a.m1();
    }
}
//    @Override
//    public void m1(){
//        System.out.println("Override B");
//    }
