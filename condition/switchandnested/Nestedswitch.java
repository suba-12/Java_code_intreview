package switchandnested;

import java.util.Scanner;

public class Nestedswitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int name = in.nextInt();
        String dept = in.next();

        switch (name) {
            case 1:
            System.out.println("subashini");  
                break;
                case 2:
            System.out.println("harry potter");  
                break;
            case 3:
            switch (dept) {
                case ("IT"):
                    System.out.println(" it dept");
                    break;
                    case ("csse"):
                    System.out.println(" its csedept");
                    break;
            
                default:
                System.out.println("no dept");
                    break;
            }
        
            default:
            System.out.println("invalid");
                break;
        }
    }
    
}
