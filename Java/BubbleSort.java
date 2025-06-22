
 //Write a function to sort the numbers: 
//45, 12, 78, 34, 89, 23, 56, 67, 90, 11, 3, 29, 72, 81, 40, 66, 25, 38, 94, 7, 50, 62, 18, 84, 31, 49, 21, 70, 99, 6
//12 , 45 . 12,11
 //time O(n^2)
public class BubbleSort{ 
public static void sort(int[] arr){

    int n= arr.length;
    for(int i= 0;i<n-1;i++){
        boolean swapped=false;

        for(int j=0;j<n-i-1;j++)
        {
            if(arr[j]>arr[j+1]){

            int temp=arr[j];
            arr[j]=arr[j+1];
            arr[j+1]=temp;

            swapped= true;
            }
        }
    
    if(!swapped){
        break;
    }
}
}


public static void main (String [] args ){
    
    int [] arr= {45, 12, 78, 34, 89, 23, 56, 67, 90, 11, 3, 29, 72, 81, 40, 66, 25, 38, 94, 7, 50, 62, 18, 84, 31, 49, 21, 70, 99, 6};

    sort(arr);
    for(int num:arr){
        System.out.println(num+" ");
    }

}
}


