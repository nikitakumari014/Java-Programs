abstract class A 
{
    abstract void show();
    void fun()
    {
        System.out.println("Fun");
    }
}
class B extends A
{
    void show()
    {
        System.out.println("Show in class B");
    }
}
class C extends A{
    void show()
    {
        System.out.println("Show in class C");
    }
}
public class test {
    public static void main(String[]args)
    {
        B b = new B();
        C c = new C();
        b.show();
        b.fun();
        c.show();
        c.fun();
    }
}
