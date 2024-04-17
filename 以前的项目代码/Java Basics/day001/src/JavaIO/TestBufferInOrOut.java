package JavaIO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class TestBufferInOrOut {
    public static void main(String[] args) {
/*        try {
            TestBufferInputStream.testBufferInputStream();
        } catch (Exception e) {
            e.printStackTrace();
        }*/
        /*try {
            TestBufferInputStream.testBufferOutputStream();
        } catch (Exception e) {
            e.printStackTrace();
        }*/

        try {
            TestBufferInOrOut.copyFile("D:\\SSMS\\java\\Item\\Java Basics\\day001\\src\\JavaIO\\tt1.txt","D:\\SSMS\\java\\Item\\Java Basics\\day001\\src\\JavaIO\\tt2.txt");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    /**
     * 缓冲字节输入流
     * BufferedInputStream
     */
    public static void testBufferInputStream() throws Exception {
        //文件字节输入流对象
        FileInputStream in = new FileInputStream("D:\\SSMS\\java\\Item\\Java Basics\\day001\\src\\JavaIO\\tt.txt");
//       把文件字节输入流放到 缓冲字节输入流对象
        BufferedInputStream br = new BufferedInputStream(in);
        byte[] b = new byte[10];
        int len = 0;
        while ((len = br.read(b)) != -1) {
            System.out.println(new String(b, 0, len));
        }
//        关闭流时，先开的最后关，后开的，最先关
        br.close();
        in.close();
    }

    /**
     * 缓冲字节输出流
     * BufferedOutputStream
     */
    public static void testBufferOutputStream() throws Exception {
        //创建字节输出流对象
        FileOutputStream out = new FileOutputStream("D:\\SSMS\\java\\Item\\Java Basics\\day001\\src\\JavaIO\\tt1.txt");
//    把字节输出流对象方放到缓冲字节输出流中
        BufferedOutputStream bo = new BufferedOutputStream(out);
        String s = "hello word";
        bo.write(s.getBytes());//写到内存中
        bo.flush();//刷到硬盘中
        bo.close();
        out.close();
    }

    /**
     * 缓冲流复制文件
     */
    public static void copyFile(String inPath,String outPath) throws Exception{
        BufferedInputStream br =new BufferedInputStream(new FileInputStream(inPath));
        BufferedOutputStream bo = new BufferedOutputStream(new FileOutputStream(outPath));
        byte[] b =new byte[1024];
        int len =0;//设置一个读取到的数据的长度
        while ((len=br.read(b))!=-1){
           bo.write(b,0,len);//写到内存中
        }
        bo.flush();//刷到硬盘
        bo.close();
        br.close();
    }

}
