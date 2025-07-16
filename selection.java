package manish;
import java.util.Scanner;
public class selection {
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the size of the array");
       int size = sc.nextInt();
       int arr[] = new int[size];
       System.out.println("Enter the element one by one");
       for(int i=0; i<size; i++){
        arr[i]=sc.nextInt();
       }

       for(int i=0; i<size-1; i++){
        int min=i;
        for(int j=i+1; j<size; j++){
            if(arr[min]>arr[j]){
                min=j;
            }
        }
        int temp = arr[min];
        arr[min]=arr[i];
        arr[i]=temp;
       }
       System.out.println("the output is");
       for(int i=0; i<size; i++){
        System.out.println(arr[i]);
       }

    }
}
