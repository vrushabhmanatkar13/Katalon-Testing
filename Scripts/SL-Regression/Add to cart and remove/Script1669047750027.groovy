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
import org.testng.Assert as Keys

WebUI.verifyElementVisible(findTestObject('Home page/div_Sauce Labs Backpack'))

String itemname = WebUI.getText(findTestObject('Home page/div_Sauce Labs Backpack'))

WebUI.getText(findTestObject('Home page/div_Sauce Labs_description'))

WebUI.getText(findTestObject('Home page/div_29.99'))

WebUI.verifyElementPresent(findTestObject('Home page/button_Add to cart'), 0)

String addtocart = WebUI.getText(findTestObject('Home page/button_Add to cart'))


addtocart.equals('Add to cart')

WebUI.click(findTestObject('Home page/button_Add to cart'))

WebUI.verifyElementVisible(findTestObject('Home page/cart'))

String count = WebUI.getText(findTestObject('Home page/cart_item'))

int numbers = Integer.valueOf(count)

numbers.equals(1)

String remove = WebUI.getText(findTestObject('Home page/button_Remove'))

remove.equalsIgnoreCase('Remove')

WebUI.click(findTestObject('Home page/cart'))

WebUI.verifyElementPresent(findTestObject('Your Cart/Your_Cart'), 0)

WebUI.getText(findTestObject('Your Cart/Sauce Labs Backpack')).equals(itemname)

WebUI.getText(findTestObject('Your Cart/Qty')).equals(numbers)

WebUI.verifyElementVisible(findTestObject('Your Cart/29.99'))

WebUI.verifyElementVisible(findTestObject('Your Cart/button_Remove'))

WebUI.click(findTestObject('Your Cart/button_Remove'))

WebUI.verifyElementNotPresent(findTestObject('Home page/cart_item'), 0)

