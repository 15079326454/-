package Basis;

public class Cylinder extends Circle{
    double length;
    public  Cylinder(){
        length=1;
    }

    public double findVolume(){
        return findArea()*length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public static void main(String[] args) {
        Cylinder cylinder =new Cylinder();
        System.out.println("圆的面积是："+cylinder.findArea());

        System.out.println("圆柱的体积是："+cylinder.findVolume());
    }


}
