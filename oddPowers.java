public class MyClass {
    public static void main(String args[]) {
        System.out.println("Power\tResult");
        for(int num=1;num<=29;num++){
            double power = Math.log(num)/Math.log(2);
            if(Math.floor(power)==power && power%2!=0){
                System.out.println((int)power+"\t\t"+num);
            }
        }
    }
}