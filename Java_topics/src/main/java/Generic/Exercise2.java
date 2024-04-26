package Generic;

import java.util.List;

public class Exercise2 {

//    2. Write a Java program to create a generic
//    method that takes a list of numbers and returns the sum of all the even and odd numbers.
    public static void main(String []arg) {
        //array can bhi integer type or string and datatype
        List<Number> value = List.of(1, 4, 5, 7, 6, 8, 2);
        List<Double> value1 = List.of(2.0, 0.6, 7.9, 3.0);

        totalSum(value);
        totalSum(value1);

    }

    private static <T extends Number> void totalSum(List<T> value) {
        // do not initialize a generic variable.
        double oddNumber =0;
        double evenSum = 0;

        for (T v:value) {
            if(v.doubleValue()%2 ==0) {
                oddNumber += v.doubleValue();
            } else {
                evenSum += v.doubleValue();
            }
        }

        System.out.println("Even Sum" + evenSum);
        System.out.println("Odd Sum" + oddNumber);


    }

}
