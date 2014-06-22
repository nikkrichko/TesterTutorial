package nkrichkoTesterTutorisal;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        Path path = Paths.get("d:", "parent", "child");
        System.out.println( "Hello World!" );
        try {

            Files.createDirectories(path);
            Files.createTempDirectory(path, "hello");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
