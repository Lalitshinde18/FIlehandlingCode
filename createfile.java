package FileHandling;

import java.io.*;

public class createfile {
    public static void main(String[] args) {

        File f = new File("C:\\Users\\lalit\\OneDrive\\Desktop\\LC.txt");
        try{
            if(f.createNewFile()){

                System.out.println("file successfully created");
            }else {
                System.out.println("file Already Exist");
            }

        } catch (Exception e){
            System.out.println("Exception handled..!");
        }


    }
}
