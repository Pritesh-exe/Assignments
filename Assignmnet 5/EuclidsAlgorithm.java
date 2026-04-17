public class EuclidsAlgorithm {
    public static void main(String[] args) {
        int a = 52 ;
        int b = 10 ;
      int  gcd = 1 ;
        while(a!=0&&b!=0){
         if(a>b){
            a=a%b;
         }
         else {
             b=b%a;
         } 
        }
        if(a==0)
            gcd=b;
        else if(b==0)
            gcd=a;
            
       System.out.println(gcd);
      }  
}
