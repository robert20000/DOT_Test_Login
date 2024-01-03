import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebDriver as WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.chrome.ChromeOptions as ChromeOptions
import org.openqa.selenium.chrome.ChromeDriver as ChromeDriver

WebUI.openBrowser('')

Map<String, Object> chromePrefs = new HashMap<String, Object>()

chromePrefs.put('profile.default_content_setting_values.notifications', 2)

System.setProperty('webdriver.chrome.driver', DriverFactory.getChromeDriverPath())

ChromeOptions options = new ChromeOptions()

options.setExperimentalOption('prefs', chromePrefs)

WebDriver driver = new ChromeDriver(options)

DriverFactory.changeWebDriver(driver)

WebUI.navigateToUrl('https://www.facebook.com/')

WebUI.setText(findTestObject('Page_Facebook  log in or sign up/input_Facebook helps you connect and share with the people in your life_email'), 
    'rionelmessi71@yahoo.com')

WebUI.setText(findTestObject('Page_Facebook  log in or sign up/input_Facebook helps you connect and share with the people in your life_pass'), 
    'ronaldo2502')

WebUI.click(findTestObject('Page_Facebook  log in or sign up/button_Log in'))

