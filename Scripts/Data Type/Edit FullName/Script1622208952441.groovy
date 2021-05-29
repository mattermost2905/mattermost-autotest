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

WebUI.navigateToUrl('https://mattermost-autotest.herokuapp.com/login')

WebUI.setText(findTestObject('Object Repository/Edit Fullname/Page_Mattermost/input_All team communication in one place, _dcc84b'), 
    username)

WebUI.setEncryptedText(findTestObject('Object Repository/Edit Fullname/Page_Mattermost/input_All team communication in one place, _a3edc6'), 
    password)

WebUI.click(findTestObject('Object Repository/Edit Fullname/Page_Mattermost/span_Sign in'))

if (findTestObject('Edit Fullname/Page_Mattermost/span_Back to Mattermost')) {
    WebUI.click(findTestObject('Edit Fullname/Page_Mattermost/span_Back to Mattermost'))
}

WebUI.click(findTestObject('Object Repository/Edit Fullname/Page_Town Square - mattermost Mattermost/span'))

WebUI.click(findTestObject('Object Repository/Edit Fullname/Page_Town Square - Fit.hcmus Mattermost/button_Account Settings'))

WebUI.click(findTestObject('Object Repository/Edit Fullname/Page_Town Square - Fit.hcmus Mattermost/span_Edit'))

WebUI.setText(findTestObject('Object Repository/Edit Fullname/Page_Town Square - Fit.hcmus Mattermost/input_First Name_firstName'), 
    firstName)

WebUI.setText(findTestObject('Object Repository/Edit Fullname/Page_Town Square - Fit.hcmus Mattermost/input_Last Name_lastName'), 
    lastName)

WebUI.click(findTestObject('Object Repository/Edit Fullname/Page_Town Square - Fit.hcmus Mattermost/button_Save'))

WebUI.verifyElementPresent(findTestObject('Edit Fullname/Page_Town Square - Fit.hcmus Mattermost/span_General Settings'), 
    0)

WebUI.closeBrowser()

