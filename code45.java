class demo
{
    static int x=100;
    static void fun()
    {
        System.out.println("IN STATIC FUN");
    }
}
class client
{
    public static void main(String[] args) {

        System.out.println(demo.x);
        demo.fun();
        demo obj=new demo();
        System.out.println(obj.x);
        obj.fun();

    }
}
