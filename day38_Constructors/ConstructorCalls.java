package day38_Constructors;

public class ConstructorCalls {

    public ConstructorCalls() {
        method1(); //only a constructor can call another constructor
        method2();

    }
    public ConstructorCalls(int a){
        //ConstructorCalls()
        this();
    }

    private void method1() {

    }

    private void method2(){
        //method2();
        //ConstructorCalls()

    }

}
