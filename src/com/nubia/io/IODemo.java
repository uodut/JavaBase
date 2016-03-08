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
    // ���ֽ�Ϊ��λ��ȡ�ļ��������ڶ��������ļ�����ͼƬ��������Ӱ����ļ���
    static void readFileByBytes(String fileName) {
        File f = new File(fileName);
        InputStream is = null;
        try {
            message= "���ֽ�Ϊ��λ��ȡ�ļ����ݣ�һ�ζ�һ���ֽڣ�";
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
                // ȷ�����ջ�ִ�и�����䣬�ر���
                if (is != null) {
                    is.close();// �ر���
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        // һ�ζ�����ֽ�
        try {
            message = "���ֽ�Ϊ��λ��ȡ�ļ����ݣ�һ�ζ�һ���ֽڣ�";
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
                // ȷ�����ջ�ִ�и�����䣬�ر���
                if (is != null) {
                    is.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    // ���ַ�Ϊ��λ��ȡ�ļ��������ڶ��ı������ֵ����͵��ļ�
    static void readFileByChars(String fileName) {
        File f = new File(fileName);
        Reader read = null;
        int temp;
        try {
            LogHandler.createUnSynInstance(IODemo.class).info("���ַ�Ϊ��λ��һ�ζ�ȡһ���ַ�");
            read = new InputStreamReader(new FileInputStream(f));
            while ((temp = read.read()) != -1) {// read()�������ض�ȡ�����ַ���intֵ
                // ����windows�£�\r\n�������ַ���һ��ʱ����ʾһ�����С�
                // ������������ַ��ֿ���ʾʱ���ỻ�����С�
                // ��ˣ����ε�\r����������\n�����򣬽������ܶ���С�
                if (((char) temp) != '\r') {
                    System.out.print((char) temp);
                }
            }
            read.close();// �ر���
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try {
            //LogHandler.createUnSynInstance(IODemo.class).info;
            LogHandler.createUnSynInstance(IODemo.class).info("���ַ�Ϊ��λ��һ�ζ�ȡ����ַ�");
            read = new InputStreamReader(new FileInputStream(f));
            char[] tempChar = new char[30];
            int tempValue;
            while ((tempValue = read.read(tempChar)) != -1) {// read(char[]
                                                             // cbuf)���ض�ȡ�����ַ����ĳ���
                // ���tempChar�ĳ��ȴ���Ҫ��ȡ���ļ��ĳ��ȣ���ôһ����ȫ����ȡ
                // ���tempChar�ĳ���С��Ҫ��ȡ���ļ��ĳ��ȣ���ôһ�ζ�ȡtempchars.length������
                if (tempChar.length >= tempValue) {
                    System.out.print(tempChar);// �ַ��������ֱ��print
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
        } finally {// �ر���
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
    // ����Ϊ��λ��ȡ�ļ��������ڶ������еĸ�ʽ���ļ�
    static void readFileByLine(String fileName) {
    }
    // �����ȡ�ļ�����
    static void readFileByRandom(String fileName) {
    }
}
