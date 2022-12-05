import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.annotation.Keyword as Keyword
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
import org.openqa.selenium.ElementNotVisibleException as ElementNotVisibleException
import org.openqa.selenium.Keys as Keys
import org.testng.Assert as Keys

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.Url)

WebUI.getUrl()

WebUI.verifyElementVisible(findTestObject('login/Swag_logo'))

WebUI.verifyElementVisible(findTestObject('login/user_bot_logo'))

WebUI.verifyCheckpoint(findCheckpoint('Checkpoints/Checkpoint'), false)

WebUI.setText(findTestObject('login/input_user-name'), username)

WebUI.setText(findTestObject('login/input_user_password'), password)

WebUI.click(findTestObject('login/login-button'))

WebUI.verifyTextPresent('PRODUCTS', false)

WebUI.closeBrowser()



