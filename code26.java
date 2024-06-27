class parent 
{
    void fun()
    {
        System.out.println("in funnnnn p");
    }
    void run()
    {
        System.out.println("in run p");
    }
}
class child extends parent{
     void fun()
    {
        System.out.println("in fun c");
        
    
    }
    void run()
    {
        System.out.println("in run c");
    }
    public static void main(String[] args) {
        parent obj=new parent();
        obj.fun();
        
    }
}