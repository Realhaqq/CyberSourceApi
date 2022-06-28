package Data;

import java.util.Properties;

public class Configuration {
	static String RUN_ENVIRONMENT = "apitest.cybersource.com";
	static String MERCHANT_ID = "esd000000026463";
	static String KEYS_DIRECTORY = "/Users/digitalventures/IdeaProjects/untitled/src/main/resources";

	public static Properties getMerchantDetails() {
		Properties props = new Properties();
		props.setProperty("runEnvironment", RUN_ENVIRONMENT);
		props.setProperty("authenticationType", "Jwt");
		props.setProperty("merchantID", MERCHANT_ID);
		props.setProperty("keyAlias", MERCHANT_ID);
		props.setProperty("keyPassword", MERCHANT_ID);
		props.setProperty("keyPass", MERCHANT_ID);
		props.setProperty("keyFileName", MERCHANT_ID);
		props.setProperty("keysDirectory", KEYS_DIRECTORY);
		props.setProperty("useMetaKey", "false");
		props.setProperty("enableClientCert", "false");
		return props;
	}
	public static Properties getAlternativeMerchantDetails() {
		Properties props = new Properties();
		props.setProperty("runEnvironment", RUN_ENVIRONMENT);
		props.setProperty("authenticationType", "Jwt");
		props.setProperty("merchantID", MERCHANT_ID);
		props.setProperty("keyAlias", MERCHANT_ID);
		props.setProperty("keyPassword", MERCHANT_ID);
		props.setProperty("keyPass", MERCHANT_ID);
		props.setProperty("keyFileName", MERCHANT_ID);
		props.setProperty("keysDirectory", KEYS_DIRECTORY);
		props.setProperty("useMetaKey", "false");
		props.setProperty("enableClientCert", "false");
		return props;
	}
}
