package StringandBuilder;

public class strings {

    public static void main(String[] args){
        String str="hello";
        System.out.println(str.indexOf("h"));
        System.out.println(str+10);
        System.out.println("hellow \"how\" are you");//bachelore variable \

        for(int i=str.length()-1;i>=0;i--){
            System.out.print(str.charAt(i));
        }
for (int index = str.length()-1; index >=0; index--) {
   System.out.print(str.charAt(index)); 
}
        
    }
}
