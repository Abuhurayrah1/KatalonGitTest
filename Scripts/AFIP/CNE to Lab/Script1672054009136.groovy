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

WebUI.navigateToUrl('http://192.168.88.254:399/Account/LogIn?ReturnUrl=%2f')

WebUI.setText(findTestObject('Object Repository/1st Month/day 6/6th day test1/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_username'), 
    'afipadmin')

WebUI.setEncryptedText(findTestObject('Object Repository/1st Month/day 6/6th day test1/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_password'), 
    'CSt51UwWECc=')

WebUI.click(findTestObject('Object Repository/1st Month/day 6/6th day test1/Page_iHealthCure  Hospital Management and I_3c5153/button_Sign In'))

WebUI.click(findTestObject('Object Repository/1st Month/day 6/6th day test1/Page_/span_Patient Management'))

WebUI.click(findTestObject('Object Repository/1st Month/day 6/6th day test1/Page_/span_Add Patient'))

WebUI.setText(findTestObject('Object Repository/1st Month/day 6/6th day test1/Page_Add Patient/input__FirstName'), 'testone')

WebUI.setText(findTestObject('Object Repository/1st Month/day 6/6th day test1/Page_Add Patient/input__CNICNumber'), '37410-0101010-4')

WebUI.setText(findTestObject('Object Repository/1st Month/day 6/6th day test1/Page_Add Patient/input__yb'), '36')

WebUI.setText(findTestObject('Object Repository/1st Month/day 6/6th day test1/Page_Add Patient/input__Address'), 'rwp')

WebUI.setText(findTestObject('Object Repository/1st Month/day 6/6th day test1/Page_Add Patient/input__CellNumber'), '03121212121')

WebUI.click(findTestObject('Object Repository/1st Month/day 6/6th day test1/Page_Add Patient/span'))

WebUI.click(findTestObject('Object Repository/1st Month/day 6/6th day test1/Page_Add Patient/button_Submit'))

WebUI.click(findTestObject('Object Repository/1st Month/day 6/6th day test1/Page_Add Patient/ul__select2-selection__rendered'))

WebUI.sendKeys(findTestObject('Object Repository/1st Month/day 6/6th day test1/Page_Add Patient/input__select2-search__field'), 'ck-mb')

WebUI.waitForElementClickable(findTestObject('Object Repository/1st Month/day 4/4thday test2/Page_Vault/li_CK-MB (Mass), Serum Or Clotted  EDTA , 700'), 
    10)

WebUI.click(findTestObject('Object Repository/1st Month/day 4/4thday test2/Page_Vault/li_CK-MB (Mass), Serum Or Clotted  EDTA , 700'))

WebUI.click(findTestObject('Object Repository/1st Month/day 6/6th day test1/Page_Add Patient/input_Please enter a value with valid lengt_bf4d4b'))

WebUI.click(findTestObject('Object Repository/1st Month/day 6/6th day test1/Page_Add Patient/span_Patient Management'))

WebUI.click(findTestObject('1st Month/day 3/3rdday test1/Page_/div_Cheque Printing Vault_ps__rail-y'))

WebUI.click(findTestObject('Object Repository/1st Month/day 6/6th day test1/Page_Add Patient/span_Lab Investigations'))

WebUI.click(findTestObject('Object Repository/1st Month/day 6/6th day test1/Page_Add Patient/span_Investigations Queue'))

WebUI.click(findTestObject('Object Repository/1st Month/day 6/6th day test1/Page_Investigations Queue/a_Mr. System Administrator  Dec 27, 2022 09_a6a296'))

WebUI.click(findTestObject('Object Repository/1st Month/day 6/6th day test1/Page_Investigations Queue/button_Collect'))

WebUI.click(findTestObject('Object Repository/1st Month/day 6/6th day test1/Page_Investigations Queue/a_Sample Recieving'))

WebUI.click(findTestObject('Object Repository/1st Month/day 6/6th day test1/Page_Investigations Queue/a_Mr. System Administrator  Dec 27, 2022 09_9767ac'))

WebUI.click(findTestObject('Object Repository/1st Month/day 6/6th day test1/Page_Investigations Queue/button_Receive'))

WebUI.click(findTestObject('Object Repository/1st Month/day 6/6th day test1/Page_Investigations Queue/a_Result Entry'))

WebUI.click(findTestObject('Object Repository/1st Month/day 6/6th day test1/Page_Investigations Queue/a_Mr. System Administrator  Dec 27, 2022 09_8f4fd1'))

WebUI.setText(findTestObject('Object Repository/1st Month/day 6/6th day test1/Page_Enter Test Result/input_(  5) ugL_numeric0'), '5')

WebUI.click(findTestObject('Object Repository/1st Month/day 6/6th day test1/Page_Enter Test Result/input_Report Preview_Submit'))

WebUI.click(findTestObject('Object Repository/1st Month/day 6/6th day test1/Page_Investigations Queue/a_Registrar Verification'))

WebUI.click(findTestObject('Object Repository/1st Month/day 6/6th day test1/Page_Investigations Queue/a_Mr. System Administrator  Dec 27, 2022 09_83f6e7'))

WebUI.click(findTestObject('Object Repository/1st Month/day 6/6th day test1/Page_Review Test Result/div_Select Doctor'))

WebUI.click(findTestObject('Object Repository/1st Month/day 6/6th day test1/Page_Review Test Result/span_Brig Hamid  saeed  Malik  Consultant H_4cf77a'))

WebUI.selectOptionByValue(findTestObject('Object Repository/1st Month/day 6/6th day test1/Page_Review Test Result/select_Select DoctorBrig Hamid  saeed  Mali_b96eeb'), 
    '27fbe905-7c41-420a-9865-7e44f827b3e8', true)

WebUI.click(findTestObject('Object Repository/1st Month/day 6/6th day test1/Page_Review Test Result/input_Report Preview_Submit'))

WebUI.click(findTestObject('Object Repository/1st Month/day 6/6th day test1/Page_Investigations Queue/a_Consultant Verification'))

WebUI.click(findTestObject('Object Repository/1st Month/day 6/6th day test1/Page_Investigations Queue/a_Verified'))

WebUI.click(findTestObject('Object Repository/1st Month/day 6/6th day test1/Page_Investigations Queue/a_Brig Hamid  saeed  Malik  Dec 27, 2022 09_7a7715'))

WebUI.click(findTestObject('Object Repository/1st Month/day 6/6th day test1/Page_Investigations Queue/span'))

WebUI.click(findTestObject('Object Repository/1st Month/day 6/6th day test1/Page_Investigations Queue/span_1'))

WebUI.click(findTestObject('Object Repository/1st Month/day 6/6th day test1/Page_Investigations Queue/input_Print A4 Full_OptionPrintButton'))

