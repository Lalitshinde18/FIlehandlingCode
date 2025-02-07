package FileHandling;

import java.io.*;

public class renamefile {
    public static void main(String[] args) {
        File f= new File("C:\\Users\\lalit\\OneDrive\\Desktop\\LC.txt");
        File r= new File("C:\\Users\\lalit\\OneDrive\\Desktop\\LalitFile.txt");

    if(f.exists()){
        System.out.println(f.renameTo(r));
    }else {
        System.out.println("File does't exist");
    }


    }

}
