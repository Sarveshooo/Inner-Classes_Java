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
        inner obj=new inner();
    }
}