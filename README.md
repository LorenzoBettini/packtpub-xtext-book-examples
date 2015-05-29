Implementing Domain-Specific Languages with Xtext and Xtend
============================

This repository contains the sources of the Examples for the book  
*"Implementing Domain-Specific Languages with Xtext and Xtend"*  
ISBN: 978-1782160304

http://www.packtpub.com/implementing-domain-specific-languages-with-xtext-and-xtend/book

ERRATA and changes in new versions of Xtext
====

The book was written using Xtext 2.4.2 and some changes were introduced in new versions of Xtext that require some modifications in the sources (and make some parts written in the book not consistent).

In the following we detail the changes required to adapt the examples to the new versions of Xtext.

## General Book ERRATA

Some initial ERRATA, related to errors and typos in the text of the book can be found on the publisher web site: select "Support", search for the book, e.g., type "Xtext" and select the book title.  It should be possible to access it directly following [this link](https://www.packtpub.com/books/content/support/12928).

As reported in Issue https://github.com/LorenzoBettini/packtpub-xtext-book-examples/issues/1 in the ExpressionsTypeProvider and ExpressionsInterpreter xtend files, you get compilation errors "Cannot convert..." if you have only one dispatch method for an Expression class; as soon as you add another dispatch method, say, e.g., one for Variable, the error will go away, since a method accepting AbstractElement will be generated. 

## Xtext 2.4.3

Xtext 2.4.3 generates the .ecore (and the corresponding .genmodel) file in the directory model/generated underneath the project directory, and not in the src-gen folder.

This is due to a new generation fragment in the mwe2 file: instead of


	fragment = ecore.EcoreGeneratorFragment auto-inject {

(which is now deprecated) the following fragment is now used by default in new Xtext projects

	fragment = ecore.EMFGeneratorFragment auto-inject {

and this fragment generates the .ecore and the .genmodel files in the folder "model/generated"

## Xtext 2.5

To specify a type literal you can simply write its name: there's no need to use the keyword **typeof** anymore.

For example, instead of

	typeof(String)

you can simply write

	String

## Xtext 2.6


### Xbase

The Xbase rule **XExpressionInsideBlock** has changed into **XExpressionOrVarDeclaration**.

Thus, the Xbase Expressions example's grammar now reads:

	ExpressionsModel returns XBlockExpression:
		{ExpressionsModel}
		(expressions+=XExpressionOrVarDeclaration)*;

## Xtext 2.7

### Testing with CompilationTestHelper

The class **org.eclipse.xtext.xbase.compiler.CompilationTestHelper** (contained in the bundle _org.eclipse.xtext.xbase.junit_) requires additional bindings which are created by default when your grammar uses Xbase.  However, this class could be used also for testing code generation also in languages that do not use Xbase (this is the case in the book, Chapter 7, for the examples Entities and Expressions); see also [this discussion in the Xtext forum](https://www.eclipse.org/forums/index.php/t/807828/).

The symptom is this exception when running the Junit tests that use CompilationTestHelper

	com.google.inject.ConfigurationException: Guice configuration errors:
	
	1) No implementation for org.eclipse.xtend.lib.macro.file.MutableFileSystemSupport was bound.
	  while locating org.eclipse.xtend.lib.macro.file.MutableFileSystemSupport
	    for field at org.eclipse.xtext.generator.FileSystemSupportBasedFileSystemAccess.fileSystemSupport(Unknown Source)
	  while locating com.google.inject.Provider<org.eclipse.xtext.xbase.compiler.RegisteringFileSystemAccess>
	    for field at org.eclipse.xtext.xbase.compiler.CompilationTestHelper$Result.fileSystemAccessProvider(Unknown Source)
	  while locating com.google.inject.Provider<org.eclipse.xtext.xbase.compiler.CompilationTestHelper$Result>
	    for field at org.eclipse.xtext.xbase.compiler.CompilationTestHelper.resultProvider(Unknown Source)
	  while locating org.eclipse.xtext.xbase.compiler.CompilationTestHelper
	    for field at org.example.expressions.tests.ExpressionsGeneratorTest._compilationTestHelper(Unknown Source)
	  while locating org.example.expressions.tests.ExpressionsGeneratorTest

To solve this problem the missing bindings in languages that do not use Xbase must be added explicitly; there are two ways of solving this:

**1. Add the bindings in the runtime module of the language**

For example, for the Entities example, you must add the following bindings in the _EntitiesRuntimeModule_ (first, make sure you have the following dependencies in the MANIFEST.MF: _org.eclipse.xtend.lib.macro_ and _org.eclipse.xtext.xbase_):

```javascript
public class EntitiesRuntimeModule extends org.example.entities.AbstractEntitiesRuntimeModule {

    //... existing bindings

    // this is required only by the CompilationTestHelper since Xtext 2.7
    public Class<? extends org.eclipse.xtend.lib.macro.file.MutableFileSystemSupport> bindMutableFileSystemSupport() {
		return org.eclipse.xtext.xbase.file.JavaIOFileSystemSupport.class;
	}

    // this is required only by the CompilationTestHelper since Xtext 2.7
    public Class<? extends com.google.inject.Provider<org.eclipse.xtext.xbase.file.WorkspaceConfig>> provideWorkspaceConfig() {
		return org.eclipse.xtext.xbase.file.RuntimeWorkspaceConfigProvider.class;
	}
} 
```

**2. Add the bindings in a custom InjectorProvider in the tests project**

If you do not want to add these bindings in the main DSL runtime module (after all, you need them only for testing), you can create a custom injector provider in the tests project (inheriting from the generated one in src-gen folder) to be used only for the test(s) that use CompilationTestHelper.  This custom injector provider must define a custom Guice module, inheriting from the DSL main module, and provide the additional bindings.

For example, for the Expressions example, you must add the following class in the test project (first, make sure you have the following dependencies in the MANIFEST.MF: _org.eclipse.xtend.lib.macro_ and _org.eclipse.xtext.xbase_):

```javascript
package org.example.expressions.tests;

import org.example.expressions.ExpressionsInjectorProvider;
import org.example.expressions.ExpressionsRuntimeModule;
import org.example.expressions.ExpressionsStandaloneSetup;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class ExpressionsInjectorProviderCustom extends ExpressionsInjectorProvider {

	@Override
	protected Injector internalCreateInjector() {
		return new ExpressionsStandaloneSetup() {
			@Override
			public Injector createInjector() {
				return Guice.createInjector(new ExpressionsRuntimeModule() {
					// this is required only by the CompilationTestHelper since
					// Xtext 2.7
					@SuppressWarnings("unused")
					public Class<? extends org.eclipse.xtend.lib.macro.file.MutableFileSystemSupport> bindMutableFileSystemSupport() {
						return org.eclipse.xtext.xbase.file.JavaIOFileSystemSupport.class;
					}

					// this is required only by the CompilationTestHelper since
					// Xtext 2.7
					@SuppressWarnings("unused")
					public Class<? extends com.google.inject.Provider<org.eclipse.xtext.xbase.file.WorkspaceConfig>> provideWorkspaceConfig() {
						return org.eclipse.xtext.xbase.file.RuntimeWorkspaceConfigProvider.class;
					}
				});
			}
		}.createInjectorAndDoEMFRegistration();
	}
}
```

And then you must use this injector provider in the @InjectWith annotation of the test that uses CompilationTestHelper; in this example:

```javascript
@RunWith(typeof(XtextRunner))
@InjectWith(typeof(ExpressionsInjectorProviderCustom))
class ExpressionsGeneratorTest {
	
	@Inject extension CompilationTestHelper
	...
```


### Inject Xtext TemporaryFolder when using CompilationTestHelper

This is not a strict requirement, but Xtext 2.7 introduced an improved version of _TemporaryFolder_ (see org.junit.rules.TemporaryFolder), it "allows creation of files and folders that are guaranteed to be deleted when the test method finishes (whether it passes or fails)".

If you want to use this improved version, you need to inject it with the @Rule annotation, e.g.,

```javascript
import org.eclipse.xtext.junit4.TemporaryFolder

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(EntitiesInjectorProvider))
class EntitiesGeneratorTest {
	
	@Rule
	@Inject public TemporaryFolder temporaryFolder
	
	@Inject extension CompilationTestHelper
	...
```

### Model inferrer in Xbase

Some methods in the JvmModelInferrer have been deprecated and should be updated in the examples as follows:

Instead of the following acceptor invocation

	acceptor.accept(entity.toClass("entities."+entity.name)).initializeLater [

You should now pass directly as the last argument a lambda expression

	acceptor.accept(entity.toClass("entities."+entity.name)) [

This method in the JvmTypesBuilder has been deprecated

```javascript
@Deprecated
public JvmTypeReference newTypeRef(EObject ctx, Class<?> clazz, JvmTypeReference... typeArgs) {
	return references.getTypeForName(clazz, ctx, typeArgs);
}
```

In the inferrer you should call directly 

```javascript
public JvmTypeReference typeRef(Class<?> clazz, JvmTypeReference... typeArgs) {
```

(So the EObject context is not required anymore).

For example, instead of

	entity.toMethod("toString", entity.newTypeRef(typeof(String)))

You should write (recall that typeof is not required anymore to specify a type literal):

	entity.toMethod("toString", typeRef(String))

### Xtext Buckminster Wizard

This wizard provided by Xtext was not updated and it generates the projects-platform.rmap incorrectly (see also [this forum post](https://www.eclipse.org/forums/index.php/t/811323/)); the quickiest way to fix it is to change the property _eclipse.target.platform_ from _juno_ (or _kepler_) to _luna_ so that the new version of EMF, required by Xtext 2.7, will be found in the Luna update site. 

Moreover, recently, another architecture fragment has been introduced, "pcc64le", which is only available from the "Luna Updates" site, not from the main "Luna Releases"; you should then update the target plaform RMAP in order to use also the eclipse/updates/4.4 update site
(see the updated [projects-platform.rmap](https://github.com/LorenzoBettini/packtpub-xtext-book-examples/blob/master/org.example.build.hello.buckminster/projects-platform.rmap "projects-platform.rmap") file in the org.example.build.hello.buckminster example).

The sympthom of this problem is this error during target platform resolution:

```
ERROR   [0007] : No suitable provider for component 
org.eclipse.core.filesystem.linux.ppc64le:osgi.bundle/[1.4.0.v20140808-1353,1.4.0.v20140808-1353]
    (&(target.arch=ppc64le)(target.os=linux))
    was found in resourceMap ... projects-platform.rmap
```

## Xtext 2.8

All Xtext plug-ins now require JavaSE-1.6 as execution environment.  If you start from scratch new Xtext projects, you don't have to worry about that.  However, if you had previously created Xtext projects, you need to adjust them all so that at least JavaSE-1.6 is specified as the execution environment.

You can do that with a Search-Replace in the workspace:

- in the files org.eclipse.jdt.core.prefs you need to replace 1.5 with 1.6
- in MANIFEST.MF and .classpath files you need to replace J2SE-1.5 with JavaSE-1.6

Running the mwe2 workflows requires in the classpath.  Again, if you start from scratch new Xtext projects, you don't have to worry about that.  Otherwise, you will experience such errors when running the mwe2 workflow

```
Could not load class: org.eclipse.core.runtime.OperationCanceledException
Add org.eclipse.equinox.common to the class path.
```

To solve this, just add org.eclipse.equinox.common as dependency in your DSL main project.

Just like with every new version of Xtext, please run mwe2 to re-generate all the artifacts, and make sure to merge the plugin.xml with the plugin.xml_gen.
