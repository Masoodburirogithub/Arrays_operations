import java.util.Arrays;
import java.util.Scanner;

public class Delete_Array {
    public void Delete_Method()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Array : ");
        int size = sc.nextInt();
        int arr1[] = new int[size];
         int arr2[] = new int[size-1];
        System.out.println("Enter Array Elements : ");
        for(int i=0;i<arr1.length;i++)
        {
             System.out.print(i+1 + " Element is : ");
             arr1[i]= sc.nextInt();
        }
        System.out.println("Array is : "+ Arrays.toString(arr1));
        //Delete Array
        System.out.print("Enter element you want to Delete : " );
        int delete = sc.nextInt();
        for(int i=0;i<arr2.length;i++)
        {
            if(arr1[i]==delete)
            {
                arr1[i]=arr2[i];
            }
           
            
        }
        System.out.println(Arrays.toString(arr2));
    }
    public static void main(String[] args) {
        Delete_Array DA = new Delete_Array();
        DA.Delete_Method();
    }
}
