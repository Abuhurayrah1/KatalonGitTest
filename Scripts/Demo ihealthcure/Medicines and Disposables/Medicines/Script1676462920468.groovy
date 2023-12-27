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

WebUI.setText(findTestObject('Object Repository/1st Month/day 30/30th day test17/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_username'), 
    'badmin')

WebUI.setEncryptedText(findTestObject('Object Repository/1st Month/day 30/30th day test17/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_password'), 
    'CSt51UwWECc=')

WebUI.click(findTestObject('Object Repository/1st Month/day 30/30th day test17/Page_iHealthCure  Hospital Management and I_3c5153/button_Sign In'))

WebUI.click(findTestObject('Object Repository/1st Month/day 30/30th day test17/Page_/div_Performance Execution Time_ps__rail-y'))

WebUI.click(findTestObject('Object Repository/1st Month/day 30/30th day test17/Page_/span_Medicines  Disposables'))

WebUI.click(findTestObject('Object Repository/1st Month/day 30/30th day test17/Page_/span_Medicines'))

WebUI.click(findTestObject('Object Repository/1st Month/day 30/30th day test17/Page_/button_Add Medicine'))

WebUI.click(findTestObject('Object Repository/1st Month/day 30/30th day test17/Page_/div_Please Select'))

WebUI.click(findTestObject('Object Repository/1st Month/day 30/30th day test17/Page_/span_Cardiology'))

WebUI.click(findTestObject('Object Repository/1st Month/day 30/30th day test17/Page_/div_Please Select'))

WebUI.click(findTestObject('Object Repository/1st Month/day 30/30th day test17/Page_/span_Select Type'))

WebUI.click(findTestObject('Object Repository/1st Month/day 30/30th day test17/Page_/ul_SearchingAmp Amp Bottle Bottle Cap Capsu_3285c9'))

WebUI.click(findTestObject('Object Repository/1st Month/day 30/30th day test17/Page_/span_Select Name'))

WebUI.click(findTestObject('Object Repository/1st Month/day 30/30th day test17/Page_/ul_Searching Beneprotein Xenglu25 Dextrose _398d8b'))

WebUI.click(findTestObject('Object Repository/1st Month/day 30/30th day test17/Page_/div_Select Generic'))

WebUI.click(findTestObject('Object Repository/1st Month/day 30/30th day test17/Page_/span_Isoconazole'))

WebUI.selectOptionByValue(findTestObject('Object Repository/1st Month/day 30/30th day test17/Page_/select_Select GenericIsoconazoleCholine Sal_6a24ee'), 
    'b29d3961-79ab-e711-80fe-001517791069', true)

WebUI.click(findTestObject('Object Repository/1st Month/day 30/30th day test17/Page_/div_Select Strength'))

WebUI.click(findTestObject('Object Repository/1st Month/day 30/30th day test17/Page_/span_0Ml'))

WebUI.selectOptionByValue(findTestObject('Object Repository/1st Month/day 30/30th day test17/Page_/select_Select Strength0Ml120Ml2.5Ml5Ml0.025_338045'), 
    '9daaa6c8-6289-e811-80be-005056af7162', true)

WebUI.click(findTestObject('1st Month/day 30/30th day test17/Page_/div_Anticoagulant'))

WebUI.click(findTestObject('Object Repository/1st Month/day 30/30th day test17/Page_/span_Anticoagulant'))

WebUI.click(findTestObject('1st Month/day 30/30th day test17/Page_/div_Anticoagulant'))

WebUI.click(findTestObject('Object Repository/1st Month/day 30/30th day test17/Page_/span_Select Dosage'))

WebUI.click(findTestObject('Object Repository/1st Month/day 30/30th day test17/Page_/ul_SearchingBD twice daily    HS at bed tim_e83dbc'))

WebUI.click(findTestObject('Object Repository/1st Month/day 30/30th day test17/Page_/span_Select Route'))

WebUI.click(findTestObject('Object Repository/1st Month/day 30/30th day test17/Page_/ul_Searchingexternal use external use  IJ I_0e78d7'))

WebUI.click(findTestObject('Object Repository/1st Month/day 30/30th day test17/Page_/button_Submit'))

WebUI.closeBrowser()

