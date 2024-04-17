package JavaSet;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;
public class TestTreeSet {
    public static void main(String[] args) {
        Person p1 = new Person(23, "张三");
        Person p2 = new Person(12, "小明");
        Person p3 = new Person(32, "王五");
        Person p4 = new Person(28, "李四");

        Set<Person> set = new TreeSet<Person>(new Person());
        set.add(p1);
        set.add(p2);
        set.add(p3);
        set.add(p4);
        for (Person p : set) {
            System.out.println(p.name + "   " + p.age);
        }
    }
}
class Person implements Comparator<Person> {
    int age;
    String name;

    public Person() {
    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    /*
        @Override
    //    年龄排序正序排序
        public int compare(Person o1, Person o2) {
            if (o1.age>o2.age){
                return 1;
            }else if (o1.age<o2.age){
                return -1;
            }else {
                return 0;
            }
        }*/
    @Override
//   年龄倒序排序
    public int compare(Person o1, Person o2) {
        if (o1.age < o2.age) {
            return 1;
        } else if (o1.age > o2.age) {
            return -1;
        } else {
            return 0;
        }
    }
}
