public class ques5 {
public static void main(String[] args) {
          int row = 4; 
                
         for(int i =1;i<=row;i++){
                   
            for (int j=1 ; j<=row;j++  ){
              if(i%2!=0 && j%2==0){
                System.out.print("#");
              }
             else if (i%2==0 && j%2!=0) {
                System.out.print("#");
                
              }
              else{
                System.out.print("*");
              }
             
            }
            
            System.out.println();
        }
}
}