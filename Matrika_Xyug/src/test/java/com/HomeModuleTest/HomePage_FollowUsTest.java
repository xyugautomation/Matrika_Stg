package com.HomeModuleTest;

import org.testng.annotations.Test;

import com.Base.BeforeLoginBase;

import Com.HomeModule.HomePage_FollowUs;

public class HomePage_FollowUsTest extends BeforeLoginBase {

	@Test(priority = 1)
	public void test_NavigationToFollowUsFacebook() throws InterruptedException {
		HomePage_FollowUs HP = new HomePage_FollowUs(driver);
		HP.FollowUsFacebookButton(driver);

	}

	@Test(priority = 2)
	public void test_NavigationToFollowUsInstagram() throws InterruptedException {
		HomePage_FollowUs HP = new HomePage_FollowUs(driver);
		HP.FollowUsInstagramButton(driver);

	}

	@Test(priority = 3)
	public void test_NavigationToFollowUsYoutube() throws InterruptedException {
		HomePage_FollowUs HP = new HomePage_FollowUs(driver);
		HP.FollowUsYoutubeButton(driver);

	}

	@Test(priority = 4)
	public void test_NavigationToFollowUsLinked() throws InterruptedException {
		HomePage_FollowUs HP = new HomePage_FollowUs(driver);
		HP.FollowUsLinkedinButton(driver);

	}

	@Test(priority = 5)
	public void test_NavigationToFollowUsTwitter() throws InterruptedException {
		HomePage_FollowUs HP = new HomePage_FollowUs(driver);
		HP.FollowUsTwitterButton(driver);
	}

	@Test(priority = 6)
	public void test_NavigationToFollowUspinterest() throws InterruptedException {
		HomePage_FollowUs HP = new HomePage_FollowUs(driver);
		HP.FollowUspinterestButton(driver);
	}

}
