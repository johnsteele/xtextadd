/*
 * generated by Xtext
 */
package com.euclideanspace.xgener.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;

public class AbstractGenValidator extends org.eclipse.xtext.validation.AbstractDeclarativeValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(com.euclideanspace.xgener.gen.GenPackage.eINSTANCE);
		return result;
	}
}
