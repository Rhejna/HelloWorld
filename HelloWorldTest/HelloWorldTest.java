import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.assertEquals;

public class HelloWorldTest {
	
	@BeforeClass
    public static void beforeClass() {
        System.out.println("Before Class");
    }
 
    @Before
    public void before() {
        System.out.println("Before Test Case");
    }

    @Test
    public void testMain() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        HelloWorld.main(new String[0]);
        assertEquals("Hello, World!", outContent.toString());
    }
	
	@After
    public void after() {
        System.out.println("After Test Case");
    }
 
    @AfterClass
    public static void afterClass() {
        System.out.println("After Class");
    }
}