package optional;

import java.io.*;
import java.util.Optional;

public class FileReader {
    private String src1;
    private String src2;

    public FileReader(String src1, String src2) {
        this.src1 = src1;
        this.src2 = src2;
    }


    public Optional<File> readFile() {
        try {
            File file = new File(this.src1);
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream(file), "UTF-8")
            );
            if(!reader.readLine().equals("")){
                System.out.println("读取文件1成功！");
                return Optional.of(file);
            }
        } catch (Exception e) {
            System.out.println("IOException occurs when reading from src1.");
        }
        try{
            File file = new File(this.src2);
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream(file), "UTF-8")
            );
            if(!reader.readLine().equals("")){
                System.out.println("读取文件2成功！");
                return Optional.of(file);
            }
        }catch (Exception e){
            System.out.println("IOException occurs when reading from src2.");
        }
        return Optional.empty();
    }

}
