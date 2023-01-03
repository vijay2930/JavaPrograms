/**
Write a program for the following. Let consider 20 students in a class with the roll no 101-120. We are going to split them into four groups. Based on their roll number we are going to split them with the following logics.
Group 1:
101
105
109
113
117
Group 2:
102
106
110
114
118
Group 3:
103
107
111
115
119
Group 4:
104
108
112
116
120
 */
import java.util.Arrays;
class Prgm6{
    public static void main(String []arg){
        final int groups=4;
        for(int i=1;i<=groups;i++){
            System.out.printf("Group %d :\n",i);
            int n=100+i;
            for(int j=1;j<=groups+1;j++){
                System.out.println(n);
                n+=4;
            }
        }
    }
}