import static org.junit.Assert.*;
import org.junit.*;
import java.util.List;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class MarkdownParseTest {

    String path = "./";
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void testGetLinks() throws IOException {
        Path fileName = Path.of(path+"break-test.md");
        String content = Files.readString(fileName);
        assertEquals(List.of("https://something.com", "some-thing.html"), MarkdownParse.getLinks(content));
    }


    @Test 
    public void testImgParcer() throws IOException {
        Path fileName = Path.of(path+"test-img.md");
        String content = Files.readString(fileName);

        assertEquals(List.of(), MarkdownParse.getLinks(content));
    }

    @Test 
    public void testBreak() throws IOException {
        Path fileName = Path.of(path+"test-break.md");
        String content = Files.readString(fileName);

        assertEquals(List.of(), MarkdownParse.getLinks(content));
    }
}