public class Palindrome {
   public static void main(String[] args) {
     int n =4;
    for(int i = 1 ;i<=n;i++ ){
          for(int k = 0 ;k<=n-i;k++){
            System.out.print(" ");
        }
        for(int j = i; j>=1;j--){
            System.out.print(j);
        }
        for(int j = i; j>=2;j--){
            System.out.print(j );
        }
      
        System.out.println();
    }
    
   }
}
