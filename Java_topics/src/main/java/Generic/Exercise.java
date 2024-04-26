package Generic;

public class Exercise {

//    1. Write a Java program to create a generic method that takes two arrays of the same type
//    and checks if they have the same elements in the same order.

    public static void main(String []arg) {
        //array can bhi integer type or string and datatype
        Integer[] array1 = {1, 3, 4, 2};
        Integer[] array2 = {2, 3, 5, 6};

        System.out.println(checkOrder(array1, array2) ? "YES" : "NO");
    }

    private static <T> boolean checkOrder(T[] array1, T[] array2) {
        if(array1.length != array2.length) {
            return false;
        }

        for(int i = 0; i < array1.length ;i++) {
            if(array1[i] != array2[i])
                return false;
        }

        return true;
    }


}
