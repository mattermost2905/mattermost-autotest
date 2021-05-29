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

WebUI.setText(findTestObject('input_All team communication in one place s_2f2733'), 'username')

WebUI.setText(findTestObject('input_All team communication in one place s_703ef5'), 'password')

int length = username.length()

if (length > 5) {
    WebUI.click(findTestObject('Object Repository/Dark Theme If else/button_Sign in'))

    WebUI.click(findTestObject('Object Repository/Dark Theme If else/h1_eligendi'))

    WebUI.click(findTestObject('Object Repository/Dark Theme If else/button_Account Settings'))

    WebUI.click(findTestObject('Object Repository/Dark Theme If else/button_Display'))

    WebUI.click(findTestObject('Object Repository/Dark Theme If else/i_Theme_fa fa-pencil'))

    WebUI.click(findTestObject('Object Repository/Dark Theme If else/img_Organization_img-responsive'))

    WebUI.click(findTestObject('Object Repository/Dark Theme If else/button_Save'))
}

WebUI.closeBrowser()

