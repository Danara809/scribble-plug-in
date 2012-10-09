package org.scribble.validation;

import org.eclipse.xtext.validation.Check;
import org.scribble.scribble.GlobalInteractionBlock;
import org.scribble.scribble.Message;
import org.scribble.scribble.ScribblePackage;
import org.scribble.scribble.ScribbleProgram;
 

public class ScribbleJavaValidator extends AbstractScribbleJavaValidator {

/*Performs basic wellformedness checking
 * 
 * Typechecker is called for more complex verifications:
 * - roles are defined
 * - inheritance is correct
 */
	
	@Check
	public void checkScribbleProgram( ScribbleProgram program )
	{
		TypeChecker t = new TypeChecker( program, this );
		t.run();
	}
	
	
}
