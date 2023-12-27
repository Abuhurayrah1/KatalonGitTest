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

WebUI.setText(findTestObject('Object Repository/1st Month/day 9/9th day test4/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_username'), 
    'badmin')

WebUI.setEncryptedText(findTestObject('Object Repository/1st Month/day 9/9th day test4/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_password'), 
    'CSt51UwWECc=')

WebUI.click(findTestObject('Object Repository/1st Month/day 9/9th day test4/Page_iHealthCure  Hospital Management and I_3c5153/button_Sign In'))

WebUI.click(findTestObject('Object Repository/1st Month/day 9/9th day test4/Page_/span_Organization Building'))

WebUI.click(findTestObject('Object Repository/1st Month/day 9/9th day test4/Page_/span_Beds'))

WebUI.click(findTestObject('Object Repository/1st Month/day 9/9th day test4/Page_Bed/button_Add Bed'))

WebUI.click(findTestObject('Object Repository/1st Month/day 9/9th day test4/Page_Bed/span_Select Building'))

WebUI.click(findTestObject('1st Month/day 9/9th day test3/Page_Room/ul_Select BuildingModel PharmacyRawalpindi Institute Of CardiologyTest 1Test 2Test1Test2Test3'))

WebUI.setText(findTestObject('Object Repository/1st Month/day 9/9th day test4/Page_Bed/input_Description_Description'), 
    '01/03/2023')

WebUI.click(findTestObject('Object Repository/1st Month/day 9/9th day test4/Page_Bed/div_Maximum Range'))

WebUI.click(findTestObject('Object Repository/1st Month/day 9/9th day test4/Page_Bed/span_5'))

WebUI.selectOptionByValue(findTestObject('Object Repository/1st Month/day 9/9th day test4/Page_Bed/select_Maximum Range12345678910111213141516_6ab41c'), 
    '5', true)

WebUI.setText(findTestObject('Object Repository/1st Month/day 9/9th day test4/Page_Bed/input__Amount'), '500')

WebUI.click(findTestObject('Object Repository/1st Month/day 9/9th day test4/Page_Bed/div_Select Type'))

WebUI.click(findTestObject('Object Repository/1st Month/day 9/9th day test4/Page_Bed/span_Once'))

WebUI.selectOptionByValue(findTestObject('Object Repository/1st Month/day 9/9th day test4/Page_Bed/select_Select TypeOncePeriodic'), 
    '97ac3d33-e8aa-e711-80c1-a0b3cce147ba', true)

WebUI.click(findTestObject('Object Repository/1st Month/day 9/9th day test4/Page_Bed/input_Please enter a value with valid lengt_2a43da'))

WebUI.closeBrowser()

