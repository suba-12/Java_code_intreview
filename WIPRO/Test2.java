package WIPRO;
//
public class Test2 {
  public static void main(String[] args) {
    char[] a= {'A','B','C'};
    char[] b= {'B','C','D'};
  
    System.out.println(singleDigitSum(a,b)); 
    
}

    public static int singleDigitSum(char[] input1, char[] input2) {
        int sum = 0;

        // Check for characters in input1 but not in input2
        for (int i = 0; i < input1.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < input2.length; j++) {
                if (input1[i] == input2[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                sum += (int) input1[i];
            }
        }

        // Check for characters in input2 but not in input1
        for (int i = 0; i < input2.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < input1.length; j++) {
                if (input2[i] == input1[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                sum += (int) input2[i];
            }
        }

        // Reduce to a single digit
        return getSingleDigit(sum);
    }
    
    private static int getSingleDigit(int num) {
        while (num >= 10) {
            num = sumDigits(num);
        }
        return num;
    }
    
    private static int sumDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}