public class Bubble_Sort {
    public static void PrintArray()
    {
        int arr[]={5,2,4,9,7,1};
        for(int i=0;i<arr.length-1;i++)                 //5,2,4,9,7,1       //2,4,5,7,1,9
        {                                               //2,5,4,9,7,1       //2,4,5,1,7,9
            for(int j=0;j<arr.length-i-1;j++)           //2,4,5,9,7,1       //2,4,1,5,7,9
            {                                           //2,4,5,7,9,1       //2,1,4,5,7,9
                                                        //2,4,5,7,1,9       //1,2,4,5,7,9 
                //Swapping                              
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    for(int i=0;i<arr.length;i++)
    {
        System.out.print(arr[i]+" ");
    }
    
    
    
    }
    public static void main(String[] args) {
        PrintArray();
    }
}
