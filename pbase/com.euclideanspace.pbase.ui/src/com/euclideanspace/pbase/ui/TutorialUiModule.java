/*
 * generated by Xtext
 */
package com.euclideanspace.pbase.ui;

import org.eclipse.ui.plugin.AbstractUIPlugin;

/**
 * Use this class to register components to be used within the IDE.
 */
public class TutorialUiModule extends com.euclideanspace.pbase.ui.AbstractTutorialUiModule {
	public TutorialUiModule(AbstractUIPlugin plugin) {
		super(plugin);
	}

	public Class<? extends org.eclipse.xtext.ui.editor.contentassist.antlr.IContentAssistParser> bindIContentAssistParser() {
		return com.euclideanspace.pbase.ui.TutorialUIParser.class;
	}
}
