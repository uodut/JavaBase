package String;
/**
 * @author UODUT �Ƚ��ѷ������ַ����Ƚ�
 *
 */
public class StringCompare {
    public static void main(String[] args) {
        String str = "abc";
        String str1 = "abc";
        String str2 = new String("abc"); // new String();����һ������
        System.out.println(str == str1); // true
        System.out.println(str1 == "abc");// true
        System.out.println(str2 == "abc"); // false
        System.out.println(str1 == str2); // false
        System.out.println(str1.equals(str2));// true
        System.out.println(str1 == str2.intern()); // true
        System.out.println(str2 == str2.intern()); // false
        System.out.println(str1.hashCode() == str2.hashCode()); // true
    }
    /*
     * ������ truetruefalsefalsetruetruefalsetrue
     */
}
