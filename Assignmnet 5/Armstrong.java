public class Armstrong {
    public static void main(String[] args) {
        int n = 153;
        int sum = 0;
        int count=0;
        int number=n;
        int cube=n;
         while(n!=0){
               n = n/10 ;
               count++;  
                 
    }
         while(cube!=0){
               double digit = Math.pow(cube%10,count);
               sum+=digit;
                cube = cube/10 ;
                 
    }
    System.out.println(sum);
    if(number==sum){
        System.out.println("Armstron Number");
    }
    else{
        System.out.println("Not Armstron Number ");
    }
    }
    
}
