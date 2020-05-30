import java.io.*;


import java.io.File;
import java.io.IOException;
 
 
public class DeleteExcelfilefromfolder {
	private static void listFiles(String path)
    {
        File folder = new File(path);
 
        File[] files = folder.listFiles();
        String extension = ".csv";
        for (File file : files)
        {
            if (file.isFile())
            {
            	 if (file.getName().endsWith(extension) && !file.delete()) {}
            	// System.out.println(file.getName());
            }
            else if (file.isDirectory())
            {
                listFiles(file.getAbsolutePath());
                if (file.getName().endsWith(extension) && !file.delete()) {}
               // System.out.println(file.getName());
            }
            }}
    
 
    public static void main(String[] args)
    {
        listFiles("D:\\Antony\\QA\\2019.12-1");
       
    }
}