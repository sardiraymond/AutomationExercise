import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
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
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

//OPEN BROWSER AND REDIRECT TO URL
WebUI.openBrowser(null)

WebUI.navigateToUrl('https://www.automationexercise.com')

//OPEN SIGUNP OR LOGIN PAGE
WebUI.click(findTestObject('Object Repository/AutomationExercise_Web/Navigation Bar/a_Signup  Login'))

WebUI.verifyElementVisible(findTestObject('Object Repository/AutomationExercise_Web/Section_Nav_SignUp_Login/h2_Login to your account'))

WebUI.click(findTestObject('AutomationExercise_Web/Section_Nav_SignUp_Login/input_New User Signup_name'))

inputName = WebUI.sendKeys(findTestObject('AutomationExercise_Web/Section_Nav_SignUp_Login/input_New User Signup_name'), Keys.chord('sayamau', Keys.TAB))
println(inputName)
