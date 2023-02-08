import java.util.Arrays;
import java.util.Scanner;

public class Update_Array {
   
    public void Update_Method()
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
        //Update the Array
        System.out.print("Enter pre_Element : ");
        int pre_Element = sc.nextInt();
        System.out.print("Enter new_Element : ");
        int new_Element = sc.nextInt();
        for(int i=0;i<arr1.length;i++)
        {
            if(arr1[i]==pre_Element)
            {
                arr1[i]=new_Element;
            }
           
        }
        System.out.println("New Array is :" + Arrays.toString(arr1));
    }
    public static void main(String[] args) {
        Update_Array UA = new Update_Array();
        UA.Update_Method();        
    }
}
