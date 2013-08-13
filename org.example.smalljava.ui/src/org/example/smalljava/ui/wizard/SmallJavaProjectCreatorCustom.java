package org.example.smalljava.ui.wizard;

import java.util.List;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;

public class SmallJavaProjectCreatorCustom extends SmallJavaProjectCreator {

	@Override
	protected List<String> getAllFolders() {
		return ImmutableList.of(SRC_ROOT);
	}
	
	@Override
	protected List<String> getRequiredBundles() {
		return Lists.newArrayList(
				"org.eclipse.core.runtime",
				"org.eclipse.ui",
				DSL_GENERATOR_PROJECT_NAME);
	}
}
