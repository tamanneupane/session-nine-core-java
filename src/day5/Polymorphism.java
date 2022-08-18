package day5;

public class Polymorphism {

    public static void main(String[] args) {
        add(5, 3);
        add(5.0f, 3.0f);
        add( 5.0, 3.0);
//        add(5.0, 3.0);
    }

    public static void add(double a, double b){
        double add1 = a + b;
        System.out.println(add1);
    }

    // Overloading - Creating function with same name but different parameters

//    public static void add(int a, int b){
//        int add1 = a + b;
//        System.out.println(add1);
//    }

//    public static void add(int a, float b){
//        float add1 = a + b;
//        System.out.println(add1);
//    }
//
//    public static void add(int a, int b, int c){
//        int add1 = a + b + c;
//        System.out.println(add1);
//    }
//
//    public static void add(float a, float b){
//        float add1 = a + b;
//        System.out.println(add1);
//    }

}
