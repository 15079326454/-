package JavaIO;

import java.io.File;

public class TestFile01 {
    public static void main(String[] args) {
      /*  //这个时候对象f文件122.txt文件
        File f = new File("C:\\Users\\admin\\Desktop\\txt类型的文件\\122.txt");
        File f2 = new File("C:\\Users\\admin\\Desktop\\txt类型的文件");
        System.out.println(f.getName());//获取文件名
        System.out.println(f2.getName());//获取当前文件夹名称
        File f3 = new File("src\\JavaIO\\TestFile01.java");//使用相对路径来创建file对象

        System.out.println(f3.getPath());//获取文件或者文件夹的路径，创建时的路径
        System.out.println(f3.getAbsolutePath());//获取当前文件的绝对路径

        System.out.println(f3);
        System.out.println(f3.getAbsoluteFile());//返回一个用当前的文件的绝对路径构建的file对象
        System.out.println(f3.getParent());//返回当前文件或者文件夹的父级路径

        //给文件或文件夹重命名
        f.renameTo(new File("C:\\Users\\admin\\Desktop\\txt类型的文件\\002.txt"));

        File f4 = new File("C:\\Users\\admin\\Desktop\\txt类型的文件\\TestFile01.java");
        System.out.println(f4.exists());//判断文件或者文件夹是否存在

        File f5 = new File("C:\\Users\\admin\\Desktop\\txt类型的文件\\002.txt");
        System.out.println(f5.canRead());//判断文件是否可读
        System.out.println(f5.canWrite());//判断文件是否可写
*/
 /*       File f6 = new File("C:\\Users\\admin\\Desktop\\txt类型的文件\\002.txt");
        System.out.println(f6.isFile());//判断当前的file对象是不是文件
        System.out.println(f6.isDirectory());//判断当前的file对象是不是文件夹或目录

        System.out.println(f6.lastModified());//获取文件的最后修改时间，返回的是一个毫秒数
        System.out.println(f6.length());//返回文件的长度，单位是字节数*/

//        File f7 = new File("C:\\Users\\admin\\Desktop\\txt类型的文件\\cc");
//        f7.mkdir();//创建单层目录，如果使用这一方法创建多层目录，就要一层一层执行mkdir（）方法
//        f8.mkdirs();//这个方法是直接用来创建多层目录
/*        File f8 = new File("C:\\Users\\admin\\Desktop\\txt类型的文件");
        String[] fl = f8.list();//返回的是当前文件夹的子集的名称，包括目录和文件
        for (String s : fl) {
            System.out.println(s);
        }
        File[] fs =f8.listFiles();//返回的是当前文件夹的子集的file对象，包括目录和文件
        for (File f: fs){
            System.out.println(f);
        }*/




    }
}
