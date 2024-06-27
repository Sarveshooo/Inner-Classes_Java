class outer
{
    outer()
    {
        System.out.println("outer cons");
    }
    static int x=10;
    int y=20;
    static void fun()
    {
        System.out.println("IN static  FUNNN");

    }
    void run()
    {
        System.out.println("innon-static runn");
        

    }
    class inner
    {
        inner()
        {
            System.out.println("inner conss");
            System.out.println(x);//10
            fun();//static
            System.out.println(y);//20
            run();//non static
        }


    }
}
class client
{

    public static void main(String[] args) {
        outer.inner obj=new outer().new inner();
        
        

    }
}
