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

WebUI.setText(findTestObject('Object Repository/1st Month/day 23/23rd day test7/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_username'), 
    'badmin')

WebUI.setEncryptedText(findTestObject('Object Repository/1st Month/day 23/23rd day test7/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_password'), 
    'CSt51UwWECc=')

WebUI.click(findTestObject('Object Repository/1st Month/day 23/23rd day test7/Page_iHealthCure  Hospital Management and I_3c5153/button_Sign In'))

WebUI.click(findTestObject('Object Repository/1st Month/day 23/23rd day test7/Page_/span_Accounts  Payroll'))

WebUI.click(findTestObject('Object Repository/1st Month/day 23/23rd day test7/Page_/div_Performance Execution Time_ps__rail-y'))

WebUI.click(findTestObject('Object Repository/1st Month/day 23/23rd day test7/Page_/span_Salary Stages'))

WebUI.click(findTestObject('Object Repository/1st Month/day 23/23rd day test7/Page_Salary Stages/span_Select Scale'))

WebUI.click(findTestObject('Object Repository/1st Month/day 23/23rd day test7/Page_Salary Stages/ul_Select ScaleBPS-1BPS-10BPS-11BPS-12BPS-1_e8a148'))

WebUI.click(findTestObject('Object Repository/1st Month/day 23/23rd day test7/Page_Salary Stages/span_Select Job Type'))

WebUI.click(findTestObject('Object Repository/1st Month/day 23/23rd day test7/Page_Salary Stages/ul_Select Job TypePostgraduate TraineeAddit_848438'))

WebUI.click(findTestObject('Object Repository/1st Month/day 23/23rd day test7/Page_Salary Stages/span_Select Employee'))

WebUI.click(findTestObject('Object Repository/1st Month/day 23/23rd day test7/Page_Salary Stages/ul_Select Employee 82401-2464218-9Mr. Sajid_9493c0'))

WebUI.click(findTestObject('Object Repository/1st Month/day 23/23rd day test7/Page_Salary Stages/span_Select Department'))

WebUI.click(findTestObject('Object Repository/1st Month/day 23/23rd day test7/Page_Salary Stages/ul_Select DepartmentAccountsAdmin  Security_159f4a'))

WebUI.click(findTestObject('Object Repository/1st Month/day 23/23rd day test7/Page_Salary Stages/span_Select Designation'))

WebUI.click(findTestObject('Object Repository/1st Month/day 23/23rd day test7/Page_Salary Stages/ul_Select DesignationAC MechanicAccount Ass_719120'))

WebUI.click(findTestObject('Object Repository/1st Month/day 23/23rd day test7/Page_Salary Stages/span_Select Salary Stage Year'))

WebUI.click(findTestObject('Object Repository/1st Month/day 23/23rd day test7/Page_Salary Stages/ul_Select Salary Stage Year2023202220172016_bbb60a'))

WebUI.setText(findTestObject('Object Repository/1st Month/day 23/23rd day test7/Page_Salary Stages/input__SalarySatage'), '5')

WebUI.click(findTestObject('Object Repository/1st Month/day 23/23rd day test7/Page_Salary Stages/input_Please enter a value less than or equ_294814'))

WebUI.click(findTestObject('Object Repository/1st Month/day 23/23rd day test7/Page_Salary Stages/input_Please enter a value less than or equ_ff6bd5'))

WebUI.closeBrowser()

