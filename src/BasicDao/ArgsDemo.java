package BasicDao;
/**
 * �ɱ����
 * ����Ϊ���������һ��������һ��������ֻ����һ���ɱ���������԰ѿɱ�����������鴦��
 * @author UODUT
 *
 */
public class ArgsDemo {
    public static void main(String[] args) {
         //System.out.println(add(2,3,4,5,6,7,8,9));
    }

    static int add(int a, int... args) {
        int sum = a;
        for (int i = 0; i < args.length; i++) {
            sum += args[i];
        }
        return sum;
    }
}
