public class Divisor {
    public static void main(String[] args) {
        int n = 12 ;
       
        for(int i = 1 ; i<=Math.sqrt(n);i++){
            if(n%i==0){
                System.out.println(i +","+n/i);
                
                
            }
        }
      
        
    }
    
}
