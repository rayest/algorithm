package mobi.rayson.algorithum.algorithmsbook.others.recursion;

import java.io.File;

/**
 * @author lirui
 * 打印文件目录及文件名
 */
public class FileList {
    public static void main(String[] args) {
        File file = new File("./");
        listDirectoryAndFileNames(file);
    }

    private static void listDirectoryAndFileNames(File file) {
        File[] files = file.listFiles();
        for (File value : files) {
            if (value.isDirectory()) {
                System.out.println("目录：" + value.getName() + "/");
                listDirectoryAndFileNames(value);
            } else {
                System.out.println("文件：" + value.getName());
            }
        }
    }
}
