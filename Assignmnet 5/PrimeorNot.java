public class PrimeorNot {
    public static void main(String[] args) {

        int n = 7;
        int count = 0;

        for(int i = 1; i <= Math.sqrt(n); i++){
            if(n % i == 0){
             if(i!=n/i){
                   count+=2;
             }
             else{
                count+=1;
             }
            }
        }

        if(count == 2){
            System.out.println("Number is Prime");
        }
        else{
            System.out.println("Number is Not Prime");
        }
    }
}