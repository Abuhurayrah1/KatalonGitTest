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

WebUI.setText(findTestObject('Object Repository/1st Month/day 10/10th day test5/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_username'), 
    'badmin')

WebUI.setEncryptedText(findTestObject('Object Repository/1st Month/day 10/10th day test5/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_password'), 
    'CSt51UwWECc=')

WebUI.click(findTestObject('Object Repository/1st Month/day 10/10th day test5/Page_iHealthCure  Hospital Management and I_3c5153/button_Sign In'))

WebUI.click(findTestObject('Object Repository/1st Month/day 10/10th day test5/Page_/a_Organization Setup'))

WebUI.click(findTestObject('Object Repository/1st Month/day 10/10th day test5/Page_/span_Dept Timing'))

WebUI.click(findTestObject('Object Repository/1st Month/day 10/10th day test5/Page_Dept Timing/button_Add Department Timing'))

WebUI.click(findTestObject('Object Repository/1st Month/day 10/10th day test5/Page_Dept Timing/div_Select Department'))

WebUI.click(findTestObject('Object Repository/1st Month/day 10/10th day test5/Page_Dept Timing/span_Blood Bank'))

WebUI.selectOptionByValue(findTestObject('Object Repository/1st Month/day 10/10th day test5/Page_Dept Timing/select_Select DepartmentAdult Echocardiogra_18bfaf'), 
    '7a7ef1e2-1237-4b1b-a839-799422ddcdaf', true)

WebUI.click(findTestObject('Object Repository/1st Month/day 10/10th day test5/Page_Dept Timing/div_Monday'))

WebUI.click(findTestObject('Object Repository/1st Month/day 10/10th day test5/Page_Dept Timing/button_Select All'))

WebUI.click(findTestObject('Object Repository/1st Month/day 10/10th day test5/Page_Dept Timing/div_Monday, Tuesday, Wednesday, Thursday, F_89917b'))

WebUI.click(findTestObject('Object Repository/1st Month/day 10/10th day test5/Page_Dept Timing/button_Submit'))

WebUI.closeBrowser()

