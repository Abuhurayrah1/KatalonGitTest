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

WebUI.navigateToUrl('https://model.ihealthcure.com/Account/Login')

WebUI.setText(findTestObject('Object Repository/1st Month/day 17/17th day test2/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_username'), 
    'badmin')

WebUI.setEncryptedText(findTestObject('Object Repository/1st Month/day 17/17th day test2/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_password'), 
    'CSt51UwWECc=')

WebUI.click(findTestObject('Object Repository/1st Month/day 17/17th day test2/Page_iHealthCure  Hospital Management and I_3c5153/button_Sign In'))

WebUI.click(findTestObject('Object Repository/1st Month/day 17/17th day test2/Page_/span_Admin  HR'))

WebUI.click(findTestObject('Object Repository/1st Month/day 17/17th day test2/Page_/span_Add Employee'))

WebUI.click(findTestObject('Object Repository/1st Month/day 17/17th day test2/Page_Add Employees/button_Add Employee'))

WebUI.click(findTestObject('Object Repository/1st Month/day 17/17th day test2/Page_Add Employees/div_Working'))

WebUI.click(findTestObject('Object Repository/1st Month/day 17/17th day test2/Page_Add Employees/span_Working'))

WebUI.selectOptionByValue(findTestObject('Object Repository/1st Month/day 17/17th day test2/Page_Add Employees/select_WorkingWorkingResignedTerminatedDece_1055b2'), 
    'bb674801-9f61-e911-80d2-000c296575d1', true)

WebUI.click(findTestObject('Object Repository/1st Month/day 17/17th day test2/Page_Add Employees/div_Select Title'))

WebUI.click(findTestObject('Object Repository/1st Month/day 17/17th day test2/Page_Add Employees/span_Mr'))

WebUI.selectOptionByValue(findTestObject('Object Repository/1st Month/day 17/17th day test2/Page_Add Employees/select_Select TitleMr.Mrs.MissDr.Prof.Not A_e0dd14'), 
    'c1b03d33-e8aa-e711-80c1-a0b3cce147ba', true)

WebUI.click(findTestObject('Object Repository/1st Month/day 17/17th day test2/Page_Add Employees/div_Select User Type'))

WebUI.click(findTestObject('Object Repository/1st Month/day 17/17th day test2/Page_Add Employees/span_User'))

WebUI.selectOptionByValue(findTestObject('Object Repository/1st Month/day 17/17th day test2/Page_Add Employees/select_Select User TypeUserDoctorNurse'), 
    'dcb03d33-e8aa-e711-80c1-a0b3cce147ba', true)

WebUI.setText(findTestObject('Object Repository/1st Month/day 17/17th day test2/Page_Add Employees/input__firstname'), 'tool')

WebUI.setText(findTestObject('Object Repository/1st Month/day 17/17th day test2/Page_Add Employees/input__lastName'), 'test')

WebUI.setText(findTestObject('Object Repository/1st Month/day 17/17th day test2/Page_Add Employees/input__DateOfBirth'), 
    '05/09/1999')

WebUI.setText(findTestObject('Object Repository/1st Month/day 17/17th day test2/Page_Add Employees/input__EmployeeNumber'), 
    '0011')

WebUI.setText(findTestObject('Object Repository/1st Month/day 17/17th day test2/Page_Add Employees/input__username'), 'tool')

WebUI.setEncryptedText(findTestObject('Object Repository/1st Month/day 17/17th day test2/Page_Add Employees/input__password'), 
    'CSt51UwWECc=')

WebUI.setEncryptedText(findTestObject('Object Repository/1st Month/day 17/17th day test2/Page_Add Employees/input__confirmpassword'), 
    'CSt51UwWECc=')

WebUI.setText(findTestObject('Object Repository/1st Month/day 17/17th day test2/Page_Add Employees/input__CNICNumber'), 
    '37401-3456789-2')

WebUI.setText(findTestObject('Object Repository/1st Month/day 17/17th day test2/Page_Add Employees/input__DateOfJoining'), 
    '16/01/2022')

WebUI.click(findTestObject('Object Repository/1st Month/day 17/17th day test2/Page_Add Employees/div_Please Select'))

WebUI.setText(findTestObject('Object Repository/1st Month/day 17/17th day test2/Page_Add Employees/input_Please Select_form-control'), 
    'nurse')

WebUI.click(findTestObject('1st Month/day 17/17th day test2/Page_Add Employees/span_Charge Nurse'))

WebUI.click(findTestObject('Object Repository/1st Month/day 17/17th day test2/Page_Add Employees/div_Please Select'))

WebUI.click(findTestObject('1st Month/day 17/17th day test2/Page_Add Employees/div_Charge Nurse'))

WebUI.click(findTestObject('1st Month/day 17/17th day test2/Page_Add Employees/span_Charge Nurse'))

WebUI.click(findTestObject('1st Month/day 17/17th day test2/Page_Add Employees/div_Charge Nurse'))

WebUI.click(findTestObject('1st Month/day 17/17th day test2/Page_Add Employees/div_Emergency'))

WebUI.setText(findTestObject('Object Repository/1st Month/day 17/17th day test2/Page_Add Employees/input_Please Select_form-control'), 
    'emergency')

WebUI.click(findTestObject('1st Month/day 17/17th day test2/Page_Add Employees/span_Emergency'))

WebUI.click(findTestObject('1st Month/day 17/17th day test2/Page_Add Employees/div_Emergency'))

WebUI.click(findTestObject('1st Month/day 17/17th day test2/Page_Add Employees/div_Can Close Resignation Application'))

WebUI.click(findTestObject('1st Month/day 17/17th day test2/Page_Add Employees/span_Can Close Resignation Application'))

WebUI.click(findTestObject('1st Month/day 17/17th day test2/Page_Add Employees/div_Can Close Resignation Application'))

WebUI.setText(findTestObject('Object Repository/1st Month/day 17/17th day test2/Page_Add Employees/input__CellNumber'), 
    '031000000000000')

WebUI.click(findTestObject('Object Repository/1st Month/day 17/17th day test2/Page_Add Employees/input_Please enter a value with valid lengt_74315f'))

WebUI.closeBrowser()

