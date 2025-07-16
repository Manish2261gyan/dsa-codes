package manish;

import java.util.Scanner;

public class bublesort{
   public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the size of array");
    int size = sc.nextInt();
    int arr[]= new int[size];
    System.out.println(" enter the elemetn one by one");
    for(int i=0; i<size; i++){
        arr[i]= sc.nextInt();
    }
    System.out.println("the elemtn in arr is ");
    for(int i=0; i<size; i++){
    System.out.print(arr[i]);
}

    for(int i=0; i<size; i++){
        for(int j=0; j<size-1; j++){
          if(arr[j]<arr[j+1]){
            int temp = arr[j];
            arr[j]=arr[j+1];
            arr[j+1]= temp;
          }
        }
    }
    System.out.println();
     System.out.println(" the array after the sorting is ");
    for(int i=0; i<size; i++){
        System.out.print(arr[i]);
    }
   }
}