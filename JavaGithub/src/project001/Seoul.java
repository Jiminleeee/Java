package project001;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Seoul {

	public static final String WEB_DRIVER_ID = "webdriver.chrome.driver";
	public static final String WEB_DRIVER_PATH = "C:\\NewChrome\\chromedriver.exe";

	public static void main(String[] args) throws IOException {
		try {
			System.setProperty(WEB_DRIVER_ID, WEB_DRIVER_PATH);
		} catch (Exception e) {
			e.printStackTrace();
		}

		ChromeOptions options = new ChromeOptions();
		WebDriver driver = new ChromeDriver(options);
		JavascriptExecutor js = (JavascriptExecutor) driver;

		String Title;
		Calendar cal = Calendar.getInstance();
		Date today = new Date();
		SimpleDateFormat date = new SimpleDateFormat("yyyyMMdd");

		for (int t = 0; t < 100; t++) {
			cal.add(Calendar.DATE, -1);

			String date1 = date.format(cal.getTime());

			driver.get(
					"https://search.naver.com/search.naver?where=view&query=%EC%84%9C%EC%9A%B8%20%EB%B9%B5%EC%A7%91&sm=tab_opt&nso=so%3Ar%2Cp%3A"
							+ "from" + date1 + "to" + date1 + "%2Ca%3Aall&mode=normal&main_q=&st_coll=&topic_r_cat=");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			ArrayList<String> data1 = new ArrayList<>();

			// 제목 가져오기

			for (int p = 1; p < 5; p++) {
				js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

			for (int i = 1; i <= 125; i++) {

				try {
					Title = driver.findElement(By.xpath(
							"/html/body/div[3]/div[2]/div/div[1]/section/div/div[2]/panel-list/div[1]/more-contents/div/ul/li["
									+ i + "]/div[1]/div/a"))
							.getText();
					System.out.println(Title);
					data1.add(Title);
				} catch (Exception e) {

				}

			}

			System.out.println("-----------------------");
			for (int j = 0; j < data1.size(); j++) {

				System.out.print(data1.get(j));
				// System.out.println(",");
			}

			FileWriter fw = new FileWriter("C:\\Users\\501-21\\Desktop\\kopo32\\프로젝트\\빵집\\서울.csv", true);
			for (int i = 0; i < data1.size(); i++) {
				String str = String.join(",", data1.get(i)) + "\n";
				fw.write(str);
			}
			fw.close();
		}

	}
}
