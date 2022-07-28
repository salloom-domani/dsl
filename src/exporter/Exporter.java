package exporter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Exporter {
    public static void exportPhpFile(String fileString) throws FileNotFoundException, IOException {
        FileOutputStream outputStream = new FileOutputStream("output/index.php");
        byte[] strToBytes = fileString.getBytes();
        outputStream.write(strToBytes);
        outputStream.close();
    }
    public static void exportHtmlFile(String fileString) throws FileNotFoundException, IOException {
        FileOutputStream outputStream = new FileOutputStream("output/index.html");
        byte[] strToBytes = fileString.getBytes();
        outputStream.write(strToBytes);
        outputStream.close();
    }
}
