package day8;

public class Operator {

    public static void main(String[] args) {
        int x = 2;

        x = x + 2;
        x += 2;

        x *= 2;

        x = x + 1;

        //Increment
        ++x; // pre increment
        x++; // post increment

        //Decrement
        --x; // pre decrement
        x--; // post decrement


        int m = 7;
        int n = 7;
        int a = 2 * ++m; // now a is 16, m is 8
        int b = 2 * n++; // now b is 14, n is 8

//        System.out.println(a);
//        System.out.println(b);
//
//        System.out.println(m);
//        System.out.println(n);


        // Relational operator

        int c = 3;
        int d = 3;

        boolean same = c == d;
//        System.out.println(equal);

        int percentage = 80;

        boolean isDistinction = percentage >= 90;

        System.out.println(isDistinction);

        //Ternary Operator
        String division = (percentage >= 90) ? "Distinction" : "Don't know";

        System.out.println(division);


    }

    public void  test(){
        int x = 3;
    }
}
