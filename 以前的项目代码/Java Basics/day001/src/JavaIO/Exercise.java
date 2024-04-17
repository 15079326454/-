package JavaIO;

import java.io.*;

/**
 * 在TXT文件中，写一组用户名和密码，通过控制台输入用户名和密码，与TXT文件中的用户名密码做对比，如果一样就输出登录成功，如果不一样，就输出登录失败
 */
public class Exercise {
    private String ttFile;

    public Exercise(String ttFile) {
        this.ttFile = ttFile;
    }

    public Boolean checkTT(String inPath) throws Exception {
        System.out.println("请输入用户名：");
        String userName = new BufferedReader(new InputStreamReader(System.in)).readLine();//
        System.out.println("请输入密码：");
        String password = new BufferedReader(new InputStreamReader(System.in)).readLine();
return false;

    }
}


