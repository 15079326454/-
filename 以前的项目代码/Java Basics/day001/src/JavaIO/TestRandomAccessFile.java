package JavaIO;

import java.io.RandomAccessFile;

/**
 * 文件的随机读写
 * 程序可以直接跳转到文件的任意地方来读。写文件
 */
public class TestRandomAccessFile {
    public static void main(String[] args) {
        try {
//            TestRandomAccessFile.testRandomAccessFileRead();
            TestRandomAccessFile.testRandomAccessFileWrite();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 随机读文件
     * RandomAccessFile
     */
    public static void testRandomAccessFileRead() throws Exception {
        //参数1：读写的文件路径
//    参数2：是指定RandomAccessFile的访问模式
//          r:以只读方式打开
//          rw：打开以便读取和写入
//          rwd：打开以便读取和写入；同步文件内容的更新
//          rws：打开以便读取和写入；同步文件内容和元数据的更新
        RandomAccessFile raf = new RandomAccessFile("D:\\SSMS\\java\\Item\\Java Basics\\day001\\src\\JavaIO\\tt8.txt", "r");
//    raf.seek(0);//设置读取文件内容的起始点
        raf.seek(8);//通过设置读取文件内容的起始点，来达到从文件的任意位置读取
        byte[] b = new byte[1024];
        int len;
        while ((len = raf.read(b)) != -1) {
            System.out.println(new String(b, 0, len));
        }
        raf.close();
    }

    /**
     * 随机写文件
     */
    public static void testRandomAccessFileWrite() throws Exception {
        RandomAccessFile ra = new RandomAccessFile("D:\\SSMS\\java\\Item\\Java Basics\\day001\\src\\JavaIO\\tt8.txt", "rw");
//    ra.seek(0);//设置写的起始点，0代表从头开始写
        ra.seek(ra.length());//设置写的起始点，ra.length()代表从文件的最后结尾写，也就是文件的追加
        ra.write("你好".getBytes());
        ra.close();
    }
}
