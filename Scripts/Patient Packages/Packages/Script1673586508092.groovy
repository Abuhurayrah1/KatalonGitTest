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

WebUI.navigateToUrl('http://demo.ihealthcure.com/Account/LogIn?ReturnUrl=%2f')

WebUI.setText(findTestObject('Object Repository/1st Month/day 16/16th day test1/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_username'), 
    'badmin')

WebUI.setEncryptedText(findTestObject('Object Repository/1st Month/day 16/16th day test1/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_password'), 
    'CSt51UwWECc=')

WebUI.click(findTestObject('Object Repository/1st Month/day 16/16th day test1/Page_iHealthCure  Hospital Management and I_3c5153/button_Sign In'))

WebUI.click(findTestObject('Object Repository/1st Month/day 16/16th day test1/Page_/span_Patient Packages'))

WebUI.click(findTestObject('Object Repository/1st Month/day 16/16th day test1/Page_/span_Packages'))

WebUI.click(findTestObject('Object Repository/1st Month/day 16/16th day test1/Page_Individual Packages/button_Add Package'))

WebUI.setText(findTestObject('Object Repository/1st Month/day 16/16th day test1/Page_Individual Packages/input__Name'), 'test package')

WebUI.setText(findTestObject('Object Repository/1st Month/day 16/16th day test1/Page_Individual Packages/input_Description_Description'), 
    'asd')

WebUI.setText(findTestObject('Object Repository/1st Month/day 16/16th day test1/Page_Individual Packages/input__Total'), '500')

WebUI.click(findTestObject('Object Repository/1st Month/day 16/16th day test1/Page_Individual Packages/div_All Medicines Free_col-md-10'))

WebUI.click(findTestObject('Object Repository/1st Month/day 16/16th day test1/Page_Individual Packages/span'))

WebUI.click(findTestObject('Object Repository/1st Month/day 16/16th day test1/Page_Individual Packages/label_All SubServices Free'))

WebUI.click(findTestObject('Object Repository/1st Month/day 16/16th day test1/Page_Individual Packages/label_All Consultancy Free'))

WebUI.click(findTestObject('Object Repository/1st Month/day 16/16th day test1/Page_Individual Packages/label_All MiscServices Free'))

WebUI.click(findTestObject('Object Repository/1st Month/day 16/16th day test1/Page_Individual Packages/input_All MiscServices Free_SubmitIndividua_f8c75e'))

WebUI.closeBrowser()

