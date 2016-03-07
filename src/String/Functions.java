package String;
/**
 * 常用函数
 * 
 * @author UODUT
 *
 */
public class Functions {
    public static void main(String[] args) {
        String str1 = "sdfsdfsdjfk121";
        String str2 = "  Sd  rf  d";
        char[] c = { 's', 'd', 'r', 'f' };
        System.out.println(str2.compareTo(str1));
        // System.out.println(str2.concat("TOM"));
        System.out.println();
        byte[] b = str2.getBytes();
        String str3 = "";
        System.out.println(str3.isEmpty());
        System.out.println(str2.toUpperCase());
        char[] cstr = str2.toCharArray();// 转换为字符数组
        System.out.println(str2.trim());// 忽略首部和尾部空格，对中间的空格不做处理
        System.out.println(str2.split(" ")[4]);
    }
}
