package Basis;

/**
 * 学生类
 */
public class Students extends Person {
    public String school;
    /**
     * 显示个人信息方法
     */
    public void  showInfo(){
        System.out.println("学校："+school);
    }
public void  getInfo(){
    System.out.println("Students的GetInfo方法被调用了");
}


}
