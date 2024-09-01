package WIPRO;

public class Commandlineargument {
    
        public static void main(String[] args) {
            if (args.length != 2) {
                System.out.println("Usage: java Main <arg1> <arg2>");
                return;
            }
    
            String company = args[0];
            String location = args[1];
    
            System.out.println(company + " Technologies " + location);
        }
    }

