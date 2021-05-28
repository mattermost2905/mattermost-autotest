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

WebUI.callTestCase(findTestCase('Login successfully'), [('username') : '', ('password') : ''], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Create a team (Call testcase)/span'))

WebUI.click(findTestObject('Create a team (Call testcase)/a_Create a Team'))

WebUI.setText(findTestObject('Create a team (Call testcase)/input_Team Name_teamNameInput'), 'mattermost')

WebUI.click(findTestObject('Create a team (Call testcase)/span_Next'))

WebUI.setText(findTestObject('Create a team (Call testcase)/input_httpsmattermost-autotest.herokuapp.co_ae0a1e'), 'hcmus')

WebUI.click(findTestObject('Create a team (Call testcase)/span_Finish'))

WebUI.closeBrowser()

