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

WebUI.setText(findTestObject('Object Repository/Invaild Usernmae Login/Page_Mattermost/input_All team communication in one place, _dcc84b'), 
    'abc123')

WebUI.setEncryptedText(findTestObject('Object Repository/Invaild Usernmae Login/Page_Mattermost/input_All team communication in one place, _a3edc6'), 
    'yZRAD0bxqP2s/8McVXSNng==')

WebUI.click(findTestObject('Object Repository/Invaild Usernmae Login/Page_Mattermost/span_Sign in'))

if (findTestObject('Object Repository/Page_Town Square - TestAuto-HCMUS/button__icon')) {
    WebUI.closeBrowser()
} else {
    WebUI.click(findTestObject('Object Repository/Invaild Usernmae Login/Page_Mattermost/input_All team communication in one place, _dcc84b'))

    WebUI.setText(findTestObject('Object Repository/Invaild Usernmae Login/Page_Mattermost/input_All team communication in one place, _dcc84b'), 
        'DangUyen')

    WebUI.setEncryptedText(findTestObject('Object Repository/Invaild Usernmae Login/Page_Mattermost/input_All team communication in one place, _a3edc6'), 
        '+VfHOy6+bcQvl3FyLJvOLg==')

    WebUI.click(findTestObject('Object Repository/Invaild Usernmae Login/Page_Mattermost/span_Sign in'))

    WebUI.closeBrowser()
}

