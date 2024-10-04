public class asss {

    int x=10;
    static int y=20;

    void fun(){
        System.out.println(x);
        System.out.println(y);
    }
    static void fun2(){
        System.out.println(y);
    }
}

class Demo{
    public static void main(String[] args) {
        asss obj=new asss();

        obj.fun();
        obj.fun2();

        asss.fun();
        asss.fun2();

    }
}
