import java.util.Arrays;
import java.util.Scanner;


public class Search_Array {
    public void Search_Method()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Array : ");
        int size = sc.nextInt();
        int arr1[] = new int[size];
        // int arr2[] = new int[size];
        System.out.println("Enter Array Elements : ");
        for(int i=0;i<arr1.length;i++)
        {
             System.out.print(i+1 + " Element is : ");
             arr1[i]= sc.nextInt();
        }
        System.out.println("Array is : "+ Arrays.toString(arr1));
        //search Element
        System.out.print("Enter element you want to search : ");
        int search = sc.nextInt();
        int counter=0;
        for(int i=0;i<arr1.length;i++)
        {
            if(arr1[i]==search)
            {
                counter++;
                break;
                
            }
            
        }
        if(counter>0)
        {
            System.out.print("File Exist");
        }
        else
        {
            System.out.println("File does not exist ");
        }
    }

    public static void main(String[] args) {
        Search_Array SA = new Search_Array();
          SA.Search_Method();
    }
}
