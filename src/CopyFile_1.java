import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.io.FileUtils;


public class CopyFile_1 {
	// copy a file with same content with in a new file
	public static void main(String[] args) {
	
		try {
			File f1 = new File("system.txt");
			File f2 = new File("target.txt");
			
//			InputStream in = new FileInputStream(f1);
//			OutputStream out  = new FileOutputStream(f2);
//			
//			// create  object to read the bytes 
//			byte[] buf = new byte[1024];
//			int len;
//			while ((len= in.read(buf)) > 0) {
//				out.write(buf, 0, len);
//			}
//			
//			in.close();
//			out.close();
			FileUtils.copyFile(f1, f2);
	
			System.out.println("Filed Copied");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
