class parent
{

}
class child extends parent
{

}
class A
{
    void fun(parent obj)
    {
        System.out.println("IN FUN PAREMT");
    }
    void fun(child obj)
    {
        System.out.println("IN FUN CHILD");
    }

}
class b
{
    public static void main(String[] args) {
        A obj1 = new A();
        obj1.fun(new parent());
        obj1.fun(new child());
    }

}
