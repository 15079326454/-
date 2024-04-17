package JavaIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 转换流
 * 可以把字节流转换为字符流
 * 当字节流中的数据都是字符时，使用转换流转为字符流处理效率更高
 */
public class InOrOutStreamRead {
    public static void main(String[] args) {
       /* try {
            InOrOutStreamRead.testInputStreamRead();
        } catch (Exception e) {
            e.printStackTrace();
        }*/
        try {
            InOrOutStreamRead.testOutputStreamWriter("你好，我叫乐乐", "D:\\SSMS\\java\\Item\\Java Basics\\day001\\src\\JavaIO\\tt4.txt");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 转换字节输入流为字符输入流
     * InputStreamReader
     *
     * @throws Exception
     */

    public static void testInputStreamRead() throws Exception {
        FileInputStream fs = new FileInputStream("D:\\SSMS\\java\\Item\\Java Basics\\day001\\src\\JavaIO\\tt3.txt");
        InputStreamReader insr = new InputStreamReader(fs, "GBK");//参数1是字节流，参数2是编码
        char[] c = new char[100];
        int len = 0;
        while ((len = insr.read(c)) != -1) {
            System.out.println(new String(c, 0, len));
        }
        insr.close();
        fs.close();
    }

    /**
     * 转换字节输出流为字符输出流
     * InputStreamReader
     *
     * @throws Exception
     */
    public static void testOutputStreamWriter(String text, String outPath) throws Exception {
        FileOutputStream out = new FileOutputStream(outPath);
        OutputStreamWriter osw = new OutputStreamWriter(out, "UTF-8");
        osw.write(text);
        osw.flush();
        osw.close();
        out.close();
    }
}
