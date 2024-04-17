package Basis;

public class MyDate {
    int year;
    int month;
    int day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    @Override
    public boolean equals(Object obj) {
        int flag =1;
        if (obj instanceof MyDate){
            MyDate md = (MyDate) obj;
            flag=0;
            if (this.year!=md.year){
                flag+=1;
            }if (this.month!=md.month){
                flag+=1;
            }if (this.day!=md.day){
                flag+=1;
            }
        }if (flag==0){
            return true;
        }else {
            return false;
        }

    }
}
