/**
Write a programs to print following patterns
         9
        898
       78987
      6789876
     567898765
    45678987654
   3456789876543
  234567898765432
 12345678987654321
 */
class Prgm47{
    public static void main(String []arg){
        int n=9;
        for(int i=n;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<=n-i;j++){
                System.out.print(i+j);
            }
            for(int j=1;j<=n-i;j++){
                System.out.print(n-j);
            }
            System.out.println();
        }
    }
}