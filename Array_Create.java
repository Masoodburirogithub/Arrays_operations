 import java.util.Arrays;
import java.util.Scanner;

//inrest the Element [1,3,4,5];
//now insert         [1,2,3,4,5];
public class Array_Create {
    public void Make_Method()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of Array :");
        int input=sc.nextInt();
        int[] arr1= new int[input];
        int[] arr2= new int[input+1];
        
        System.out.println("Enter Element in Array : ");
        for(int i=0;i<arr1.length;i++)
        {
            System.out.print(i+1 +" "+ " Element is : ");
            arr1[i]=sc.nextInt();
        } 
        System.out.println(Arrays.toString(arr1));
          System.out.print("Enter index for new Value : ");
          int index=sc.nextInt();
          System.out.print("Enter no: you want to insert : ");
          int insert = sc.nextInt();
          for(int i=0;i<arr2.length;i++)
          {
             if(i<index)
             {
                arr2[i]=arr1[i];

             }
             else if(i==index)
             {
                arr2[i]=insert;
             }
             else
             {
                arr2[i]=arr1[i-1];
             }
          }
          System.out.println(Arrays.toString(arr2));
    }

    public static void main(String[] args) {
        Array_Create Ai = new Array_Create();
        Ai.Make_Method();
    }
}

    

