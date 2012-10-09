package org.scribble.ui.handlers;

import org.scribble.validation.TypeChecker;

import java.io.File;

import org.scribble.projection.Projection;
import org.scribble.scribble.ScribbleProgram;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;

public class ProjectionHandler extends AbstractHandler {
	
	public ProjectionHandler(){
		
	}

	public Object execute(ExecutionEvent event) throws ExecutionException {
		final IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		IEditorPart e = HandlerUtil.getActiveEditor(event);
		final XtextEditor editor = (XtextEditor) e;
		editor.getDocument().readOnly( new IUnitOfWork.Void<XtextResource>() {
			public void process(XtextResource resource) {
				
				File srcGenDirectory =
						new File(
							editor.getResource().getWorkspace().getRoot().getLocation().toOSString()
							+
							editor.getResource().getFullPath().toOSString()

								);
				//Initialize the projector
					Projection p = new Projection( srcGenDirectory );
				//Parses the program in the current file and stores the result in the Projection structure
					ScribbleProgram prog = (ScribbleProgram) resource.getParseResult().getRootASTElement();
					
					String info;
					TypeChecker typeChecker = new TypeChecker(prog);
					typeChecker.run();
					
					if(typeChecker.errorFound()){
						info ="Well Formedness error(s) found, unable to launch projection ";
					} else {
					try{
					p.run(prog);
					info = "Projection terminated successfuly";
					}catch(Exception e){
						System.out.println(e.toString());
						info = "Error encountered during the projection process";
					} }
					MessageDialog.openInformation(window.getShell(),"scribble.ui",info);
				
			}
		});
	return null;
	}
	

}
