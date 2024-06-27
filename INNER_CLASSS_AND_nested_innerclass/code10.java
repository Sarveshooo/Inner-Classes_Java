class outer{
    int x=10;
    static int y=20;

    outer()
    {
        System.out.println("IN OUT CONSTRUCTOR");
    }
    void fun()
    {
        System.out.println("IN FUNNNN");
    }
    class inner{
        int z=80;
        inner()
        {
            System.out.println("IN INNER CLASS");
            System.out.println(x);
            System.out.println(y);
            System.out.println(z);
            fun();
        }
        
    }
    public static void main(String[] args) {
        outer outobj=new outer();
        inner obj=outobj.new inner();
    }
}