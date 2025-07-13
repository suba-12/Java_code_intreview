package TCSnqt;

public class Primerange {
    public static void main(String[] args) {
        
    
    int s = 20;
    int e = 30;
    for (int index = s; index <=e; index++) {
        if(prime(index)){
          System.out.println(index);
        }
    }
     

}
static boolean prime(int num){
  if(num <= 1){
return false;
  }
  for (int index = 2; index < num; index++) {
    if(num %index ==0){
        return false;
    }
  }
 

    return true;
}
}
