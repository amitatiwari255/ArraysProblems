package ArraysProblems;

public class SecondHighest {
    public static void main(String[] args) {
        int max= 0;
        int[] numArray = {15, 45, 67, 89, 35, 12};
        for (int i = 0; i <= numArray.length; i++){
            for (int j = i+1 ; j < numArray.length; j++){
                if (numArray[i] > numArray[j]){
                    max= numArray[i];
                    numArray[i] = numArray[j];
                    numArray[j]= max ;
                }
            }
        }
        System.out.println("Second Highest Element is " +numArray[numArray.length-2]);
    }
}