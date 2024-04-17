package Basis;

public class Circle {
    double redius;
    public Circle(){
        redius=1;
    }
    public  double findArea(){
        return 3.14*redius*redius;
    }

    public double getRedius() {
        return redius;
    }

    public void setRedius(double redius) {
        this.redius = redius;
    }
}
