package JavaIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * 文件字节输入流:FileInputStream
 */
public class TestFileInputStream {
    public static void main(String[] args) {
//        TestFileInputStream.testFileInputStream();
//        TestFileInputStream.testFileOutputStream();
        TestFileInputStream.copyFile("C:\\Users\\admin\\Desktop\\txt类型的文件\\tt2.txt", "C:\\Users\\admin\\Desktop\\txt类型的文件\\cc\\tt2.txt");

    }

    /**
     * 文件字节输入流
     */
    public static void testFileInputStream() {
        try {
            FileInputStream in = new FileInputStream("C:\\Users\\admin\\Desktop\\txt类型的文件\\tt.txt");
            byte[] b = new byte[10];//设置一个byte数组接受读取的文件的内容
            int len = 0;//设置一个读取数据的长度
//            in.read(b);//in.read(b)方法有一个返回值，返回值读取的数据的长度，如果读取到最后一个数据，还会向后读取一个，
//            也就意味着当in.read(b)的返回值是-1时，整个文件就读取完毕了。
            while ((len = in.read(b)) != -1) {
                System.out.println(new String(b, 0, len));
            }
            in.close();//注意，流使用完毕后一定要关闭
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 文件字节输出流：FileOutputStream
     */
    public static void testFileOutputStream() {
        try {
            //指定向tt4输出数据
            FileOutputStream out = new FileOutputStream("C:\\Users\\admin\\Desktop\\txt类型的文件\\tt2.txt");
            String str = "sdfshdfshdfhsdf";
            out.write(str.getBytes());//把数据写到内存
            out.flush();//把内存中的数据刷写到硬盘
            out.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 复制文件到指定位置
     * inPath :读取的源文件
     * outPath:复制到的文件夹位置
     */
    public static void copyFile(String inPath, String outPath) {
        try {
            FileInputStream in = new FileInputStream(inPath);//读取的源文件
            FileOutputStream out = new FileOutputStream(outPath);//复制的的文件位置
            byte[] b = new byte[100];
            int len = 0;
            while ((len = in.read(b)) != -1) {
                out.write(b, 0, len);//参数1是写的缓冲数组，参数2是从数组的哪个位置开始，参数3是获取的数组的总长度
            }
            out.flush();//把内存中的数据刷写到硬盘
            out.close();
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
