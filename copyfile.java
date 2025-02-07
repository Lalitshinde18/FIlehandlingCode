package FileHandling;

import java.io.*;


public class copyfile {
    public static void main(String[] args) throws  Exception{
        FileInputStream r = new FileInputStream("C:\\Users\\lalit\\OneDrive\\Desktop\\LalitFile.txt");
        FileOutputStream w = new  FileOutputStream ("C:\\Users\\lalit\\OneDrive\\Desktop\\LalitFileOutput.txt");

        int i ;
        while ((i=r.read())!=-1){
            w.write((char)i);

        }
        System.out.println("Data Copied Successfully");




    }
}
