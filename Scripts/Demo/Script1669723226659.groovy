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

Mobile.startApplication('bs://c700ce60cf13ae8ed97705a55b8e022f13c5827c', true)

Mobile.tap(findTestObject('Object Repository/Mobile testing/android.widget.LinearLayout'), 0)

Mobile.setText(findTestObject('Object Repository/Mobile testing/android.widget.EditText - Search'), 'Automation', 0)

Mobile.hideKeyboard()

Mobile.scrollToText('Automation engineering')

Mobile.getText(findTestObject('Object Repository/Mobile testing/android.widget.TextView - Automation engineering'), 0)

Mobile.tap(findTestObject('Object Repository/Mobile testing/android.widget.LinearLayout (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Mobile testing/android.widget.TextView - Shepseskaf'), 0)

Mobile.pressBack()

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject('Object Repository/Mobile testing/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/Mobile testing/android.widget.TextView - Share link'), 0)

Mobile.tap(findTestObject('Object Repository/Mobile testing/android.widget.ImageView (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Mobile testing/android.widget.TextView - Prime Minister of Malaysia'), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.closeApplication()

