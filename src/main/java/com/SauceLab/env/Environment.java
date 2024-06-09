package com.SauceLab.env;

public enum Environment {

	DEV("https://naveenautomationlabsdev.com/opencart/index.php?route=account/login"),
	STAGE("https://naveenautomationlabsstage.com/opencart/index.php?route=account/login"),
	PROD("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

	String envUrl;

	Environment(String envUrl) {
		this.envUrl = envUrl;
	}

	public String getEnvUrl() {
		return envUrl;
	}
	
	

}