class outer
{
    outer()
    {
        System.out.println("outer cons");
    }
    static int x=10;
    static int y=20;
    static void fun()
    {
        System.out.println("IN static  FUNNN");

    }
     static void run()
    {
        System.out.println("innon-static runn");
        

    }
   static  class inner
    {
        inner()
        {
            System.out.println("inner conss");
            System.out.println(x);//10
            fun();//static
            System.out.println(outer.y);//20
            outer.run();//non static
        }


    }
}
class client
{

    public static void main(String[] args) {
        outer.inner obj=new outer.inner();
        
   

        
        

    }
}
