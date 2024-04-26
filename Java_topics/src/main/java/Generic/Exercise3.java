package Generic;

import java.util.List;

public class Exercise3 {

//    Write a Java program to create a generic method that takes a list of any 
//    type and a target element. It returns the index of the first occurrence of the target element in the list.
//    Return -1 if the target element cannot be found.
    public static void main(String []arg) {
        //array can bhi integer type or string and datatype
        List<Number> value = List.of(1, 4, 5, 7, 6, 8, 2);
        List<String> value1 = List.of("abhi", "shek", "nitin");
        List<Integer> value3 = List.of(5, 6, 7, 8);
        
        System.out.println("Number" + checkTargetElement(value, 4));
        System.out.println("String " + checkTargetElement(value1, "shek"));
        System.out.println("Integer" + checkTargetElement(value3, 4));


    }

    private static <T> int checkTargetElement(List<T> value, T target) {

        for (int i = 0; i < value.size(); i++) {
            if(value.get(i).equals(target)) {
                return i;
            }
        }

        return -1;
    }
}
