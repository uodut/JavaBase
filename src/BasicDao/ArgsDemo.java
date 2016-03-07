package BasicDao;
/**
 * 可变参数
 * 必须为参数的最后一个，且在一个方法中只能有一个可变参数。可以把可变参数当做数组处理。
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
