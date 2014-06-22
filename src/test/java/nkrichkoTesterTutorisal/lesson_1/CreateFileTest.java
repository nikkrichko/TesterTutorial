package nkrichkoTesterTutorisal.lesson_1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class CreateFileTest {
    CreateFile cf;

    @BeforeMethod
    public void setUp() throws IOException {
        cf = new CreateFile("newfile");
        System.out.println("SETUP");
    }

    @Test
    public void testCreateFile() throws Exception {

        cf.createFile();
        System.out.println("file was created");
    }

    @Test
    public void test(){
        try {
            cf.createFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("file was created second time");
    }

    @AfterMethod
    public void tearDown(){
        cf.deleteFile();
        System.out.println("TEARDOWN");
    }
}
