public class butterfly2 {
    public static void main(String[] args) {
        int row = 5;
         for(int i = 1;i<=row;i++ ){
            for(int j = 1;j<=i;j++){
                System.out.print("*");
            }
            for(int k = 1 ; k<=2*(row-i);k++){
               System.out.print(" ");
            }
           
             for(int j = 1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
         for(int i = row-1 ; i>=1 ; i--){
       
        for(int k = 1 ; k<=i;k++){
             System.out.print("*");
        }
        for(int j = 1;j<=2*(row-i);j++){
            System.out.print(" ");
        }

         for(int k = 1 ; k<=i;k++){
             System.out.print("*");
        }
        System.out.println();
    }
    
    }
    
}
