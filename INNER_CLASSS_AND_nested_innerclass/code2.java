class outer{
    outer()
    {
        System.out.println("OUTER CONSTRUCTOR");
    }
    class inner{
        inner()
        {
            System.out.println("INNER CONSTRUCTOR");
        }
    }
    public static void main(String[] args) {
        outer outobj=new outer();
        inner obj=outobj.new inner();
    }
}