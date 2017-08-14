import static com.heliumhq.API.*;

public class Bing{
	public static void main(String[] args) {
		startChrome();
		goTo("bing.com");
		write("cloudsystems.sa");
		press(ENTER);
		click("Cloud Systems");
        click("Contact Us");
		if (getDriver().getTitle().contains("Cloud Systems"))
			System.out.println("Test passed!");
		else
			System.out.println("Test failed :(");
		killBrowser();
	}
}