Implementing Domain-Specific Languages with Xtext and Xtend
============================

This repository contains the sources of the Examples for the book  
*"Implementing Domain-Specific Languages with Xtext and Xtend"*  
ISBN: 978-1782160304

http://www.packtpub.com/implementing-domain-specific-languages-with-xtext-and-xtend/book

ERRATA and changes in new versions of Xtext
====

The book was written using Xtext 2.4.2 and some changes were introduced in new versions of Xtext that require some modifications in the sources (and make some parts written in the book not consistent).

In the following we detail the changes required to adapt the examples to the new versions of Xtext

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

The Xbase rule **XExpressionInsideBlock** has changed into **XExpressionOrVarDeclaration**.

Thus, the Xbase Expressions example's grammar now reads:

	ExpressionsModel returns XBlockExpression:
		{ExpressionsModel}
		(expressions+=XExpressionOrVarDeclaration)*;

## Xtext 2.7

Some methods in the JvmModelInferrer have been deprecated and should be updated in the examples as follows:

Instead of the following acceptor invocation

	acceptor.accept(entity.toClass("entities."+entity.name)).initializeLater [

You should now pass directly as the last argument a lambda expression

	acceptor.accept(entity.toClass("entities."+entity.name)) [

This method in the JvmTypesBuilder has been deprecated

	@Deprecated
	public JvmTypeReference newTypeRef(EObject ctx, Class<?> clazz, JvmTypeReference... typeArgs) {
		return references.getTypeForName(clazz, ctx, typeArgs);
	}

In the inferrer you should call directly 

	public JvmTypeReference typeRef(Class<?> clazz, JvmTypeReference... typeArgs) {

(So the EObject context is not required anymore).

For example, instead of

	entity.toMethod("toString", entity.newTypeRef(typeof(String)))

You should write (recall that typeof is not required anymore to specify a type literal):

	entity.toMethod("toString", typeRef(String))