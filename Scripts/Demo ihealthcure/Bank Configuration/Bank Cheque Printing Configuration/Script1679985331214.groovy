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

WebUI.setText(findTestObject('Object Repository/2nd Month/day 10/10th day test8/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_username'), 
    'badmin')

WebUI.setEncryptedText(findTestObject('Object Repository/2nd Month/day 10/10th day test8/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_password'), 
    'CSt51UwWECc=')

WebUI.click(findTestObject('Object Repository/2nd Month/day 10/10th day test8/Page_iHealthCure  Hospital Management and I_3c5153/button_Sign In'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 10/10th day test8/Page_/div_Performance Execution Time_ps__rail-y'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 10/10th day test8/Page_/div_Performance Execution Time_ps__rail-y'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 10/10th day test8/Page_/span_Bank Configuration'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 10/10th day test8/Page_/span_Bank Cheque Printing Configuration'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 10/10th day test8/Page_Bank Cheque Printing Configuration/button_Add Bank Cheque Printing Configuration'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 10/10th day test8/Page_Bank Cheque Printing Configuration/div_Select Bank'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 10/10th day test8/Page_Bank Cheque Printing Configuration/span_Meezan Bank'))

WebUI.selectOptionByValue(findTestObject('Object Repository/2nd Month/day 10/10th day test8/Page_Bank Cheque Printing Configuration/select_Select Bank                         _987363'), 
    '1', true)

WebUI.setText(findTestObject('Object Repository/2nd Month/day 10/10th day test8/Page_Bank Cheque Printing Configuration/input__CardTableColumnAWidth'), 
    '5')

WebUI.setText(findTestObject('Object Repository/2nd Month/day 10/10th day test8/Page_Bank Cheque Printing Configuration/input__CardTableColumnBWidth'), 
    '5')

WebUI.setText(findTestObject('Object Repository/2nd Month/day 10/10th day test8/Page_Bank Cheque Printing Configuration/input__FirstCellsRowPaddingTop'), 
    '5')

WebUI.setText(findTestObject('Object Repository/2nd Month/day 10/10th day test8/Page_Bank Cheque Printing Configuration/input__splittingIndex'), 
    '5')

WebUI.setText(findTestObject('Object Repository/2nd Month/day 10/10th day test8/Page_Bank Cheque Printing Configuration/input__DateDigitCharacterSpacing'), 
    '5')

WebUI.setText(findTestObject('Object Repository/2nd Month/day 10/10th day test8/Page_Bank Cheque Printing Configuration/input__PayeeCellsRowPaddingTop'), 
    '5')

WebUI.setText(findTestObject('Object Repository/2nd Month/day 10/10th day test8/Page_Bank Cheque Printing Configuration/input__AmountInWordsBPaddingLeft'), 
    '5')

WebUI.click(findTestObject('Object Repository/2nd Month/day 10/10th day test8/Page_Bank Cheque Printing Configuration/input_Please enter less than 4 characters_SubmitId'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 10/10th day test8/Page_Bank Cheque Printing Configuration/a_ASK_Action Update btn btn-sm btn-clean bt_b83673'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 10/10th day test8/Page_Bank Cheque Printing Configuration/input_Please enter a value with valid lengt_18a3d1'))

WebUI.closeBrowser()

