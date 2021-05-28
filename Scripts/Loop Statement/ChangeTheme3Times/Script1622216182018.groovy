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

WebUI.navigateToUrl('https://mattermost-autotest.herokuapp.com/testauto-hcmus/channels/town-square')

WebUI.callTestCase(findTestCase('Internal/Login'), [:], FailureHandling.STOP_ON_FAILURE)

for (i = 0; i < 3; i += 1) {
    WebUI.click(findTestObject('Page_Town Square - TestAuto-HCMUS Mattermost/button_menu_icon'), FailureHandling.STOP_ON_FAILURE)

    WebUI.click(findTestObject('Page_Town Square - TestAuto-HCMUS Mattermost/button_Account Settings'), FailureHandling.STOP_ON_FAILURE)

    WebUI.click(findTestObject('Page_Town Square - TestAuto-HCMUS Mattermost/button_Display'))

    WebUI.click(findTestObject('Page_Town Square - TestAuto-HCMUS Mattermost/button_Edit_theme'))

    if ((i % 2) == 0) {
        WebUI.click(findTestObject('Page_Town Square - TestAuto-HCMUS Mattermost/img_organization_theme'))
    } else {
        WebUI.click(findTestObject('Page_Town Square - TestAuto-HCMUS Mattermost/img_window_dark_theme'))
    }
    
    WebUI.click(findTestObject('Page_Town Square - TestAuto-HCMUS Mattermost/button_Save_theme'))

    WebUI.click(findTestObject('Page_Town Square - TestAuto-HCMUS Mattermost/button_Close_account_setting'))
}

