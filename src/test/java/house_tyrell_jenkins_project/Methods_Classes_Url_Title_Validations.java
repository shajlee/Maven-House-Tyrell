package house_tyrell_jenkins_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Methods_Classes_Url_Title_Validations {


	
	public static void main(String[] args) {
		Methods_Classes_Url_Title_Validations.OlenaTyrell();
		Methods_Classes_Url_Title_Validations.MaceTyrell();
		
		Methods_Classes_Url_Title_Validations HouseTyrell = new Methods_Classes_Url_Title_Validations();
		HouseTyrell.LorasTyrell();
		HouseTyrell.MargaeryTyrell();
		
		Methods_Classes_Url_Title_Validations HouseTyrell1 = new Methods_Classes_Url_Title_Validations();
		HouseTyrell1.GarlanTyrell();
		
	
		
			
	}
	public static void OlenaTyrell() {
		System.out.println("Queen of Thorns");
	}
	public static void MaceTyrell() {
		System.out.println("Lord Oaf");
	}
	public static void LorasTyrell() {
		System.out.println("Knight of Flowers");
	}
	public static void MargaeryTyrell() {
		System.out.println("Little Rose");
	}
	public static void GarlanTyrell() {
		System.out.println("Garlan The Gallant");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://awoiaf.westeros.org/index.php/House_Tyrell");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		String actualCurrentUrl = "https://awoiaf.westeros.org/index.php/House_Tyrell";
		String expectedCurrentUrl = driver.getCurrentUrl();
		
		String actualTitle = "House Tyrell - A Wiki of Ice and Fire";
		String expectedTitle = driver.getTitle();
		
		if(actualTitle.equals(expectedTitle) && actualCurrentUrl.equals(expectedCurrentUrl)) {
			System.out.println("URL is valid & working");
		}else {
			System.out.println("Url is not valid");
		}
		
	}

		
		
			
		
		
		
		
		
		

	



		
		
		
	
		

	}


