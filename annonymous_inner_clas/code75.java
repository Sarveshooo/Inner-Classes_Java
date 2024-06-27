class outer
{
    void fun(int x)
    {
        System.out.println("IN FUN OUTER");
    }
    void run(int x)
    {
        System.out.println("IN RUN OUTER");
    }
}
class inner
{
    public static void main(String[] args) {
        outer obj=new outer();
        obj.fun(10); 
        obj.run('A');
    }

}