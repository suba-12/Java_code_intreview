package TCS_coding_25.Revision;
import java.util.Scanner;
//greater than all of its prior elements.
import java.util.Scanner;
public class Set0303 {
    
        public static void main(String[] args)
        {
           Scanner sc=new Scanner(System.in);
           int n=sc.nextInt();
           int arr[]=new int[n];
           for(int i=0;i<n;i++)
               arr[i]=sc.nextInt();
               int max=Integer.MIN_VALUE;
               int count=0;
               for(int i=0;i< n;i++) 
                 { if(arr[i] >max)
                   {
                       max=arr[i];
                       count++;
                   }
               }
               System.out.println(count);
        }
       
}
