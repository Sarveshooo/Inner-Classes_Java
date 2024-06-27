/////////1st code of 10/06/24
/////inheritance
class parent
{
    parent()
    {
        System.out.println("parenttttt");
}
}
class child extends parent
{
    child()
    {
        System.out.println("childdddddd");
    }
    public static void main(String[] args) {
        child obj=new child();
    }
}