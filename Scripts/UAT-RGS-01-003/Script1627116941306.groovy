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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://eval.sbs-app.com:3005/auth/login')

WebUI.click(findTestObject('Object Repository/UAT-RGS-01-003/Page_(DPA)/div_'))

WebUI.click(findTestObject('Object Repository/UAT-RGS-01-003/Page_(DPA)/a_'))

WebUI.setText(findTestObject('Object Repository/UAT-RGS-01-003/Page_(DPA)/input_Forgotten Password_email'), 'taemanster@gmail.com')

WebUI.click(findTestObject('Object Repository/UAT-RGS-01-003/Page_(DPA)/button_Submit'))

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl('http://eval.sbs-app.com:3007/verify-email?token=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1dWlkIjoiYmIyYTM5YzYtYmE5My00ZThkLWJkNzQtY2MzYWUxMjRjOWM5IiwiaWF0IjoxNjI3MTE5MTcwLCJleHAiOjE2Mjc3MjM5NzB9.cIrp7fNGyaLCJf2EBp8Lh8YbYfm2TGd-Kkb2hX-KLRU&redirect=http://eval.sbs-app.com:3005')

WebUI.setEncryptedText(findTestObject('Object Repository/UAT-RGS-01-003/Page_(DPA)/input__password'), '4nvbrPglk7k=')

WebUI.setEncryptedText(findTestObject('Object Repository/UAT-RGS-01-003/Page_(DPA)/input__cPassword'), '4nvbrPglk7k=')

WebUI.click(findTestObject('Object Repository/UAT-RGS-01-003/Page_(DPA)/app-set-password_'))

WebUI.delay(2)

WebUI.closeBrowser()

