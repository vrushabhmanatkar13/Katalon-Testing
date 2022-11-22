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

WebUI.verifyElementPresent(findTestObject('Your Cart/button_Continue Shopping'), 0)

WebUI.click(findTestObject('Your Cart/button_Continue Shopping'))

WebUI.verifyTextPresent('PRODUCTS', false)

String Bike_light = WebUI.getText(findTestObject('Home page/Sauce Labs Bike Light'))

WebUI.getText(findTestObject('Home page/Bike_light decription'))

String prise1 = WebUI.getText(findTestObject('Your Cart/div_9.99'))

WebUI.click(findTestObject('Your Cart/button_Add to cart'))

WebUI.getText(findTestObject('Your Cart/button_Remove'))

WebUI.click(findTestObject('Home page/cart'))

WebUI.verifyElementPresent(findTestObject('Your Cart/button_Checkout'), 0)

WebUI.click(findTestObject('Your Cart/button_Checkout'))

WebUI.getText(findTestObject('Your Cart/Checkout Your Information'))

WebUI.setText(findTestObject('Your Cart/input_firstName'), firstname)

WebUI.setText(findTestObject('Your Cart/input_lastName'), lastname)

WebUI.setText(findTestObject('Your Cart/input_postalCode'), postalcode)

WebUI.verifyElementPresent(findTestObject('Your Cart/input_Cancel_continue'), 0)

WebUI.click(findTestObject('Your Cart/input_Cancel_continue'))

WebUI.getText(findTestObject('Overview/Checkout Overview'))

WebUI.getText(findTestObject('Overview/Sauce Labs Bike Light')).equals(Bike_light)

WebUI.getText(findTestObject('Overview/div_9.99')).equals(prise1)

WebUI.getText(findTestObject('Overview/Qty')).equals(1)

WebUI.verifyElementPresent(findTestObject('Overview/Payment_info'), 0)

WebUI.verifyElementPresent(findTestObject('Overview/Shopping_info'), 0)

WebUI.getText(findTestObject('Overview/Item total 9.99')).equals(prise1)

WebUI.verifyElementPresent(findTestObject('Overview/button_Finish'), 0)

WebUI.click(findTestObject('Overview/button_Finish'))

