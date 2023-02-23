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

WebUI.setText(findTestObject('Object Repository/2nd Month/day 1/1st day test1/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_username'), 
    'badmin')

WebUI.setEncryptedText(findTestObject('Object Repository/2nd Month/day 1/1st day test1/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_password'), 
    'CSt51UwWECc=')

WebUI.click(findTestObject('Object Repository/2nd Month/day 1/1st day test1/Page_iHealthCure  Hospital Management and I_3c5153/button_Sign In'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 1/1st day test1/Page_/div_Performance Execution Time_ps__rail-y'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 1/1st day test1/Page_/span_Medicines  Disposables'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 1/1st day test1/Page_/div_Performance Execution Time_ps__rail-y'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 1/1st day test1/Page_/span_Dosage'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 1/1st day test1/Page_MedicineDosages/button_Add Medicine Dosage'))

WebUI.setText(findTestObject('Object Repository/2nd Month/day 1/1st day test1/Page_MedicineDosages/input__Abbreviation'), 
    'asd')

WebUI.setText(findTestObject('Object Repository/2nd Month/day 1/1st day test1/Page_MedicineDosages/input_Latin_Latin'), 
    'asd')

WebUI.setText(findTestObject('Object Repository/2nd Month/day 1/1st day test1/Page_MedicineDosages/textarea_English Definition_EnglishDefinition'), 
    'asd')

WebUI.setText(findTestObject('Object Repository/2nd Month/day 1/1st day test1/Page_MedicineDosages/input__Preference'), 
    '151')

WebUI.setText(findTestObject('Object Repository/2nd Month/day 1/1st day test1/Page_MedicineDosages/input__Count'), '5')

WebUI.setText(findTestObject('Object Repository/2nd Month/day 1/1st day test1/Page_MedicineDosages/input__Duration'), '5')

WebUI.setText(findTestObject('Object Repository/2nd Month/day 1/1st day test1/Page_MedicineDosages/input__DurationMax'), 
    '5')

WebUI.click(findTestObject('Object Repository/2nd Month/day 1/1st day test1/Page_MedicineDosages/div_Select Duration Units'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 1/1st day test1/Page_MedicineDosages/span_Second'))

WebUI.selectOptionByValue(findTestObject('Object Repository/2nd Month/day 1/1st day test1/Page_MedicineDosages/select_Select Duration Units SecondMinuteHo_3bf204'), 
    '91ac3d33-e8aa-e711-80c1-a0b3cce147ba', true)

WebUI.setText(findTestObject('Object Repository/2nd Month/day 1/1st day test1/Page_MedicineDosages/input__Frequency'), '5')

WebUI.setText(findTestObject('Object Repository/2nd Month/day 1/1st day test1/Page_MedicineDosages/input__FrequencyMax'), 
    '5')

WebUI.setText(findTestObject('Object Repository/2nd Month/day 1/1st day test1/Page_MedicineDosages/input__Period'), '7')

WebUI.setText(findTestObject('Object Repository/2nd Month/day 1/1st day test1/Page_MedicineDosages/input__PeriodMax'), '7')

WebUI.click(findTestObject('Object Repository/2nd Month/day 1/1st day test1/Page_MedicineDosages/div_Select Period Units'))

WebUI.selectOptionByValue(findTestObject('Object Repository/2nd Month/day 1/1st day test1/Page_MedicineDosages/select_Select Period Units SecondMinuteHour_cb8c31'), 
    '91ac3d33-e8aa-e711-80c1-a0b3cce147ba', true)

WebUI.click(findTestObject('Object Repository/2nd Month/day 1/1st day test1/Page_MedicineDosages/div_Select When'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 1/1st day test1/Page_MedicineDosages/span_WAKEupon waking up from a regular peri_96ca67'))

WebUI.selectOptionByValue(findTestObject('Object Repository/2nd Month/day 1/1st day test1/Page_MedicineDosages/select_Select When                         _39db27'), 
    'c986a69f-e1a7-ea11-80d1-005056af756c', true)

WebUI.click(findTestObject('Object Repository/2nd Month/day 1/1st day test1/Page_MedicineDosages/input_Please Select_Create'))

WebUI.closeBrowser()

