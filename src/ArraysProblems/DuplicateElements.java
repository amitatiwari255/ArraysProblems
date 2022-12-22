package ArraysProblems;

public class DuplicateElements {
    public static void main(String[] args) {
        int[] numArray = {15, 45, 67, 45, 15, 12};
        for (int i = 0; i <= numArray.length; i++) {
            for (int j = i + 1; j < numArray.length; j++) {
                if (numArray[i] == numArray[j])
                    System.out.println(numArray[j]);
            }
        }
    }
}