class outer
{
    void fun()
    {
        System.out.println("IN FUN");
    }
}
class inner
{
    public static void main(String[] args) {
        outer obj = new outer()
        {


        };
        obj.fun();
    }
}