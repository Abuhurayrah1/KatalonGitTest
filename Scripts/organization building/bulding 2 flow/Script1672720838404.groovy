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

WebUI.setText(findTestObject('Object Repository/1st Month/day 3/3rdday test5/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_username'), 
    'badmin')

WebUI.setEncryptedText(findTestObject('Object Repository/1st Month/day 3/3rdday test5/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_password'), 
    'CSt51UwWECc=')

WebUI.click(findTestObject('Object Repository/1st Month/day 3/3rdday test5/Page_iHealthCure  Hospital Management and I_3c5153/button_Sign In'))

WebUI.click(findTestObject('Object Repository/1st Month/day 3/3rdday test5/Page_/span_Organization Building'))

WebUI.click(findTestObject('Object Repository/1st Month/day 3/3rdday test5/Page_/span_Building'))

WebUI.click(findTestObject('Object Repository/1st Month/day 3/3rdday test5/Page_Building/button_Add Building'))

WebUI.setText(findTestObject('Object Repository/1st Month/day 3/3rdday test5/Page_Building/input__Name'), 'test11')

WebUI.click(findTestObject('Object Repository/1st Month/day 3/3rdday test5/Page_Building/input_Please enter a value with valid lengt_98c46b'))

WebUI.click(findTestObject('Object Repository/1st Month/day 3/3rdday test5/Page_Building/div_Organization Building                Bu_f216c2'))

WebUI.click(findTestObject('Object Repository/1st Month/day 3/3rdday test5/Page_Building/span_Floors'))

WebUI.click(findTestObject('Object Repository/1st Month/day 3/3rdday test5/Page_Floor/button_Add Floor'))

WebUI.click(findTestObject('Object Repository/1st Month/day 3/3rdday test5/Page_Floor/div_Select Building'))

WebUI.setText(findTestObject('Object Repository/1st Month/day 3/3rdday test5/Page_Floor/input_Select Building_form-control'), 'test10')

WebUI.click(findTestObject('1st Month/day 3/3rdday test5/Page_Floor/a_Test10'))

WebUI.selectOptionByValue(findTestObject('Object Repository/1st Month/day 3/3rdday test5/Page_Floor/select_Select BuildingModel PharmacyRawalpi_104eee'), 
    '1288d1d1-db81-ed11-80e6-005056af7c10', true)

WebUI.setText(findTestObject('Object Repository/1st Month/day 3/3rdday test5/Page_Floor/input__Name'), 'floortest10')

WebUI.click(findTestObject('Object Repository/1st Month/day 3/3rdday test5/Page_Floor/input_Please enter a value with valid lengt_e71f28'))

WebUI.click(findTestObject('Object Repository/1st Month/day 3/3rdday test5/Page_Floor/div_Organization Building                Bu_f216c2'))

WebUI.click(findTestObject('Object Repository/1st Month/day 3/3rdday test5/Page_Floor/span_Rooms'))

WebUI.click(findTestObject('Object Repository/1st Month/day 3/3rdday test5/Page_Room/button_Add Room'))

WebUI.click(findTestObject('Object Repository/1st Month/day 3/3rdday test5/Page_Room/span_Select Building'))

WebUI.setText(findTestObject('Object Repository/1st Month/day 3/3rdday test5/Page_Room/input_concat(id(, , select2-BuildingId-cont_cf564d'), 
    'test10')

WebUI.setText(findTestObject('Object Repository/1st Month/day 3/3rdday test5/Page_Room/input__UpdateName'), 'roomtest10')

WebUI.click(findTestObject('Object Repository/1st Month/day 3/3rdday test5/Page_Room/input_Description_SubmitRoom'))

WebUI.click(findTestObject('Object Repository/1st Month/day 3/3rdday test5/Page_Bed/div_Organization Building                Bu_f216c2'))

WebUI.click(findTestObject('Object Repository/1st Month/day 3/3rdday test5/Page_Bed/span_Beds'))

WebUI.click(findTestObject('Object Repository/1st Month/day 3/3rdday test5/Page_Bed/button_Add Bed'))

WebUI.click(findTestObject('Object Repository/1st Month/day 3/3rdday test5/Page_Bed/span_Select Building'))

WebUI.setText(findTestObject('Object Repository/1st Month/day 3/3rdday test5/Page_Bed/input_concat(id(, , select2-BuildingId-cont_cf564d'), 
    'test10')

WebUI.click(findTestObject('Object Repository/1st Month/day 3/3rdday test5/Page_Bed/div_Maximum Range'))

WebUI.click(findTestObject('Object Repository/1st Month/day 3/3rdday test5/Page_Bed/a_2'))

WebUI.selectOptionByValue(findTestObject('Object Repository/1st Month/day 3/3rdday test5/Page_Bed/select_Maximum Range12345678910111213141516_6ab41c'), 
    '2', true)

WebUI.setText(findTestObject('Object Repository/1st Month/day 3/3rdday test5/Page_Bed/input__Amount'), '500')

WebUI.click(findTestObject('Object Repository/1st Month/day 3/3rdday test5/Page_Bed/div_Select Type'))

WebUI.click(findTestObject('Object Repository/1st Month/day 3/3rdday test5/Page_Bed/span_Once'))

WebUI.selectOptionByValue(findTestObject('Object Repository/1st Month/day 3/3rdday test5/Page_Bed/select_Select TypeOncePeriodic'), '97ac3d33-e8aa-e711-80c1-a0b3cce147ba', 
    true)

WebUI.click(findTestObject('Object Repository/1st Month/day 3/3rdday test5/Page_Bed/input_Please enter a value with valid lengt_2a43da'))

WebUI.closeBrowser()

