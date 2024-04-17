package JavaIO;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * 数据流，专门用来做基本数据类型的读写的
 */
public class TestDateStream {
    public static void main(String[] args) {
        try {
//            TestDateStream.testDataOutputStream();
            TestDateStream.tesDataInputStream();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 数据输出流
     * DataOutputStream
     * 用数据输出流，写到文件中的基本数据类型的数据，是乱码的不能直接辨认
     * 需数据的输入流来读取
     */
    public static void testDataOutputStream() throws Exception {
        DataOutputStream dout = new DataOutputStream(new FileOutputStream("D:\\SSMS\\java\\Item\\Java Basics\\day001\\src\\JavaIO\\tt6.txt"));
//        dout.writeBoolean(true);
//        dout.writeDouble(1.35d);
        dout.writeInt(22);
        dout.flush();
        dout.close();
    }

    /**
     * 数据的输入流
     * DataInputStream
     * 输入流中读的数据类型应和数据输出流时写的数据类型保持一致
     */
    public static void tesDataInputStream() throws Exception {
        DataInputStream dIs = new DataInputStream(new FileInputStream("D:\\SSMS\\java\\Item\\Java Basics\\day001\\src\\JavaIO\\tt6.txt"));
        System.out.println(dIs.readInt());
        dIs.close();
    }
}
