package TCS_coding_25.Array;

import java.util.Scanner;

//5
//1 2 3 4 5
//6

public class Addingelements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        sc.nextLine();
        String[] input = sc.nextLine().split(" ");
        for (int index = 0; index < size; index++) {
            arr[index] = Integer.parseInt(input[index]);
            
        }
        int add = sc.nextInt();
        int[] newar = element(arr, add);

       
        for (int num : newar) {
            System.out.print(num + " ");
        }


        sc.close();

}

static int[] element(int[] arr , int add){
    int n = arr.length;
    int[] array = new int[n + 1];

    for (int index = 0; index < n; index++) {
        array[index] = arr[index];
    }
    array[n] = add;
    return array;
}
}
