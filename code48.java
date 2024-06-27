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
            System.out.println(x);
            fun();
            System.out.println(y);
            run();
        }


    }
    public static void main(String[] args) {
        outer obj=new outer();
        inner obj2=obj.new inner();
      // outer.inner obj=new outer().new inner();
        obj.run();
        obj.fun();
        System.out.println(obj.x);
        System.out.println(obj.y);
        

    }
}