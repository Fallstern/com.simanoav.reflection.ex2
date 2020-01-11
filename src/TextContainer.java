import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

@SaveTo (path="file.txt")
public class TextContainer {
    private String str = "Something";

    @Saver
    public void save(String path) throws IOException {
        FileWriter fileWriter = new FileWriter(path);
        fileWriter.write(str);
        fileWriter.close();
    }
}
