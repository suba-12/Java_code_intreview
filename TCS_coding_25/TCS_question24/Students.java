/*
 *Example Input:

3
AAA 21 A Female
BBB 22 B Male
CCC 24 C Female

Expected Output:

AAA BBB CCC
66
 */
package TCS_coding_25.TCS_question24;
import java.util.Scanner;
public class Students{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        StringBuilder names = new StringBuilder();
        int sum= 0 ;
        int femalecount = 0;

        for(int i = 0 ; i < n;i++){
            String name = sc.next();
            int age = sc.nextInt();
            char grade = sc.next().charAt(0);
            String gender = sc.next();

            if(age > 20 ){
                names.append(name).append(" ");

            }
            if(gender.equalsIgnoreCase("female")){
             sum = sum +grade;
             femalecount++;
            }
            
            /*
              if (!names.isEmpty()) {
            System.out.println(names.trim());
        } else {
            System.out.println();
        }
             */
        }
        sc.close();
            System.out.println(names.toString().trim());
            if(femalecount >0){
                System.out.println(sum/femalecount);

            }else{
                System.out.println(0);
            }
    
            
    }

    }
