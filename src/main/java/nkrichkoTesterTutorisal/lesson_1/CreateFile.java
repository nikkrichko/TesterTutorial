package nkrichkoTesterTutorisal.lesson_1;

import java.io.File;
import java.io.IOException;

public class CreateFile {

    private String name;
    private File file;

    public CreateFile( String name) {
        this.name = name;
        file = new File(this.name);
    }






    public void createFile() throws IOException {

        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void  deleteFile(){
        file.delete();
    }




}
