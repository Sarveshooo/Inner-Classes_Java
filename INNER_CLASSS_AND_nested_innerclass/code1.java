class outer
{
    class inner
    {
        inner()
        {
            System.out.println("INNER CONSTRUCTOR");
        }
    }
    public static void main(String[] args) {
        inner obj=new inner();
    }
}/////////////////////here inner class is non static in nature 