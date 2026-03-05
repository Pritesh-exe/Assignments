public class BinaryDiamond {
    public static void main(String[] args) {
          int n = 4 ;
          boolean count = false ;
         for(int i = 1 ; i<= n ; i++){
        for(int j = 1 ; j<=n-i;j++){
           System.out.print(" ");
        }
        for(int k = 1 ; k<=i;k++){
            if (count) {
                System.out.print(0+" ");
                count=false;
            }
            else{
                System.out.print(1+" ");
                count =true ;
            }
        }
       System.out.println();
 }
  for(int i = n ; i>=1 ; i--){
        for(int j = 1 ; j<=n-i;j++){
            System.out.print(" ");
        }
        for(int k = 1 ; k<=i;k++){
            if (count) {
                System.out.print(0+" ");
                count=false;
            }
            else{
                System.out.print(1+" ");
                count=true;
            }
        }
        System.out.println();
    }
    }
    
}
