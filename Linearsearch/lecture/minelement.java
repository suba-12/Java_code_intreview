package Linearsearch.lecture;

public class minelement {
    public static void main(String[] args) {
        int[] arr = {23,34,2,3,34,12,55};
        int result = minielement(arr);
        System.out.println(result);
    }
        static int minielement(int[] arr){
            int ans = arr[0];

            for (int index = 0; index < arr.length; index++) {
                if(arr[index]<ans){
                    ans = arr[index];
                }

            }
        return ans;
            
        }
    }

