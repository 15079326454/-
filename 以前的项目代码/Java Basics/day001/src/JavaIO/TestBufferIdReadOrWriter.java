package JavaIO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * 缓冲字符流
 */
public class TestBufferIdReadOrWriter {
    public static void main(String[] args) {
       /* try {
            TestBufferIdReadOrWriter.testBuffereddRead("D:\\SSMS\\java\\Item\\Java Basics\\day001\\src\\JavaIO\\tt.txt");
        } catch (Exception e) {
            e.printStackTrace();
        }*/
       /* try {
            TestBufferIdReadOrWriter.testBuffereddWriter("nnnnnns332423","D:\\SSMS\\java\\Item\\Java Basics\\day001\\src\\JavaIO\\tt1.txt");
        } catch (Exception e) {
            e.printStackTrace();
        }*/
        try {
            TestBufferIdReadOrWriter.copyFile("D:\\SSMS\\java\\Item\\Java Basics\\day001\\src\\JavaIO\\tt1.txt", "D:\\SSMS\\java\\Item\\Java Basics\\day001\\src\\JavaIO\\tt2.txt");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    /**
     * 缓冲字符输入流
     * BufferedReader
     */
    public static void testBuffereddRead(String inPath) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader(inPath));
        char[] ch = new char[100];
        int len = 0;
        while ((len = br.read(ch)) != -1) {
            System.out.println(new String(ch, 0, len));
        }
        br.close();
    }

    /**
     * 缓冲字符输出流
     * BufferedWriter
     */
    public static void testBuffereddWriter(String text, String out) throws Exception {
        BufferedWriter bw = new BufferedWriter(new FileWriter(out));
        bw.write(text);//写入内存
        bw.flush();//刷到硬盘
        bw.close();
    }

    /**
     * 缓冲字符流复制文件
     * inPath:输入的文件路径
     * outPath：输出的文件路径
     */
    public static void copyFile(String inPath, String outPath) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader(inPath));
        BufferedWriter bw = new BufferedWriter(new FileWriter(outPath));
        char[] c = new char[1024];
        int len = 0;
        while ((len = br.read(c)) != -1) {
            bw.write(c, 0, len);//写到内存中
        }
        bw.flush();//刷到硬盘
        bw.close();
        br.close();
    }
}
