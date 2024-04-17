package JavaSet;

import java.util.*;

/**
 * hashSet中的方法：
 * 1.add()添加元素
 * 2.remove()移除元素
 * 3.contains()判断是否包含元素
 * 4.clear()清空元素
 * 5.Iterator和for……each迭代器遍历集合
 * 6.size()获取集合的元素个数
 */
public class TestHashSet  {
    public static void main(String[] args) {
        Set set = new HashSet();
        set.add("a");
        set.add("b");
        set.add("c");
        set.add("d");
        set.add("d");//不可重复，重复的值无法存入
        set.add(null);//set集合是无序的
//        使用迭代器遍历集合
        Iterator it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
//         使用for……each迭代集合
        for (Object o : set) {//把set的每个元素取出赋值给o，直到选好set的所有值
            System.out.print(o);
        }
        System.out.println();
//        获取集合的元素个数
        System.out.println(set.size());
    }
}
