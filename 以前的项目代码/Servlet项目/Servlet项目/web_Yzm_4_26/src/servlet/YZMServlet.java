package servlet;


import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;


@WebServlet(name = "YZMServlet",value = "/YZMServlet")
public class YZMServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
              //设置类型
        response.setContentType("image/jpeg;charset=UTF-8");
        //创建image对象
       BufferedImage image=new BufferedImage(70,30,BufferedImage.TYPE_INT_RGB);
        //创建画笔
        Graphics graphics=image.createGraphics();
        //设置画笔颜色和字体
        graphics.setColor(changColor());
        graphics.setFont(new Font("微软雅黑",Font.BOLD,20));
        //确定绘画的图形
        graphics.fillRect(0,0,70,30);
        //获取绘画的内容
        String yzm=randomString();
        //将验证码存入session中
        request.getSession().setAttribute("yzm",yzm);
        //将内容画入image;
        for ( int i=0;i<yzm.length();i++){
            int num= (int) (Math.random()*10);
            graphics.setColor(changColor());
            graphics.drawString(yzm.substring(i,i+1),i*15+5,20);
            graphics.drawLine(0,num*i+3,70,num*i+2);
        }
        //将image输出
        ServletOutputStream outputStream=response.getOutputStream();
        ImageIO.write(image,"jpg",outputStream);
        outputStream.flush();
        outputStream.close();

    }

    private String randomString(){
        String  yzm="";
        char[] chars={'0','1','2','3','4','5','6','7','8','9','a','u','r','e','c','郏','s','h','v','j','u','y','m','n','k','i','l','o','n','b','z','x','d','w','q',
                '大','家','好','悠','美'};
        Random random=new Random();
        for (int i=0;i<4;i++){
            int index=random.nextInt(chars.length);
            yzm+=chars[index];
        }
        return yzm;
    }
private Color changColor(){
        Random random=new Random();
        int r=random.nextInt(256);
        int g=random.nextInt(256);
        int b=random.nextInt(256);
        return  new Color(r,g,b);
}


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            doPost(request,response);
    }

    @Override
    public void init() throws ServletException {
        super.init();
        ImageIO.setUseCache(false);
    }
}
