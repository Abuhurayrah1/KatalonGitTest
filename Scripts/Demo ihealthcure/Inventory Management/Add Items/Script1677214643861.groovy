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

WebUI.setText(findTestObject('Object Repository/2nd Month/day 3/3rd day test5/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_username'), 
    'badmin')

WebUI.setEncryptedText(findTestObject('Object Repository/2nd Month/day 3/3rd day test5/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_password'), 
    'CSt51UwWECc=')

WebUI.click(findTestObject('Object Repository/2nd Month/day 3/3rd day test5/Page_iHealthCure  Hospital Management and I_3c5153/button_Sign In'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 3/3rd day test5/Page_/div_Performance Execution Time_ps__rail-y'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 3/3rd day test5/Page_/span_Inventory Management'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 3/3rd day test5/Page_/span_Add Items'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 3/3rd day test5/Page_Add Items/button_Add Item'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 3/3rd day test5/Page_Add Items/span_Reselling'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 3/3rd day test5/Page_Add Items/ul_ResellingLabourServicesDirect Raw Materi_14bd15'))

WebUI.setText(findTestObject('Object Repository/2nd Month/day 3/3rd day test5/Page_Add Items/input__Name'), 'asd')

WebUI.click(findTestObject('Object Repository/2nd Month/day 3/3rd day test5/Page_Add Items/span_Select Category'))

WebUI.setText(findTestObject('Object Repository/2nd Month/day 3/3rd day test5/Page_Add Items/input__ItemPrice'), '500')

WebUI.click(findTestObject('Object Repository/2nd Month/day 3/3rd day test5/Page_Add Items/span_Select Purchase Unit'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 3/3rd day test5/Page_Add Items/ul_Select Purchase UnitftCansmlVialsNosKgTu_f68b10'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 3/3rd day test5/Page_Add Items/span__select2-CostMethod-container'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 3/3rd day test5/Page_Add Items/input_Select Tax Description_SubmitId'))

WebUI.closeBrowser()

