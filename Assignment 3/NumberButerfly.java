public class NumberButerfly {
    public static void main(String[] args) {
         int row = 4;
         for(int i = 1;i<=row;i++ ){
            for(int j = 1;j<=i;j++){
                System.out.print(j);
            }
            for(int k = 1 ; k<=2*(row-i);k++){
               System.out.print(" ");
            }
           
             for(int j = 1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
         for(int i = row-1 ; i>=1 ; i--){
       
        for(int k = 1 ; k<=i;k++){
             System.out.print(k);
        }
        for(int j = 1;j<=2*(row-i);j++){
            System.out.print(" ");
        }

         for(int k = 1 ; k<=i;k++){
             System.out.print(k);
        }
        System.out.println();
    }
    }
    
    }
    

