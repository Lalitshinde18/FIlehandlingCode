package FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class fileWriters {
    public static void main(String[] args) {

        try {
            FileWriter f = new FileWriter("C:\\Users\\lalit\\OneDrive\\Desktop\\LC.txt");
            try {
                    f.write("java programming is the best language");
            }
            finally {
                f.close();
            }
            System.out.println("Successfully data wrote in file");
        }
        catch (IOException i){
            System.out.println(i);

        }
    }
}
