class outer
{
    void fun()
    {
        System.out.println("IN FUN OUTER");
    }
}
class inner extends outer
{
    void fun()
    {
        System.out.println("IN FUN INNER");
    }

}
class inner2
{
    public static void main(String[] args) {
        outer obj=new inner()
        {

        };
        obj.fun();

    }
}