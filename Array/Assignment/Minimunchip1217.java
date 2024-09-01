package Array.Assignment;

//Input: position = [1,2,3]
//Output: 1
public class Minimunchip1217 {
    public static void main(String[] args) {
        int[] position = {2,2,2,2,2,2,2,3,3};
        System.out.println(minCostToMoveChips(position));

    }
    static int minCostToMoveChips(int[] position) {
        int even = 0;
        int odd = 0;
        for(int val :position){
            if(val % 2 == 0){
                even++ ;

            }else{
                odd++;
            }
        }
        return Math.min(even,odd);
    }
}
