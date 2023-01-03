/**
Find if a String2 is substring of String1. If it is, return the index of the first occurrence. else return -1.
 */
class Prgm59{
    public static int method(String str1,String str2){
        int l=str2.length();
        for(int i=0;i<=str1.length()-str2.length();i++,l++){
            String str=str1.substring(i,l);
            if(str.equals(str2))
                return i;
        }
        return -1;

    }
    public static void main(String str[]){
        String str1="testing1234";
        String str2="1234";
        System.out.println(method(str1,str2));
    }
}