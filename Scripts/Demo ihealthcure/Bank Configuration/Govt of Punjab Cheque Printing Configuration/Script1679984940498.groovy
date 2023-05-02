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

WebUI.setText(findTestObject('Object Repository/2nd Month/day 10/10th day test7/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_username'), 
    'badmin')

WebUI.setEncryptedText(findTestObject('Object Repository/2nd Month/day 10/10th day test7/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_password'), 
    'CSt51UwWECc=')

WebUI.click(findTestObject('Object Repository/2nd Month/day 10/10th day test7/Page_iHealthCure  Hospital Management and I_3c5153/button_Sign In'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 10/10th day test7/Page_/div_Performance Execution Time_ps__rail-y'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 10/10th day test7/Page_/div_Performance Execution Time_ps__rail-y'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 10/10th day test7/Page_/span_Bank Configuration'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 10/10th day test7/Page_/span_Govt Of Punjab Cheque Printing Configuration'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 10/10th day test7/Page_Govt Of Punjab Cheque Configuration/button_Add Govt Of Punjab Cheque Configuration'))

WebUI.setText(findTestObject('Object Repository/2nd Month/day 10/10th day test7/Page_Govt Of Punjab Cheque Configuration/input__AccountTitleA_PaddingTop'), 
    '17')

WebUI.setText(findTestObject('Object Repository/2nd Month/day 10/10th day test7/Page_Govt Of Punjab Cheque Configuration/input__AccountTitleA_PaddingLeft'), 
    '10')

WebUI.setText(findTestObject('Object Repository/2nd Month/day 10/10th day test7/Page_Govt Of Punjab Cheque Configuration/input__AccountNumberPaddingTop'), 
    '1.5')

WebUI.setText(findTestObject('Object Repository/2nd Month/day 10/10th day test7/Page_Govt Of Punjab Cheque Configuration/input__AccountNumberPaddingLeft'), 
    '35')

WebUI.setText(findTestObject('Object Repository/2nd Month/day 10/10th day test7/Page_Govt Of Punjab Cheque Configuration/input__ToTheBankLineAPaddingLeft'), 
    '50')

WebUI.setText(findTestObject('Object Repository/2nd Month/day 10/10th day test7/Page_Govt Of Punjab Cheque Configuration/input__ToTheBankLineAPaddingTop'), 
    '-2.2')

WebUI.setText(findTestObject('Object Repository/2nd Month/day 10/10th day test7/Page_Govt Of Punjab Cheque Configuration/input__DatePaddingTop'), 
    '-4')

WebUI.setText(findTestObject('Object Repository/2nd Month/day 10/10th day test7/Page_Govt Of Punjab Cheque Configuration/input__DatePaddingRight'), 
    '8')

WebUI.setText(findTestObject('Object Repository/2nd Month/day 10/10th day test7/Page_Govt Of Punjab Cheque Configuration/input__ToTheBankLineBPaddingLeft'), 
    '50')

WebUI.setText(findTestObject('Object Repository/2nd Month/day 10/10th day test7/Page_Govt Of Punjab Cheque Configuration/input__ToTheBankLineBPaddingTop'), 
    '-4')

WebUI.setText(findTestObject('Object Repository/2nd Month/day 10/10th day test7/Page_Govt Of Punjab Cheque Configuration/input__BankNamePaddingTop'), 
    '-3')

WebUI.setText(findTestObject('Object Repository/2nd Month/day 10/10th day test7/Page_Govt Of Punjab Cheque Configuration/input__BankNamePaddingLeft'), 
    '35')

WebUI.setText(findTestObject('Object Repository/2nd Month/day 10/10th day test7/Page_Govt Of Punjab Cheque Configuration/input__BankNamePaddingBottom'), 
    '5')

WebUI.setText(findTestObject('Object Repository/2nd Month/day 10/10th day test7/Page_Govt Of Punjab Cheque Configuration/input__ChequePayeePaddingTop'), 
    '19')

WebUI.setText(findTestObject('Object Repository/2nd Month/day 10/10th day test7/Page_Govt Of Punjab Cheque Configuration/input__ChequePayeePaddingLeft'), 
    '35')

WebUI.setText(findTestObject('Object Repository/2nd Month/day 10/10th day test7/Page_Govt Of Punjab Cheque Configuration/input__AmountInWordsPaddingTop'), 
    '4')

WebUI.setText(findTestObject('Object Repository/2nd Month/day 10/10th day test7/Page_Govt Of Punjab Cheque Configuration/input__AmountInWordsPaddingLeft'), 
    '35')

WebUI.setText(findTestObject('Object Repository/2nd Month/day 10/10th day test7/Page_Govt Of Punjab Cheque Configuration/input__AccountHeadAPaddingTop'), 
    '6')

WebUI.setText(findTestObject('Object Repository/2nd Month/day 10/10th day test7/Page_Govt Of Punjab Cheque Configuration/input__AccountHeadAPaddingLeft'), 
    '40')

WebUI.setText(findTestObject('Object Repository/2nd Month/day 10/10th day test7/Page_Govt Of Punjab Cheque Configuration/input__AccountHeadBPaddingTop'), 
    '6')

WebUI.setText(findTestObject('Object Repository/2nd Month/day 10/10th day test7/Page_Govt Of Punjab Cheque Configuration/input__AccountHeadBPaddingLeft'), 
    '90')

WebUI.setText(findTestObject('Object Repository/2nd Month/day 10/10th day test7/Page_Govt Of Punjab Cheque Configuration/input__ChequeAmountPaddingTop'), 
    '19.8')

WebUI.setText(findTestObject('Object Repository/2nd Month/day 10/10th day test7/Page_Govt Of Punjab Cheque Configuration/input__splitIndexOfAccountTitleA'), 
    '20')

WebUI.setText(findTestObject('Object Repository/2nd Month/day 10/10th day test7/Page_Govt Of Punjab Cheque Configuration/input__splitIndexOfAccountTitleB'), 
    '40')

WebUI.setText(findTestObject('Object Repository/2nd Month/day 10/10th day test7/Page_Govt Of Punjab Cheque Configuration/input__splittingIndexAH'), 
    '60')

WebUI.setText(findTestObject('Object Repository/2nd Month/day 10/10th day test7/Page_Govt Of Punjab Cheque Configuration/input_Extra Start Space_extraStartSpace'), 
    '1')

WebUI.setText(findTestObject('Object Repository/2nd Month/day 10/10th day test7/Page_Govt Of Punjab Cheque Configuration/textarea_Top Left Stamp A Name_TopLeftStampAName'), 
    'asd')

WebUI.setText(findTestObject('Object Repository/2nd Month/day 10/10th day test7/Page_Govt Of Punjab Cheque Configuration/textarea_Top Left Stamp B Name_TopLeftStampBName'), 
    'qwe')

WebUI.setText(findTestObject('Object Repository/2nd Month/day 10/10th day test7/Page_Govt Of Punjab Cheque Configuration/textarea_Bottom Right Stamp A Name_BottomRi_f8c0f4'), 
    'asd')

WebUI.setText(findTestObject('Object Repository/2nd Month/day 10/10th day test7/Page_Govt Of Punjab Cheque Configuration/textarea_Bottom Right Stamp B Name_BottomRi_a41677'), 
    'qwe')

WebUI.setText(findTestObject('Object Repository/2nd Month/day 10/10th day test7/Page_Govt Of Punjab Cheque Configuration/textarea_Back Stamp Name_BackStampName'), 
    'Testing')

WebUI.click(findTestObject('Object Repository/2nd Month/day 10/10th day test7/Page_Govt Of Punjab Cheque Configuration/input_Back Stamp Name_SubmitId'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 10/10th day test7/Page_Govt Of Punjab Cheque Configuration/a_Token No . Date .Manager_Action Delete bt_1ea955'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 10/10th day test7/Page_Govt Of Punjab Cheque Configuration/button_No'))

WebUI.closeBrowser()

