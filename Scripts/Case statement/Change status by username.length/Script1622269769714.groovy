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

WebUI.callTestCase(findTestCase('Internal/Login succeed'), [('username') : username, ('password') : password], FailureHandling.STOP_ON_FAILURE)

boolean cancelModal = WebUI.verifyElementNotPresent(findTestObject('Object Repository/Page_Town Square - hello Mattermost/button_cancelModalButton'), 20)
if(cancelModal == false){
	WebUI.click(findTestObject('Object Repository/Page_Town Square - hello Mattermost/button_cancelModalButton'));
}

int username_len = username.length();
String status;

if(username_len <= 5){
	status = "online"
}else if(username_len >= 10){
	status = "offline"
}else{
	status = "away"
}

WebUI.click(findTestObject('Object Repository/Page_Town Square - hello Mattermost/button_changeStatus'))
switch(status){
	case "online":
	WebUI.click(findTestObject('Object Repository/Page_Town Square - hello Mattermost/button_Online'))
	break;
	case "offline":
	WebUI.click(findTestObject('Object Repository/Page_Town Square - hello Mattermost/button_Offline'))
	break;
	case "away":
	WebUI.click(findTestObject('Object Repository/Page_Town Square - hello Mattermost/button_Away'))
	break;
}

WebUI.closeBrowser()
