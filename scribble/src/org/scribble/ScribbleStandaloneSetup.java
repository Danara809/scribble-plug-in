
package org.scribble;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class ScribbleStandaloneSetup extends ScribbleStandaloneSetupGenerated{

	public static void doSetup() {
		new ScribbleStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

