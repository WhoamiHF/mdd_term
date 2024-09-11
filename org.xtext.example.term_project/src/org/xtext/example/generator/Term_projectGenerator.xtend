/*
 * generated by Xtext 2.32.0
 */
package org.xtext.example.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class Term_projectGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		System.out.println("Starting..");
		fsa.generateFile('statements.txt', 'Statements to process: ');
			/*resource.allContents
				.filter(Team_goal_or_task)
				.map[name]
				.join(', '))*/
	}
}
