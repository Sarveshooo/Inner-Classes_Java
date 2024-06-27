class outer
{
    void fun(Object x)
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
        obj.fun("sarvesh");
        obj.fun(10.5);
        obj.fun(10.666f);
        obj.fun(new String("sarvesh"));
        obj.fun(new StringBuffer("sarvesh"));
        
       
    }

}