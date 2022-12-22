package ArraysProblems;

public class SpecificValue {
    public static void main(String[] args) {

        int[] numArray = {12, 15, 36, 69, 44, 57};
        int num = numArray[4];
        System.out.println("Please Enter a Number :"+num);
        for (int i = 0; i < numArray.length; i++) {
            if (num == numArray[i]) {
                System.out.println("Array contains the given element");
            }
        }
    }
}




