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

WebUI.setText(findTestObject('Object Repository/2nd Month/day 16/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_username'), 
    'badmin')

WebUI.setEncryptedText(findTestObject('Object Repository/2nd Month/day 16/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_password'), 
    'CSt51UwWECc=')

WebUI.click(findTestObject('Object Repository/2nd Month/day 16/Page_iHealthCure  Hospital Management and I_3c5153/button_Sign In'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 16/Page_/div_Donor Registration Form_ps__rail-y'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 16/Page_/div_Donor Registration Form_ps__rail-y'))

WebUI.waitForElementClickable(findTestObject('2nd Month/day 16/Page_/span_Blood Bank'), 20)

WebUI.click(findTestObject('Object Repository/2nd Month/day 16/Page_/span_Blood Bank'))

WebUI.waitForElementClickable(findTestObject('2nd Month/day 16/Page_/span_Add Blood Bag'), 20)

WebUI.click(findTestObject('Object Repository/2nd Month/day 16/Page_/span_Add Blood Bag'))

WebUI.setText(findTestObject('Object Repository/2nd Month/day 16/Page_Add Blood Bag/input_Bag No_BloodBagNO'), '123')

WebUI.click(findTestObject('Object Repository/2nd Month/day 16/Page_Add Blood Bag/button_Select Blood Group'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 16/Page_Add Blood Bag/span_A'))

WebUI.selectOptionByValue(findTestObject('Object Repository/2nd Month/day 16/Page_Add Blood Bag/select_Select Blood GroupAA-BB-OO-ABAB-'), 
    '83ac3d33-e8aa-e711-80c1-a0b3cce147ba', true)

WebUI.click(findTestObject('Object Repository/2nd Month/day 16/Page_Add Blood Bag/div_Select Component'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 16/Page_Add Blood Bag/span_Red Cell Concentrates (RCC)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/2nd Month/day 16/Page_Add Blood Bag/select_Select ComponentRed Cell Concentrate_0a9790'), 
    '18272fd4-e3dc-ec11-8134-ac162d7327a7', true)

WebUI.click(findTestObject('Object Repository/2nd Month/day 16/Page_Add Blood Bag/input__BagValidDate'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 16/Page_Add Blood Bag/td_6'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 16/Page_Add Blood Bag/div_Select Status'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 16/Page_Add Blood Bag/span_Fractionated'))

WebUI.selectOptionByValue(findTestObject('Object Repository/2nd Month/day 16/Page_Add Blood Bag/select_Select StatusFractionatedScreening P_c4a8ef'), 
    '556fd933-2c46-ed11-8173-ac162d7327a5', true)

WebUI.click(findTestObject('Object Repository/2nd Month/day 16/Page_Add Blood Bag/span_Select Donation Type'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 16/Page_Add Blood Bag/span_Select Donation TypeFamilyReplacementV_d52cdc'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 16/Page_Add Blood Bag/input__DonationDate'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 16/Page_Add Blood Bag/td_8'))

WebUI.setText(findTestObject('Object Repository/2nd Month/day 16/Page_Add Blood Bag/input__DonorIdentity'), '31201-2012012-0')

WebUI.setText(findTestObject('Object Repository/2nd Month/day 16/Page_Add Blood Bag/input__PatientIdentityNo'), '76857-7676765-6')

WebUI.click(findTestObject('Object Repository/2nd Month/day 16/Page_Add Blood Bag/div_Select Blood Group'))

WebUI.selectOptionByValue(findTestObject('Object Repository/2nd Month/day 16/Page_Add Blood Bag/select_Select Blood GroupAA-BB-OO-ABAB-_1'), 
    '83ac3d33-e8aa-e711-80c1-a0b3cce147ba', true)

WebUI.setText(findTestObject('Object Repository/2nd Month/day 16/Page_Add Blood Bag/textarea_Remarks_RemarksId'), 'Test item')

WebUI.click(findTestObject('Object Repository/2nd Month/day 16/Page_Add Blood Bag/input_Remarks_SubmitId'))

WebUI.closeBrowser()

