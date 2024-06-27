class outer
{
    outer()
    {
        System.out.println("IN OUTER CONSTRUCTOR");
    }
    void fun()
    {
        System.out.println("IN FUN OUTER");
        class inner
        {
            inner()
            {
                System.out.println("IN INNER CONSTRUCTOR");
            }
            inner obj=new inner();

        }
        
    }
    public static void main(String[] args) {
        outer obj=new outer();
        obj.fun();
    }

}