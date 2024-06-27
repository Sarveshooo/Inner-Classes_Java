/////////////////FOLLOW THE SEQUENCE 
//////////////1     INNER_CLASS_NESTED_INNER_CLASS
//////////////2     METHOD_LOCAL_INNER_CLASS
//////////////3     STATIC_INNER_CLASSS
//////////////4     ANNONYMOUS INNER CLASS
class outer
{

    outer()
    {
        System.out.println("IN OUTER CONSTRUCTOR  0");
    }
    class inner
    {
        inner()
        {
            System.out.println("IN INNER CONSTRUCTOR  0");
        }
    }
    public static void main(String[] args) {
        outer obj=new outer();
        inner obj=new inner();
    }
}
