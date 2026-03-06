public class Palindrome {
        public static void main(String[] args) {
            int n= 11201 ;
            int number = n ;
            int reverse = 0;
          while(n!=0){
               int digit = n%10;
                reverse = (reverse*10)+digit ;
                n = n/10 ;  
    }
    System.out.println(reverse);
    if(number==reverse){
        System.out.println("Palindrome");
    }
    else{
        System.out.println("Not Palindrome");
    }
  
    }
    
}
