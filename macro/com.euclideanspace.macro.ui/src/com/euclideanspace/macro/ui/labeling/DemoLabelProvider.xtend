/**
* stub generated by Xtext
* @Author Martin Baker added content to Xtext stub
*/
package com.euclideanspace.macro.ui.labeling

import com.google.inject.Inject
import com.euclideanspace.macro.demo.Model
import com.euclideanspace.macro.demo.Recurse
import com.euclideanspace.macro.demo.MacroDef

/**
 * Provides labels for a EObjects.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#labelProvider
 */
class DemoLabelProvider extends org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider {

	@Inject
	new(org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider delegate) {
		super(delegate);
	}

 	def String text(Model ele) {
	  return "Model";
	}
	
 	def String text(MacroDef ele) {
	  return "Macro "+ele.mn;
	}

	def String text(Recurse ele) {
	  var String result = "Recurse";
	  try {
	    if (ele.n != null) {
	  	  for(String s:ele.n) {
	  	    result = result +" "+s;
	  	  }
	    }
	  } catch(Exception e){
	  	System.out.println("error "+e);
	  }
	  return result;
	}
}