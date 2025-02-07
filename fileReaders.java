package FileHandling;

import java.io.FileReader;
import java.io.IOException;

// Read data from a file
public class fileReaders {
    public static void main(String[] args) {
        try
        {
            FileReader r = new FileReader("C:\\Users\\lalit\\OneDrive\\Desktop\\LC.txt");
            try {

                int i ;
                while ((i=r.read())!=-1){
                    System.out.print((char) i);
                }

            }
            finally {
                r.close();
                System.out.println("File Close");
            }
        }
        catch (IOException e)
        {
            System.out.println("Exception Handle");
        }
    }
}
