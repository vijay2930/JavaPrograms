/**
Evaluate the following expression on paper and on program and understand the
difference
i) ++a-b– ii) a%b++  iii)  a*=b+5     iv) x=69>>>2
 */

class Prgm18{
    static void expression1(int a,int b){
        int res = 0;
        System.out.println("Expression:\n++a - b--");
        System.out.printf("Before:\na=%d , b=%d , res=%d\n",a,b,res); 
        res = ++a - b--;
        // a=10  b=15
        // ++a - b--
        // 11-15
        // -4
        System.out.printf("After:\na=%d , b=%d , res=%d\n",a,b,res); 
    }
    public static void expression2(int a,int b){
        int res=0;
        System.out.println("Expression:\n++a - b--");
        System.out.printf("Before:\na=%d , b=%d , res=%d\n",a,b,res); 
        res =a%b++;
        // a=10  b=15
        // a % b++
        // 10%15
        // 10
        System.out.printf("After:\na=%d , b=%d , res=%d\n",a,b,res); 

    }
    public static void expression3(int a,int b){
        System.out.println("Expression:\na*= + b+5");
        System.out.printf("Before:\na=%d , b=%d \n",a,b); 
        // a=10 b=15
        // a=a*(b+5)
        // a=10*(15+5)
        // a=10*20
        // a=200
        a *= b + 5;
        System.out.printf("After:\na=%d , b=%d \n",a,b); 
    }
    public static void expression4(){
        // 69>>>2
        // 1000101 >>> 2
        // 0010001
        // 
        int x=0;
        System.out.println("Expression:\nx=69>>>2");
        System.out.printf("Before:\nx=%d\n",x);
        x=69>>>2;
        System.out.printf("After:\nx=%d\n",x);
    }
    public static void main(String []arg){
        int a=10,b=15;
        expression1(a,b);
        expression2(a,b);
        expression3(a,b);
        expression4();
    }
}