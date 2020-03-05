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
        for (int i = 0; i < files.length; i++) {
            if (files[i].isDirectory()) {
                System.out.println("目录：" + files[i].getName() + "/");
                listDirectoryAndFileNames(files[i]);
            } else {
                System.out.println("文件：" + files[i].getName());
            }
        }
    }
}
