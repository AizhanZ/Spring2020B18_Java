package day25_MethodsRecap;

public class return_methods {

    public static void main(String[] args) {
        System.out.println(max(10, 9));//if don't assign to var won't be able to use again
        System.out.println(max2(10,9));
    }

    //a, b

    public static int max(int a, int b){//this is a longer way
        int max = 0;
        if(a >= b){
            max = a;
        }else{
            max = b;
        }
        return max;
    }

    public static int max2(int a, int b){//this is a shorter way
        if(a >= b){
            return a;
        }else{
            return b;
        }

    }

}
