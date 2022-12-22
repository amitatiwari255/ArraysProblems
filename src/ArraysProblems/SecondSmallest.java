package ArraysProblems;
public class SecondSmallest {
    public static void main(String[] args) {
        int[] numArray = {15, 45, 67, 89, 35, 12};
        for (int i = 0; i < numArray.length; i++)     // to hold the element
        {
            for (int j = i + 1; j < numArray.length; j++)    // to compare with the rest of the elements
            {
                if (numArray[i] < numArray[j])     //Check and swap
                {
                    int temp = numArray[i];
                    numArray[i] = numArray[j];
                    numArray[j] = temp;
                }
            }
        }
        System.out.println("Second Smallest element is " + numArray[numArray.length - 2]);
    }
}