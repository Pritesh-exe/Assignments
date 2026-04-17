public class PrefectNumber {
    public static void main(String[] args) {
         int a = 36;
    int sum = 1;
          for(int i = 2 ; i<=Math.sqrt(a);i++){
            if(a%i==0 ){
    
               if(i == a/i)
                 sum += i;
               else
                 sum += i + a/i;
            }
        }
        System.out.println(sum);
        if (sum==a) {
            System.out.println("Perfect_number");
        }
        else{
            System.out.println("Not-Perfect_number");
        }
    }
    
}
