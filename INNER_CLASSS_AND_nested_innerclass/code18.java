class outer{
    outer()
    {
        System.out.println("out conss");
    }
    class inner{

        inner()
        {
            System.out.println("IN INNER con");
        }
    }
    public static void main(String[] args) {
        outer.inner obj=new outer().new inner();
        ////or/////
        outer outobj=new outer();
        inner objinn=outobj.new inner();
    }
}