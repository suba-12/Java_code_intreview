package Accenture;

public class Occurs {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,4,5};
        int[] result = occurs(arr);
        for (int index = 0; index < arr.length; index++) {
            if(result[index] > 0){
                System.out.println(index +" " + result[index]);
            }
        }

        
    }
    static int[]  occurs(int[] arr ){
        int[] max = new int[arr.length+1];
        for (int index = 0; index < arr.length; index++) {
            max[arr[index]]++;
        }
        return max;
    }
}
