package String;
/**
 * ���ú���
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
        char[] cstr = str2.toCharArray();// ת��Ϊ�ַ�����
        System.out.println(str2.trim());// �����ײ���β���ո񣬶��м�Ŀո�������
        System.out.println(str2.split(" ")[4]);
    }
}
