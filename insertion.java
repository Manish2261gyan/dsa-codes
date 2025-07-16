import java.util.Scanner;

public class insertion {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the element one by one");
        for(int i=0; i<size; i++){
            arr[i]= sc.nextInt();
        }

        for(int i=1; i<arr.length;i++){
            int cur =  arr[i];
            int prev = i-1;       //(5,4,3,1,2) cur = 4;
                                                // prev =0;
            while(prev>=0 && arr[prev]>cur){       // (0>=0&&5>4) || (true && true){   arr[1] = 5 , 
                                                    //(5,5,3,1,2)      prev =-1;      //}
                    arr[prev+1]=arr[prev];           
                    prev--;
            }
            arr[prev+1]=cur;                 // arr[-1+1]=4  arr[0]=4 (4,5,3,1,2)
        }
        System.out.println();
        System.out.println("The output is ");
        for(int i=0;i<arr.length; i++){
            System.out.println(arr[i]);
        }

    }
}
