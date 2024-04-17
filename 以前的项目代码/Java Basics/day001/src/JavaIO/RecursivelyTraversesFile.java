package JavaIO;

import Basis.Test;

import java.io.File;

public class RecursivelyTraversesFile {
    public static void main(String[] args) {
        File f = new File("C:\\Users\\admin\\Desktop\\txt类型的文件");
        new RecursivelyTraversesFile().test(f);
    }


    /**
     * 递归遍历文件
     *
     * @param file
     */
    public void test(File file) {
        if (file.isFile()) {
            System.out.println(file.getAbsolutePath() + "是文件");
        } else {
            System.out.println(file.getAbsolutePath() + "是文件夹");
            //如果是文件夹，这个文件夹里就可能有子文件夹或者文件
            File[] fs = file.listFiles();//获取当前文件夹下的子文件夹或者文件的file对象
            if (fs.length > 0 && fs != null) {
                for (File ff : fs) {
                    test(ff);//递归
                }
            }
        }
    }

}
