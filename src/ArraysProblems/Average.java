package ArraysProblems;

public class Average {
    public static void main(String[] args) {
        int sum = 0;
        int avg;
        int[] numArray = {10, 20, 30, 40, 50};
        for (int i = 0; i < numArray.length; i++) {
            sum = sum + numArray[i];
        }
        System.out.println("Sum Of Array is : " + sum);
        avg = sum/ numArray.length;
        System.out.println("Average of array is : " + avg);
    }
}
