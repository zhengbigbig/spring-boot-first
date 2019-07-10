package optional;


import org.junit.Test;

import java.io.File;
import java.util.Optional;

public class FileReaderTest{
    String path1 = "res/1.txt";  // 无内容
    String path2 = "res/2.txt";  // 无内容
    String path3 = "res/3.txt";  // 有内容
    String path4 = "res/4.txt";  // 有内容

    // 两个不含内容文件，输出No Content
    @Test
    public void shouldReadNothing() {
        System.out.println("Test1：");
        FileReader fileReader = new FileReader(path1, path2);
        Optional<File> test = fileReader.readFile();
        if(test.isPresent()){
            System.out.println("有无空的文件");
        }else {
            System.out.println("都为空，验证正确！");
        }
    }
    // 第一个为空，第二个不为空
    @Test
    public void shouldReadNothing2() {
        System.out.println("Test2：");
        FileReader fileReader = new FileReader(path1, path3);
        Optional<File> test = fileReader.readFile();
        if(test.isPresent()){
            System.out.println("输出应该为第二个文件,验证成功！");
        }else {
            System.out.println("输出错误");
        }
    }
    // 第一个不为空
    @Test
    public void shouldReadNothing3() {
        System.out.println("Test3：");
        FileReader fileReader = new FileReader(path3, path2);
        Optional<File> test = fileReader.readFile();
        if(test.isPresent()){
            System.out.println("第一个不为空");
        }else {
            System.out.println("输出错误");
        }
    }


}
