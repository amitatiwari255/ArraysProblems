package ArraysProblems;
import java.util.Scanner;
public class DeleteTheElement {
    public static void main (String[] args){
        int size,place,i;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Array Size : ");
        size = scan.nextInt();

        int[] numArr = new int[size];
        System.out.println("Enter Array Elements : ");
        for (i = 0 ; i < size  ; i++ ) {
            numArr[i] = scan.nextInt();
        }
        for (i = 0 ; i < size ; i++ ) {
            System.out.print(numArr[i]+ " ");
        }
        System.out.println("Enter Array Location : ");
        place = scan.nextInt();
        for (i = place ; i < size - 1 ; i++ ) {
            numArr[i] = numArr[ i + 1 ];
        }
        System.out.println();
        size--;
        for (i = 0 ; i < size ; i++ ) {
            System.out.print(numArr[i]+ " ");
        }
    }
}
