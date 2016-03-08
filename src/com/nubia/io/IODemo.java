package com.nubia.io;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import com.nubia.log.LogHandler;
public class IODemo {
    private static String message = null;
    public static void main(String[] args) {
        String fileName = "../JavaBase1.7/src/IO/IONote";
        String fileName2 = "../JavaBase1.7/src/IO/test";
        // readFileByBytes(fileName);
        readFileByChars(fileName);
    }
    // 以字节为单位读取文件，常用于读二进制文件，如图片、声音、影像等文件。
    static void readFileByBytes(String fileName) {
        File f = new File(fileName);
        InputStream is = null;
        try {
            message= "以字节为单位读取文件内容，一次读一个字节：";
            LogHandler.createUnSynInstance(IODemo.class).info(message);
            is = new FileInputStream(f);
            int temp;
            while ((temp = is.read()) != -1) {
                System.out.write(temp);
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            try {
                // 确保最终会执行该条语句，关闭流
                if (is != null) {
                    is.close();// 关闭流
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        // 一次读多个字节
        try {
            message = "以字节为单位读取文件内容，一次读一个字节：";
            LogHandler.createUnSynInstance(IODemo.class).info(message);
            byte[] tempbytes = new byte[100];
            is = new FileInputStream(f);
            int byteRead;
            while ((byteRead = is.read(tempbytes)) != -1) {
                System.out.write(tempbytes, 0, byteRead);
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            try {
                // 确保最终会执行该条语句，关闭流
                if (is != null) {
                    is.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    // 以字符为单位读取文件，常用于读文本，数字等类型的文件
    static void readFileByChars(String fileName) {
        File f = new File(fileName);
        Reader read = null;
        int temp;
        try {
            LogHandler.createUnSynInstance(IODemo.class).info("以字符为单位，一次读取一个字符");
            read = new InputStreamReader(new FileInputStream(f));
            while ((temp = read.read()) != -1) {// read()方法返回读取到的字符的int值
                // 对于windows下，\r\n这两个字符在一起时，表示一个换行。
                // 但如果这两个字符分开显示时，会换两次行。
                // 因此，屏蔽掉\r，或者屏蔽\n。否则，将会多出很多空行。
                if (((char) temp) != '\r') {
                    System.out.print((char) temp);
                }
            }
            read.close();// 关闭流
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try {
            //LogHandler.createUnSynInstance(IODemo.class).info;
            LogHandler.createUnSynInstance(IODemo.class).info("以字符为单位，一次读取多个字符");
            read = new InputStreamReader(new FileInputStream(f));
            char[] tempChar = new char[30];
            int tempValue;
            while ((tempValue = read.read(tempChar)) != -1) {// read(char[]
                                                             // cbuf)返回读取到的字符集的长度
                // 如果tempChar的长度大于要读取的文件的长度，那么一次性全部读取
                // 如果tempChar的长度小于要读取的文件的长度，那么一次读取tempchars.length个长度
                if (tempChar.length >= tempValue) {
                    System.out.print(tempChar);// 字符数组可以直接print
                } else {
                    for (int i = 0; i < tempValue; i++) {
                        if (tempChar[i] == '\r') {
                            continue;
                        } else {
                            System.out.print(tempChar[i]);
                        }
                    }
                }
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {// 关闭流
            if (read != null) {
                try {
                    read.close();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
    }
    // 以行为单位读取文件，常用于读面向行的格式化文件
    static void readFileByLine(String fileName) {
    }
    // 随机读取文件内容
    static void readFileByRandom(String fileName) {
    }
}
