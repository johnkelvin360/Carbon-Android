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

Mobile.startApplication('C:\\Users\\user\\Desktop\\carbon\\carbon_ng-v6.7.1_signed.apk', true)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - Skip (3)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - Sign In (6)'), 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - Phone number (3)'), '08990001100', 0)

Mobile.tap(findTestObject('Object Repository/android.widget.EditText - Enter PIN (6)'), 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - Enter PIN (7)'), '1234', 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - Sign in (7)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Fund Wallet'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Add money with a debit card (2)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - Continue (1)'), 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - 0.00 (3)'), '1000', 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - Proceed (2)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.RadioButton (4)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Confirm payment (3)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Securely pay 1,010 (2)'), 0)

Mobile.closeApplication()

