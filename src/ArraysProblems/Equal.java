package ArraysProblems;

public class Equal {
    public static void main(String[] args) {
        int[] arr1 = {23, 45, 67, 89, 56, 43};
        int[] arr2 = {56, 49, 87, 32, 78, 34};
        if (arr1 == arr2)
            System.out.println("Arrays are equal");
        else
            System.out.println("Arrays are not equal");
    }
}