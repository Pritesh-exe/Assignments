class Automorphic {
 public static void main(String [] args){


   int n = 25 ;
   int temp = 0 ; 
   int length = 0;
    while(temp!=0){
    temp = temp/10;
     length ++ ;

}
System.out.println(length);
int mod = (int)Math.pow(length,10);
 if(n%mod==n){
   System.out.println("Automorphic");
}
else{
   System.out.println("Not Automorphic");
}
}
}