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

WebUI.setText(findTestObject('Object Repository/Create_A_New_Team/Page_Mattermost/input_All team communication in one place, _dcc84b'), 
    'mattermost')

WebUI.setEncryptedText(findTestObject('Object Repository/Create_A_New_Team/Page_Mattermost/input_All team communication in one place, _a3edc6'), 
    'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.click(findTestObject('Object Repository/Create_A_New_Team/Page_Mattermost/span_Sign in'))

WebUI.click(findTestObject('Object Repository/Create_A_New_Team/Page_Town Square - css Mattermost/svg'))

WebUI.click(findTestObject('Object Repository/Create_A_New_Team/Page_Town Square - css Mattermost/a_Create a Team'))

WebUI.setText(findTestObject('Object Repository/Create_A_New_Team/Page_Town Square - css Mattermost/input_Team Name_teamNameInput'), 
    'mattermost')

WebUI.click(findTestObject('Object Repository/Create_A_New_Team/Page_Town Square - css Mattermost/span_Next'))

WebUI.click(findTestObject('Object Repository/Create_A_New_Team/Page_Town Square - css Mattermost/input_httpsmattermost-autotest.herokuapp.co_ae0a1e'))

WebUI.click(findTestObject('Object Repository/Create_A_New_Team/Page_Town Square - css Mattermost/span_Finish'))

if (findTestObject('Create_A_New_Team/Page_Town Square - python Mattermost/label_A team with that name already exists')) {
    WebUI.click(findTestObject('Object Repository/Create_A_New_Team/Page_Town Square - css Mattermost/input_httpsmattermost-autotest.herokuapp.co_ae0a1e'))

    WebUI.setText(findTestObject('Object Repository/Create_A_New_Team/Page_Town Square - css Mattermost/input_httpsmattermost-autotest.herokuapp.co_ae0a1e'), 
        'mattermost-mattermost')

    WebUI.click(findTestObject('Object Repository/Create_A_New_Team/Page_Town Square - css Mattermost/span_Finish'))

    WebUI.closeBrowser()
}

