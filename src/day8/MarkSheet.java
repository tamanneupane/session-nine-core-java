package day8;

public class MarkSheet {

    public static void main(String[] args) {

        String name = "Taman Neupane";
        int studentClass = 8;

        float maths = 85;
        float science = 85;
        float english = 80;
        float computer = 85;
        float social = 89;

        float percentage = ((maths + science + english + computer + social)/500)*100;

        System.out.println(percentage);

        boolean isDistinction = percentage >= 80;
        boolean isFirstDivision = percentage >= 70 && percentage < 80;
        //boolean secondDivision =
        //boolean thirdDivision =
        //boolean failed =

        System.out.println("Distinction : " + isDistinction);
        System.out.println("First Division : " + isFirstDivision);
//        System.out.println("Second Division : " + secondDivision);
//        System.out.println("Third Division : " + thirdDivision);
//        System.out.println("Failed : " + failed);
    }
}
