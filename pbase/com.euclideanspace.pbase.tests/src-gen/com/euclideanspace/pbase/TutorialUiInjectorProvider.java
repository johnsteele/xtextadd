/*
* generated by Xtext
*/
package com.euclideanspace.pbase;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class TutorialUiInjectorProvider implements IInjectorProvider {
	
	public Injector getInjector() {
		return com.euclideanspace.pbase.ui.internal.TutorialActivator.getInstance().getInjector("com.euclideanspace.pbase.Tutorial");
	}
	
}