public class CoPrime {
    public static void main(String[] args) {
        int a = 8;
        int b = 15;
        int gcd = 0;
        for(int i = 1 ; i<=Math.min(a, b);i++){
            if(a%i==0 && b%i==0){
                gcd=i;
            }
        }
        if(gcd==1){
            System.out.println("Is Co-prime");
        }
        else{
            System.out.println("Is not Co-prime");
        }
    }
    }

