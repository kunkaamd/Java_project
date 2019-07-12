

import com.Action.WriteFile;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import org.apache.commons.io.FileUtils;
import static org.apache.struts2.ServletActionContext.getServletContext;
/**
 *
 * @author LOC
 */

public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        StringBuilder sb = new StringBuilder();
        sb.append("Test String");

        File f = new File("d:\\test.zip");
        ZipOutputStream out = new ZipOutputStream(new FileOutputStream(f));
        ZipEntry e = new ZipEntry("mytext.txt");
        out.putNextEntry(e);

        byte[] data = sb.toString().getBytes();
        out.write(data, 0, data.length);
        out.closeEntry();

        out.close();
                
                
//        try {
//            new File("1/4").mkdirs();
//            FileReader reader = new FileReader("form/Test.html");
//            BufferedReader bufferedReader = new BufferedReader(reader);
//            String line;
//            FileWriter writer = new FileWriter("result/ResultsTest.html", true);
//            while ((line = bufferedReader.readLine()) != null) {
//                try {
//                    if (line.trim().equals("<!-- content -->")) {
//                        writer.write("\t\t<div>day la content cua bm</div>");
//                        writer.write("\r\n");
//                    } else {
//                        writer.write(line);
//                        writer.write("\r\n");
//                    }
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//            writer.close();
//            reader.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
;
    }
    
}
