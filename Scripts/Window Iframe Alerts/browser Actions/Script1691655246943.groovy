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

WebUI.openBrowser('file:///Users/sardiraymond/Downloads/sampleSite/learnks1-home.html')

WebUI.click(findTestObject('LearnKS/Page_Home/a_LOGIN'))

//'login page'
WebUI.switchToWindowIndex(1)

WebUI.setText(findTestObject('LearnKS/Page_Log in/input_Log in_userName'), 'saya@fake.com')
WebUI.click(findTestObject('LearnKS/Page_Log in/a_Forgot your password'))
WebUI.switchToWindowIndex(2)

//'Forgot_Password_page'
WebUI.setText(findTestObject('LearnKS/Page_Forgot Password/input_Forgotten Password_emailAddress'), 'saya@fake.com')

WebUI.closeWindowIndex(2)

WebUI.closeBrowser()

