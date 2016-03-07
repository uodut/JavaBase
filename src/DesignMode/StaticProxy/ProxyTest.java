package DesignMode.StaticProxy;
public class ProxyTest {
    public static void main(String[] args) {
        SchoolGirl girl = new SchoolGirl("tingting");
        Proxy p = new Proxy(girl);
        p.giveDolls();
        p.sendFlower();
    }
}
