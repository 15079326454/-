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

@WebServlet(name = "yanServlet",value = "/yanServlet")
public class yanServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
           response.setContentType("image/jpeg;charset=UTF-8");
        BufferedImage bufferedImage=new BufferedImage(70,30,BufferedImage.TYPE_INT_RGB);
        Graphics graphics=bufferedImage.createGraphics();
        graphics.setColor(Color.green);
        graphics.setFont(new Font("隶书",Font.BOLD,20));
        graphics.fillRect(0,0,70,30);
        String yzm="qwer";
        request.getSession().setAttribute("yzm",yzm);
        for (int i=0;i<yzm.length();i++){
            graphics.setColor(Color.black);
            graphics.drawString(yzm.substring(i,i+1),(i*15+5),20);
        }
        ServletOutputStream outputStream=response.getOutputStream();
        ImageIO.write(bufferedImage,"png",outputStream);
        outputStream.flush();
        outputStream.close();

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
