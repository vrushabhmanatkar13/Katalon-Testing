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
import com.kms.katalon.core.testcase.Variable as Variable
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import org.testng.Assert as Assert
import org.testng.Assert as Keys

itemname = WebUI.getText(findTestObject('Home page/Backpack/div_Sauce Labs Backpack'))

WebUI.verifyElementVisible(findTestObject('Home page/Backpack/div_decription_Backpack'), FailureHandling.CONTINUE_ON_FAILURE)

prise = WebUI.getText(findTestObject('Home page/Backpack/div_29.99'))

WebUI.verifyElementClickable(findTestObject('Home page/Backpack/button_Add to cart_Backpack'))

WebUI.click(findTestObject('Home page/Backpack/button_Add to cart_Backpack'))

String actual = WebUI.getText(findTestObject('Home page/Backpack/button_Remove_Backpack'))

Assert.assertEquals(actual, remove)

WebUI.verifyElementPresent(findTestObject('Home page/cart'), 0)

int Qty = WebUI.getText(findTestObject('Home page/cart_qty'))
println(Qty)

WebUI.click(findTestObject('Home page/cart'))

item_2 = WebUI.getText(findTestObject('Your Cart/Backpack/div_Sauce Labs Backpack'), FailureHandling.CONTINUE_ON_FAILURE)

Assert.assertEquals(itemname, item_2)

WebUI.verifyElementPresent(findTestObject('Your Cart/Backpack/div_decription_backpack'), 0)

prise_2 = WebUI.getText(findTestObject('Your Cart/Backpack/div_29.99'))

Assert.assertEquals(prise, prise_2)

int Qty_2 = WebUI.getText(findTestObject('Your Cart/qty'))

//Assert.assertEquals(Qty, Qty_2)

WebUI.verifyElementClickable(findTestObject('Your Cart/button_Remove'))

WebUI.click(findTestObject('Your Cart/button_Remove'))

WebUI.verifyElementNotPresent(findTestObject('Home page/cart_qty'), 0)

WebUI.verifyElementNotPresent(findTestObject('Your Cart/Backpack/div_Sauce Labs Backpack'), 0)

WebUI.verifyElementClickable(findTestObject('Your Cart/button_Continue Shopping'))

WebUI.click(findTestObject('Your Cart/button_Continue Shopping'))

