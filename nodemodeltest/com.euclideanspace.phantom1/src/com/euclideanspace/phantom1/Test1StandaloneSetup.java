/*
* generated by Xtext
*/
package com.euclideanspace.phantom1;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class Test1StandaloneSetup extends Test1StandaloneSetupGenerated{

	public static void doSetup() {
		new Test1StandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
