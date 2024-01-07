import java.util.*;
public class helloworld{
    public int getPersonAge(person p){
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


        // primitives int byte short long float double char boolean
        // generic person string car animal list stack queue

        // int x = 5
        // long y = 9
        // int z = x*y  --> incorrect
        // long z = x*y --> that is the correct thing

        // int x = 5;
        // String greetings = "hello";
        // reference variables -> stores the address of the object i.e "hello"

        // String str = "abc";
        // String str = new String("abc");
        // new keyword is used to create the instance of the class i.e Object

        // int[]  x = {1,2,3};
        // for(int y : x){
        //     System.out.println(y);
        // }
        // 1
        // 2
        // 3
        // int len = x.length;
        // for(int i=0;i<length;i++){
        //     System.out.println(x[i]);
        // }
        // 1
        // 2
        // 3

        for(int nextInt =1;nextInt<=maxVal; nextInt++){
            if(nextInt%2==0){
                sum+=nextInt;
            }
            else{
                prod*=nextInt;
            }
        }
        // initializaton
        // condition
        // increment
        int nextInt=1;
        do{
            if(nextInt%2==0){
                sum+=nextInt;
            }
            else{
                prod*=nextInt;
            }
        }
        while(/*condition*/)
        
        int nextInt =1;
        // maxVal = 10
        while(nextInt<=maxVal){
            if(nextInt%2==0){
                sum+=nextInt;
            }
            else{
                prod*=nextInt;
            }
            nextInt++;
        }

// first type
        if(condition){

        }
        else{

        }


        if(condition){

        }
        else if(condition){

        }
        else if(condition){

        }

        if(condition){  --> true
            // enter inside this block
        } // this will execute
        if(condition){
            // enter inside this block
        }
        if(condition){

        }

        int nextInt =1;
        int maxVal=0;
        // after first execution of do block it will go to while condition
        do{
            // code for execution
            nextInt++;
        }
        while(nextInt<=maxVal);



        <access modifier> <modifier> <return type> <function name>(args){
            // operation
            // return // whatever type it has u ll return it
            // void --> nothing to retur
        }
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

    // static method is the class method , you can directly call for the class
    // you do not have to make the object of that class
    static int findDistance(Pairs p1, Pairs p2){
        // find the distane of the two pairs
        // retunr something that has int value
        // modulus distance of two points
    }

    int distance = Pairs.findDistance();
}