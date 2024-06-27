class outer
{
    int x=10;
    static int y=30;
    outer()
    {
        System.out.println("IN OUTER CONSTRUCTOR 9");
    }

    class inner{
        inner()
        {
            System.out.println("IN INNER CONSTRUCTOR  9 ");
            System.out.println(x);
            System.out.println(y);

        }
        ///System.out.println(int x);
       /// System.out.println(y);
        

    }
    public static void main(String[] args) {
        outer outobj=new outer();
        inner obj=outobj.new inner();
    }

}