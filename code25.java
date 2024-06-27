class parent{

}
class child extends parent
{
    void fun()
    {
        System.out.println("in funnn c");
    }
    public static void main(String[] args) {
        child obj=new child();

        parent obj2=new parent();
        obj.fun();
    }
}