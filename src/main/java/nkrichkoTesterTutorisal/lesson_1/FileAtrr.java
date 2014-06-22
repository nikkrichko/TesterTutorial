package nkrichkoTesterTutorisal.lesson_1;

import java.nio.file.attribute.FileAttribute;

public class FileAtrr implements FileAttribute {
    String filename = "sss";

    @Override
    public String name() {
        return filename;
    }

    @Override
    public Object value() {
        return "Hello1";
    }
}
