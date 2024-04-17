package JavaIO;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;
import java.util.Scanner;

/**
 * @author zb
 * 3.创建一个属性文件，往里面添加5条用户名对应密码的记录
 * （zhongbei=123,yangkai=234,sunxu=345,ghz=456,zhouwei=567），
 * 验证输入用户名是否存在，若存在继续验证密码是否正确。
 */
public class PropertiesTest {

    private Boolean verification() throws IOException {
//        加载文件
        Properties pro = new Properties();
        pro.setProperty("zhongbei","123");//往属性文件中加入键和值
        pro.setProperty("yangkai", "234");
        pro.setProperty("sunxu", "345");
        pro.setProperty("ghz", "456");
        pro.setProperty("zhouwei", "567");
        File f = new File("D:\\SSMS\\java\\Item\\Java Basics\\day001\\src\\JavaIO\\tt5.txt");
        FileOutputStream fos = new FileOutputStream(f);
        pro.store(fos, "This is myproperties");//保存属性文件
        fos.close();
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入需要验证的用户名...");
        if (scan.hasNext()) {
            String str = scan.next();
            FileInputStream fin = new FileInputStream(f);
            pro.load(fin);//加载属性文件
            Enumeration<String> e = (Enumeration<String>)pro.propertyNames();
            //获取属性文件中所有的key
            while (e.hasMoreElements()) {//遍历每一个key
                String key = e.nextElement();//得到每一个key
                if (key.equals(str)) {
                    System.out.println("用户名存在，请输入密码");
                    if (scan.hasNext()) {
                        String s = scan.next();
                        if (pro.getProperty(key).equals(s)) {
                            System.out.println("登录成功！");
                            return true;
                        }else
                            return false;
                    }
                }
            }
            fin.close();
        }
        return false;
    }

    public static void main(String[] args) {
        try {
            PropertiesTest pt = new PropertiesTest();
            if(!pt.verification()){
                System.out.println("用户名或密码错误!");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
