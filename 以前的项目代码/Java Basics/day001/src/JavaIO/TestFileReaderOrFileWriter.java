package JavaIO;

import java.io.*;

public class TestFileReaderOrFileWriter {
    public static void main(String[] args) {
TestFileReaderOrFileWriter.testFileReader("C:\\Users\\admin\\Desktop\\txt类型的文件\\tt3.txt");
//        TestFileReaderOrFileWriter.testFileWriter("test20201110","C:\\Users\\admin\\Desktop\\txt类型的文件\\tt2.txt");
//        TestFileReaderOrFileWriter.copyFile("C:\\Users\\admin\\Desktop\\txt类型的文件\\tt2.txt","C:\\Users\\admin\\Desktop\\txt类型的文件\\cc\\tt2.txt");
    }
    /**
     * 文件字符输入流：FileReader
     * @param inPath
     */
    public static void testFileReader(String  inPath){
        try {
            FileReader fr = new FileReader(inPath);//创建字符输入流对象
            char[] c = new char[10];//创建临时存放数据的字符数组
            int len =0;
            while ((len=fr.read(c))!=-1){
                System.out.println(new String(c,0,len));
            }
            fr.close();//关闭流
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /**
     * 文件字符输出流：FileWriter
     * @param outPath
     */
    public static void testFileWriter(String text,String  outPath){
        try {
            FileWriter fw = new FileWriter(outPath);//创建字符输出流对象
          fw.write(text);//写到内存中
            int len =0;
           fw.flush();//把内存中的数据刷到硬盘中
            fw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 字符流完成复制文件
     * 复制文件到指定位置
     * inPath :读取的源文件
     * outPath:复制到的文件夹位置
     */
    public static void copyFile(String inPath, String outPath) {
        try {
            FileReader fr = new FileReader(inPath);//读取的源文件
            FileWriter fw = new FileWriter(outPath);//复制的的文件位置
            char[] c = new char[100];
            int len = 0;
            while ((len = fr.read(c)) != -1) {
                fw.write(c, 0, len);//参数1是写的缓冲数组，参数2是从数组的哪个位置开始，参数3是获取的数组的总长度
            }
            fw.flush();//把内存中的数据刷写到硬盘
            fw.close();
            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
