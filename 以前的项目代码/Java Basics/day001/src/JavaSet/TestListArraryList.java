package JavaSet;

import java.util.ArrayList;
import java.util.List;

/**
 * 1.add()  添加元素，第一个，索引下标为0；
 * 2.Object get(index) 获取指定索引下标对应的元素
 * 3.void add(int index,Object ele)  在指定索引下标的位置插入元素
 * 4.boolean addAll(int index,Collection eles)  在指定索引下标的位置插入集合
 * 5.int indexOf(Object obj)   获取指定元素在集合中第一次出现的索引下标
 * 6.int lastIndexOf(Object obj)   获取指定元素在集合中最后一次出现的索引下标
 * 7.Object remove(int index)   根据指定索引下标，移除数据
 * 8.Object set(int index,Object ele)  根据指定的索引下标修改元素
 * 9.List subList(int fromIndex,int toIndex)  根据索引下标的起始位置截取一段元素形成一个新的集合，截取时，只包含开始的元素，不包含结束时的元素[n,m)
 */
public class TestListArraryList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("d");//第一个，索引下标为0；
        list.add("a");
        list.add("c");
        list.add("s");
        list.add("a");
        System.out.println(list);
        System.out.println(list.get(2));//获取指定索引下标对应的元素

        list.add(1, "kkk");//在指定索引下标的位置插入元素
        System.out.println(list);

        System.out.println(list.indexOf("a"));//获取指定元素在集合中第一次出现的索引下标
        System.out.println(list.lastIndexOf("a"));//获取指定元素在集合中最后一次出现的索引下标

        list.remove(1);//根据指定索引下标，移除数据
        System.out.println(list);

        list.set(1, "pp");
        System.out.println(list);//根据指定的索引下标修改元素

//根据索引下标的起始位置截取一段元素形成一个新的集合，截取时，只包含开始的元素，不包含结束时的元素[n,m)
        List<String> sublist = list.subList(1, 3);
        System.out.println(sublist);
    }
}
