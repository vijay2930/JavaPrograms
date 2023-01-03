/**
Evaluate the following expression on paper and on program and understand the difference
If int y = 10 then find int z = (++y * (y++ + 5));
 */
class Prgm21{
    public static void main(String arg[]){
        int y=10;
        int z=0;
        System.out.println("Expression:\nz = (++y * (y++ + 5))\n");
        System.out.printf("Before:y=%d,z=%d\n",y,z);
        // z=(++y * (y++ + 5));
        // z=11 * (11+5)
        // z=176
        z=(++y * (y++ + 5));
        System.out.printf("After:y=%d,z=%d\n",y,z);
    }
}