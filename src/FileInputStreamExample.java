import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamExample {
    public static void main(String[] args) {
        FileInputStream file = null;
        try {
            File file1 = new File("abc.txt");
            file = new FileInputStream(file1);
            int content = 0;
            while ((content = file.read())!=-1){
                System.out.println((char) content);
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            if (file !=null){
                try {
                    file.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
