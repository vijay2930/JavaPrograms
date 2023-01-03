/**
Write a programs to print following patterns
 * * * * * * * * *
  * * * * * * * *
   * * * * * * *
    * * * * * *
     * * * * *
      * * * *
       * * *
        * *
         *
 */
class Prgm49{
    public static void main(String []arg){
        int n=9;
        for(int i=n;i>0;i--){
            for(int j=i;j<n;j++){
                System.out.print(" ");
            }
            for(int j=0;j<i;j++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}