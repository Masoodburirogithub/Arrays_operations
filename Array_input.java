import java.util.Arrays;
import java.util.Scanner;

public class Array_input {
    public void Make_Method()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of Array :");
        int input=sc.nextInt();
        int[] arr1= new int[input];
        System.out.println("Enter Element in Array : ");
        for(int i=0;i<arr1.length;i++)
        {
            System.out.print(i+1 +" "+ " Element is : ");
            arr1[i]=sc.nextInt();
        } 
          System.out.println(Arrays.toString(arr1));
    }

    public static void main(String[] args) {
        Array_input Ai = new Array_input();
        Ai.Make_Method();
    }
}
