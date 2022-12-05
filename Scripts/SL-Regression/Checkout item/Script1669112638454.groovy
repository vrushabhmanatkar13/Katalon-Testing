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
import internal.GlobalVariable

import org.testng.Assert
import org.openqa.selenium.Keys as Keys

item_1 = WebUI.getText(findTestObject('Home page/Light/div_Sauce Labs Bike Light'), FailureHandling.CONTINUE_ON_FAILURE)

prise_1 = WebUI.getText(findTestObject('Home page/Light/div_9.99'))

WebUI.click(findTestObject('Home page/Light/button_Add to cart_light'))

WebUI.verifyElementVisible(findTestObject('Home page/Light/button_Remove_light'))

WebUI.click(findTestObject('Home page/cart'))

int qty = WebUI.getText(findTestObject('Your Cart/qty'))

WebUI.verifyGreaterThan(qty, 0)

WebUI.click(findTestObject('Your Cart/button_Checkout'))

WebUI.getText(findTestObject('Checkout/span_Checkout Your Information'))

WebUI.setText(findTestObject('Checkout/input_firstName'), firstname)

WebUI.setText(findTestObject('Checkout/input_lastName'), lastname)

WebUI.setText(findTestObject('Checkout/input_postalCode'), postalcode)

WebUI.verifyElementPresent(findTestObject('Checkout/button_Cancel'), 0)

WebUI.verifyElementPresent(findTestObject('Checkout/input_continue'), 0)

WebUI.click(findTestObject('Checkout/input_continue'))

WebUI.getText(findTestObject('Overview/Checkout Overview'))

item_2 = WebUI.getText(findTestObject('Overview/Sauce Labs Bike Light'))
 Assert.assertEquals(item_2, item_1)



prise_2=WebUI.getText(findTestObject('Overview/div_9.99'))
Assert.assertEquals(prise_2, prise_1)

qty_2=WebUI.getText(findTestObject('Overview/Qty'))

//Assert.assertEquals(qty_2, qty)

WebUI.verifyElementPresent(findTestObject('Overview/Payment_info'), 0)

WebUI.verifyElementPresent(findTestObject('Overview/Shopping_info'), 0)

WebUI.getText(findTestObject('Overview/Item total 9.99')).equals(prise_2)

WebUI.verifyElementPresent(findTestObject('Overview/button_Finish'), 0)

WebUI.click(findTestObject('Overview/button_Finish'))

