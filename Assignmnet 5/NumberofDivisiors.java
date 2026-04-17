public class NumberofDivisiors {
    public static void main(String[] args) {
        int n = 36 ;
        int count=0;
        for(int i = 1 ; i<=Math.sqrt(n);i++){
            if(n%i==0){  
          if(i!=n/i){
                   count+=2;
             }
             else{
                count+=1;
             }
            }
        }
        System.out.println(count);
        
    }
    }
    
