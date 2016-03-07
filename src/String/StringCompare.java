package String;
/**
 * @author UODUT 比较难分析的字符串比较
 *
 */
public class StringCompare {
    public static void main(String[] args) {
        String str = "abc";
        String str1 = "abc";
        String str2 = new String("abc"); // new String();拷贝一个副本
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
     * 输出结果 truetruefalsefalsetruetruefalsetrue
     */
}
