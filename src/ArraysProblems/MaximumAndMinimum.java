package ArraysProblems;

public class MaximumAndMinimum {
    public static void main(String[] args) {
        int max = 0;
        int[] numArray = {15, 45, 67, 89, 35, 12};
        int min = numArray[0];
        for (int i = 0; i < numArray.length; i++) {
            if (numArray[i] > max) {
                max = numArray[i];
            }
            if (numArray[i] < min) {
                min = numArray[i];
            }
        }
            System.out.println("Maximum Number is  :" + max);
            System.out.println("Minimum Number is :" + min);
        }
    }
