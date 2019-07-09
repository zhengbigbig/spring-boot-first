package optional;

import java.io.File;
import java.io.IOException;
import java.util.Optional;

public class FileClassHelper{
    public static void copy(String path1, String path2) throws IOException {
        Optional<FileClass> optionalFile;
        try {
            FileClass fileIn = new FileClass(path1);
            fileIn.readToString();
            optionalFile = Optional.of(fileIn);
        }catch (IOException e) {
            System.out.println("Failed to read from path1.");
            optionalFile = Optional.empty();
        }

        try {
            FileClass fileOut = new FileClass(path2);
            fileOut.setContent(optionalFile.orElse(new FileClass()).getContent());
            fileOut.writeString();
        }catch (IOException e) {
            System.out.println("Failed to write in path2.");
        }


    }
}

