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

WebUI.setText(findTestObject('Object Repository/2nd Month/day 16/16th day test2/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_username'), 
    'badmin')

WebUI.setEncryptedText(findTestObject('Object Repository/2nd Month/day 16/16th day test2/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_password'), 
    'CSt51UwWECc=')

WebUI.click(findTestObject('Object Repository/2nd Month/day 16/16th day test2/Page_iHealthCure  Hospital Management and I_3c5153/button_Sign In'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 16/16th day test2/Page_/div_Donor Registration Form_ps__rail-y'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 16/16th day test2/Page_/div_Donor Registration Form_ps__rail-y'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 16/16th day test2/Page_/span_Blood Bank'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 16/16th day test2/Page_/span_Blood Bag Inventory'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 16/16th day test2/Page_Blood Bag Inventory/a_Screening Pending_Action Update btn btn-s_d3395f'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 16/16th day test2/Page_Blood Bag Inventory/input_Remarks_UpdateSubmitId'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 16/16th day test2/Page_Blood Bag Inventory/a_Fractionated_Action Delete btn btn-sm btn_fdd61f'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 16/16th day test2/Page_Blood Bag Inventory/button_No'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 16/16th day test2/Page_Blood Bag Inventory/a_Fractionated_BloodFractionation service-g_630be7'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 16/16th day test2/Page_Blood Bag Inventory/div_Select Component'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 16/16th day test2/Page_Blood Bag Inventory/span_Red Cell Concentrates (RCC)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/2nd Month/day 16/16th day test2/Page_Blood Bag Inventory/select_Select ComponentRed Cell Concentrate_0a9790'), 
    '18272fd4-e3dc-ec11-8134-ac162d7327a7', true)

WebUI.setText(findTestObject('Object Repository/2nd Month/day 16/16th day test2/Page_Blood Bag Inventory/input_Bag No_BloodBagNo'), 
    '00991')

WebUI.click(findTestObject('Object Repository/2nd Month/day 16/16th day test2/Page_Blood Bag Inventory/input__Fractionation_BagExpiry'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 16/16th day test2/Page_Blood Bag Inventory/td_6'))

WebUI.setText(findTestObject('Object Repository/2nd Month/day 16/16th day test2/Page_Blood Bag Inventory/textarea_Remarks_Remarks'), 
    'Test Remarks')

WebUI.click(findTestObject('Object Repository/2nd Month/day 16/16th day test2/Page_Blood Bag Inventory/input_Remarks_add'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 16/16th day test2/Page_Blood Bag Inventory/input_Close_SubmitFractionation'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 16/16th day test2/Page_Blood Bag Inventory/a_Screening Pending_btn_issuebloodbag servi_c58252'))

WebUI.setText(findTestObject('Object Repository/2nd Month/day 16/16th day test2/Page_Blood Bag Inventory/input__IssuancePatientIdentityNo'), 
    '37410-4741014-7')

WebUI.click(findTestObject('Object Repository/2nd Month/day 16/16th day test2/Page_Blood Bag Inventory/input_Issuance Date_BloodBagIssuanceDate'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 16/16th day test2/Page_Blood Bag Inventory/td_8'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 16/16th day test2/Page_Blood Bag Inventory/div_Select Status'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 16/16th day test2/Page_Blood Bag Inventory/span_Compatible'))

WebUI.selectOptionByValue(findTestObject('Object Repository/2nd Month/day 16/16th day test2/Page_Blood Bag Inventory/select_Select Status                       _d3e43b'), 
    '1', true)

WebUI.setText(findTestObject('Object Repository/2nd Month/day 16/16th day test2/Page_Blood Bag Inventory/textarea_Remarks_RemarksId'), 
    'Testing')

WebUI.click(findTestObject('Object Repository/2nd Month/day 16/16th day test2/Page_Blood Bag Inventory/input_Close_SubmitIssuanceId'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 16/16th day test2/Page_Blood Bag Inventory/a_Screening Pending_BarCodeInModal service-_27f069'))

WebUI.closeBrowser()

