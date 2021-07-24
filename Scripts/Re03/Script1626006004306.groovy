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

WebUI.navigateToUrl('http://eval.sbs-app.com:3001/')

WebUI.click(findTestObject('Object Repository/Re03/Page_(DPA)/a_'))

WebUI.click(findTestObject('Object Repository/Re03/Page_(DPA)/input__form-control ng-untouched ng-pristin_178ccb'))

WebUI.setText(findTestObject('Object Repository/Re03/Page_(DPA)/input__form-control ng-untouched ng-valid ng-dirty'), 'Luechai04@gmail.com')

WebUI.click(findTestObject('Object Repository/Re03/Page_(DPA)/div_'))

WebUI.setText(findTestObject('Object Repository/Re03/Page_(DPA)/input__PersonID'), '3120101732710')

WebUI.click(findTestObject('Object Repository/Re03/Page_(DPA)/div__1'))

WebUI.setText(findTestObject('Object Repository/Re03/Page_(DPA)/input__Telephone'), '0898798787')

WebUI.click(findTestObject('Object Repository/Re03/Page_(DPA)/div__1_2'))

WebUI.click(findTestObject('Object Repository/Re03/Page_(DPA)/input__form-control ng-untouched ng-pristin_cc1b82'))

WebUI.setText(findTestObject('Object Repository/Re03/Page_(DPA)/input__form-control ng-untouched ng-pristin_cc1b82'), 'สำนักงานศึกษาธิการจังหวัดปทุมธานี')

WebUI.click(findTestObject('Object Repository/Re03/Page_(DPA)/div__1_2_3'))

WebUI.click(findTestObject('Object Repository/Re03/Page_(DPA)/div__1_2_3_4'))

WebUI.click(findTestObject('Object Repository/Re03/Page_(DPA)/div_'))

WebUI.click(findTestObject('Object Repository/Re03/Page_(DPA)/a__1'))

WebUI.closeBrowser()

