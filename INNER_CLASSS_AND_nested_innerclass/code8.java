class outer{
    outer()
    {
        System.out.println("IN OUTER CONSTRUCTOR    8");
    }
    class inner{
        inner()
        {
            System.out.println("IN INNER CONSTRUCTOR   8");
        }
    }
    public static void main(String[] args) {
        outer obj1=new outer();
        outer obj2=new outer();

        inner inobj=obj1.new inner();
    }
}