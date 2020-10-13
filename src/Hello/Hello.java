package Hello;

import java.util.Scanner;

class Hello{
    static Scanner in = new Scanner(System.in);

    public static void main (String[] args){
        int x = in.nextInt(), a = in.nextInt(), i=0;
        long c=0;

        if(a>=0){
            while(i!=a){
                c+=x;
                i++;}
        }else{
            while(i!=x&i!=-x){
                c+=a;
                i++;}
        }

        System.out.println(c);
    }
}