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

WebUI.setText(findTestObject('Object Repository/2nd Month/day 16/16th day test4/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_username'), 
    'badmin')

WebUI.setEncryptedText(findTestObject('Object Repository/2nd Month/day 16/16th day test4/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_password'), 
    'CSt51UwWECc=')

WebUI.click(findTestObject('Object Repository/2nd Month/day 16/16th day test4/Page_iHealthCure  Hospital Management and I_3c5153/button_Sign In'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 16/16th day test4/Page_/div_Donor Registration Form_ps__rail-y'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 16/16th day test4/Page_/div_Donor Registration Form_ps__rail-y'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 16/16th day test4/Page_/span_Blood Bank'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 16/16th day test4/Page_/span_Donor Registration Form'))

WebUI.setText(findTestObject('Object Repository/2nd Month/day 16/16th day test4/Page_Donor Blood Requisition/input__DonorCnic'), 
    '37896-4123654-5')

WebUI.click(findTestObject('Object Repository/2nd Month/day 16/16th day test4/Page_Donor Blood Requisition/div_Select Title'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 16/16th day test4/Page_Donor Blood Requisition/span_Mr'))

WebUI.selectOptionByValue(findTestObject('Object Repository/2nd Month/day 16/16th day test4/Page_Donor Blood Requisition/select_Select TitleMr.Mrs.MissDr.Prof.Not A_e0dd14'), 
    'c1b03d33-e8aa-e711-80c1-a0b3cce147ba', true)

WebUI.setText(findTestObject('Object Repository/2nd Month/day 16/16th day test4/Page_Donor Blood Requisition/input__FirstName'), 
    'Test')

WebUI.setText(findTestObject('Object Repository/2nd Month/day 16/16th day test4/Page_Donor Blood Requisition/input_Age_yb'), 
    '23')

WebUI.click(findTestObject('Object Repository/2nd Month/day 16/16th day test4/Page_Donor Blood Requisition/span_Select Country'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 16/16th day test4/Page_Donor Blood Requisition/ul_Select CountryAfghanistanBelgiumChinaEgy_9ef9bf'))

WebUI.setText(findTestObject('Object Repository/2nd Month/day 16/16th day test4/Page_Donor Blood Requisition/input__Address'), 
    'test')

WebUI.setText(findTestObject('Object Repository/2nd Month/day 16/16th day test4/Page_Donor Blood Requisition/input__CellNumber'), 
    '03000000000')

WebUI.click(findTestObject('Object Repository/2nd Month/day 16/16th day test4/Page_Donor Blood Requisition/div_Select Blood Group'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 16/16th day test4/Page_Donor Blood Requisition/span_A'))

WebUI.selectOptionByValue(findTestObject('Object Repository/2nd Month/day 16/16th day test4/Page_Donor Blood Requisition/select_Select Blood GroupAA-BB-OO-ABAB-'), 
    '83ac3d33-e8aa-e711-80c1-a0b3cce147ba', true)

WebUI.click(findTestObject('Object Repository/2nd Month/day 16/16th day test4/Page_Donor Blood Requisition/span_Select Donation Type'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 16/16th day test4/Page_Donor Blood Requisition/span_Select Donation TypeFamilyReplacementV_d52cdc'))

WebUI.setText(findTestObject('Object Repository/2nd Month/day 16/16th day test4/Page_Donor Blood Requisition/input_Patient Identity_PatientIdentity'), 
    '54400-4722458-4')

WebUI.click(findTestObject('Object Repository/2nd Month/day 16/16th day test4/Page_Donor Blood Requisition/div_Select Location'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 16/16th day test4/Page_Donor Blood Requisition/span_DHQ BHAKKAR'))

WebUI.selectOptionByValue(findTestObject('Object Repository/2nd Month/day 16/16th day test4/Page_Donor Blood Requisition/select_Select LocationDHQ BHAKKARPrivateTHQ_b96833'), 
    '9fc92508-1fd2-4a36-a696-01b212f0e8ea', true)

WebUI.click(findTestObject('Object Repository/2nd Month/day 16/16th day test4/Page_Donor Blood Requisition/div_Select Reason'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 16/16th day test4/Page_Donor Blood Requisition/div_Select Reason'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 16/16th day test4/Page_Donor Blood Requisition/input_Select Reason_SubmitDonor'))

WebUI.closeBrowser()

