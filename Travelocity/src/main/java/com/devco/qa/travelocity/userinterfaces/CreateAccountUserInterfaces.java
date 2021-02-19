package com.devco.qa.travelocity.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class CreateAccountUserInterfaces extends PageObject{
	
	public static final Target OPTION_SIGN_IN = Target.the("Option Sign In").located(By.xpath("//div[contains(text(),'Sign in')]"));
	public static final Target OPTION_CREATE_ACCOUNT = Target.the("Option Create Account").located(By.xpath("//*[@id=\"gc-custom-header-nav-bar-acct-menu\"]/div/div[1]/div/div/a[2]"));
	
	public static final Target OPTION_NOT_ROBOT = Target.the("Option Not Robot").located(By.xpath("//*[@id=\"recaptcha-anchor\"]/div[1]"));
	public static final Target OPTION_HUMAN = Target.the("Option Human").located(By.xpath("//*[@id=\"verifyButton\"]/button"));
	
	public static final Target FIRST_NAME = Target.the("First Name").located(By.xpath("//*[@id=\"create-account-firstname\"]"));
	public static final Target LAST_NAME = Target.the("Last Name").located(By.xpath("//*[@id=\"create-account-lastname\"]"));
	public static final Target EMAIL = Target.the("Email").located(By.xpath("//*[@id=\"create-account-emailId\"]"));
	public static final Target PASSWORD = Target.the("Password").located(By.xpath("//*[@id=\"create-account-password\"]"));
	public static final Target CONFIRM_PASSWORD = Target.the("Confirm Password").located(By.xpath("//*[@id=\\\"create-account-confirm-password\\\"]"));
	
	public static final Target AGREE_TERMS = Target.the("Agree Terms").located(By.xpath("//*[@id=\"create-account-expedia-policy\"]"));
	public static final Target BTN_CREATE_ACCOUNT = Target.the("Button Create Account").located(By.xpath("//*[@id=\"create-account-submit-button\"]"));
	
	public static final Target LABEL_USER_CREATED = Target.the("Label User Created").located(By.xpath("/*[@id=\"gc-custom-header-nav-bar-acct-menu\"]/button/div"));
	

}
