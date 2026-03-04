public class butterfly {
    public static void main(String[] args) {
        int row = 5 ;
          for(int i = 1;i<=row;i++ ){
            for(int j = 1;j<=i;j++){
                System.out.print("*");
            }
            for(int k = 1 ; k<=row-i;k++){
               System.out.print(" ");
            }
            for(int k = 1 ; k<=row-i;k++){
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
        for(int j = 1;j<=row-i;j++){
            System.out.print(" ");
        }

         for(int j = 1 ; j <= row - i ; j++){
        System.out.print(" ");
    }

         for(int k = 1 ; k<=i;k++){
             System.out.print("*");
        }
        System.out.println();
    }
    
        }
    }
    

