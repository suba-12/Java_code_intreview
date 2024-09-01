package Accenture;
/*
 The Binary number system only uses two digits, 0 and 1 and number system can be called binary string. You are required to implement the following function:

int OperationsBinaryString(char* str);

The function accepts a string str as its argument. The string str consists of binary digits eparated with an alphabet as follows:

– A denotes AND operation
– B denotes OR operation
– C denotes XOR Operation
You are required to calculate the result of the string str, scanning the string to right taking one opearation at a time, and return the same.

Note:

No order of priorities of operations is required
Length of str is odd
If str is NULL or None (in case of Python), return -1
Input:
str: 1C0C1C1A0B1

Output:
1
 */
public class BitwiseOperator {
    public static void main(String[] args) {
        String s = "1C0C1C1A0B1";
        
    }
    /*static int bitwise(String s){
        char res = s.charAt(0);
        for (int index = 1; index < s.length(); index++) {
            char ch = s.charAt(index);
          /*  if(res =='A'){
            res = res & (s.charAt(index));
            }
            if(res =='B'){
                res = res | (s.charAt(index));
                }
            if(res =='C'){
                    res = res ^ (s.charAt(index));
                    }
        
    

        }
        return 1;
    }
}*/ 
}
