import java.util.*;
public class helloworld{
    public static int main(person p){
        return p.age;
    }
    public static void main(String[] args){
        // want to take the input
        // new keyword is use for creating object of scanner (in general any class)
        Scanner sc = new Scanner(System.in);
        // do here that will executing
        // entry point for the execution of the program.
        int x = 5;
        x++; 
        x--;
        // these are postfix operations

        ++x;
        --x;

        // these are prefix operations

        
        x = x+1;
        x-=1;

        boolean y = true;
        //(!y) -> false

        int x = 5000;
        y = (long)x;


        // 16
        // 10000 -> in binary
        // << shift towards the left  => multiply by 2
        // 32
        // 100000  -> in binary left shift
        // >>
        // shift towards right  => divde by 2
        // 16
        // 7 -> 1110

        // 3 bits 0 to 7 in case of unsigned
        // -3 to 3
        // one bit is used as a sign bit

        int x = 6;
        // dont use for objects, use only for primitive data types
        if(x==6){
            // then execute something
        }

        int x = 5;
        int y = 6;

        // 110;
        // 101;
        // 100;

        // 5 -> 101
        // 6 -> 110
        // 4 -> 100

        // ^ -> bitwise xor
        // 5 -> 101
        // 6 -> 110
        // 3 -> 011

        // | -> bitwise or
        // 5 -> 101
        // 6 -> 110
        // 7 -> 111

        // bool x = false 
        // bool y = true
        // x && y -> false
        // x || y -> true

        // int x = (y==5)?0:1;

        // if(y==5){
        //     x = 0;
        // }
        // else{
        //     x=1;
        // }

        // x+=1
        // x*=5;
        // x/=19;
        
        // x = x(operations)(number);

        //int x = 5;
        //int x = -5; => unary minus

        // int x = 5;
        // int i =2;
        // i =2
        // int y = x*i++; // 10
        // i=3
        // i=4
        // int z = x*++i; // 20
    }
}


class Pairs{
    int x;
    int y;
    public static void main(String[] args){
        // do here that will executing
        // entry point for the execution of the program.
        person p = new person();
        System.out.println(p.age);
    }
}