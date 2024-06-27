class outer
{
    void fun(int x)
    {
        System.out.println("IN FUN OUTER");
    }
    void fun(int y)////////////////////////////METHOD SIGNATURE METHOD
    {
        System.out.println("IN RUN OUTER");
    }
}
class inner
{
    public static void main(String[] args) {
        outer obj=new outer();
    }
}
