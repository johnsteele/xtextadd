/*
* generated by Xtext
*/
package com.euclideanspace.macro;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class DemoUiInjectorProvider implements IInjectorProvider {
	
	public Injector getInjector() {
		return com.euclideanspace.macro.ui.internal.DemoActivator.getInstance().getInjector("com.euclideanspace.macro.Demo");
	}
	
}
