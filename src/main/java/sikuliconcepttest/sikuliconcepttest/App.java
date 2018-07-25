package sikuliconcepttest.sikuliconcepttest;

import java.io.File;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	File file = new File("D:\\selnium webdriver\\driver\\chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath() );
         WebDriver driver = new ChromeDriver();ō
        System.out.println( "Hello World!" );
    }
}
