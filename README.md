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



