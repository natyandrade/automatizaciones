package com.devco.qa.travelocity.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class SignInUserInterfaces extends PageObject{
	
	public static final Target BTN_SIGN_IN = Target.the("Button Sign In").located(By.xpath("//*[@id=\"gc-custom-header-nav-bar-acct-menu\"]/div/div[1]/div/div/a[1]"));
	public static final Target USER = Target.the("User").located(By.xpath("//*[@id=\"signin-loginid\"]"));
	public static final Target PASSWORD = Target.the("Password").located(By.xpath("//*[@id=\"signin-password\"]"));
	public static final Target BTN_SIGN_IN_ACCEPT = Target.the("Button Sign In Accept").located(By.xpath("//*[@id=\"submitButton\"]"));
	
	public static final Target LABEL_USER = Target.the("Label User").located(By.xpath("//*[@id=\"gc-custom-header-nav-bar-acct-menu\"]/button/div"));
	
}
