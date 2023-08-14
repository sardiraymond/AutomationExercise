package autoamtionexercise

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class User {

	/**
	 * login to automationexercise
	 * @param user email adress for login
	 * * @param pwd password for login
	 */
	@Keyword
	def Login(String emailAddress, String password) {
		if (visibility(signout)) {
			//then sign out
			// go to home page
		}
		WebUI.navigateToUrl('https://automationexercise.com/')
		WebUI.click(findTestObject('Object Repository/AutomationExercise_Web/Navigation Bar/a_Signup  Login'))
		WebUI.setText(findTestObject('AutomationExercise_Web/Section_Nav_SignUp_Login/input_Login to your account_email'), emailAddress)
		WebUI.setEncryptedText(findTestObject('AutomationExercise_Web/Section_Nav_SignUp_Login/input_Login to your account_password'), password)
		WebUI.click(findTestObject('Object Repository/AutomationExercise_Web/Section_Nav_SignUp_Login/button_Login'))
	}
	
	/**
	 * logout automationexerccise
	 */

	@Keyword
	def Logout() {
		WebUI.click(findTestObject('AutomationExercise_Web/Navigation Bar/a_Logout'))
	}
}
