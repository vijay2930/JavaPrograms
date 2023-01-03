/**
Write a programs to print following patterns
 9 9 9 9 9 9 9 9 9
  8 8 8 8 8 8 8 8
   7 7 7 7 7 7 7
    6 6 6 6 6 6
     5 5 5 5 5
      4 4 4 4
       3 3 3
        2 2
         1
 */
class Prgm50{
    public static void main(String []arg){
        int n=9;
        for(int i=n;i>0;i--){
            for(int j=i;j<n;j++){
                System.out.print(" ");
            }
            for(int j=0;j<i;j++){
                System.out.print(" "+i);
            }
            System.out.println();
        }
    }
}