package com.dataio;

import org.aeonbits.owner.Config;

@Config.Sources(value = "file:C:\\Users\\balaj\\eclipse-workspace\\Selenium_Framework\\src\\main\\resources\\Configurations.properties") // ${user.dir}/src/main/resources/Configurations.properties")
public interface FrameworkConfig extends Config {
	String Browser_name();

	String Tester_Name();
	
	String URL();

	String Login_URL();

	String User_MobileNumber();

	String Expected_String_Title();

	String ProductDetails();

	String ChromeDriver_Path();

	String Driver_Data();

	int Wait_time();
}
