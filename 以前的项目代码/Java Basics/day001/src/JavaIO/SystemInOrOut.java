package JavaIO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;

/**
 * 标准输入输出流
 */
public class SystemInOrOut {
    public static void main(String[] args) {
       /* try {
            SystemInOrOut.testSystemIn();
        } catch (Exception e) {
            e.printStackTrace();
        }*/
        try {
            SystemInOrOut.writeToTxt();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /**
     * 标准输入流
     *
     * @throws Exception
     */
    public static void testSystemIn() throws Exception {
//        接收键盘输入数据的输入流
        InputStreamReader is = new InputStreamReader(System.in);
//把输入流放到缓冲流里
        BufferedReader br = new BufferedReader(is);
        String str = "";
        while ((str = br.readLine()) != null) {
            System.out.println(str);
        }
        br.close();
        is.close();
    }

    /**
     * 把控制台输入的内容写到指定的txt文件中，当接收到字符串over时，结束程序的允许
     */
    public static void writeToTxt() throws Exception {
            //接收键盘输入数据的输入流
        InputStreamReader is = new InputStreamReader(System.in);
            //把输入流放到缓冲流里
        BufferedReader br = new BufferedReader(is);
        BufferedWriter out = new BufferedWriter(new FileWriter("D:\\SSMS\\java\\Item\\Java Basics\\day001\\src\\JavaIO\\tt5.txt"));
        String lin = "";
        while ((lin = br.readLine()) != null) {
            if (lin.equals("over")) {
                break;
            }
            //读取每一行都写到指定的txt文件总
            out.write(lin);
        }
        out.flush();
        out.close();
        br.close();
        is.close();
    }
}
