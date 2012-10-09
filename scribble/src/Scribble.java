import java.io.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.GnuParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionBuilder;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;

import org.scribble.ScribbleStandaloneSetup;
import org.scribble.projection.Projection;
import org.scribble.scribble.ScribbleProgram;
import org.scribble.validation.TypeChecker;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Diagnostic;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ExtensibleURIConverterImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.google.inject.Injector;


public class Scribble{

	@SuppressWarnings("static-access")
	public static void main(String[] args) throws IOException {

		// Initialize options for the parser
		final Options options = new Options();

		Option optSrcDir = OptionBuilder.withArgName("srcdir").withDescription("Model source directory").hasArg()
				.isRequired().withValueSeparator(' ').create("srcdir");

		Option optTargetDir = OptionBuilder.withArgName("targetdir").withDescription("Generator target directory").hasArg()
				.create("targetdir");

		options.addOption(optSrcDir);
		options.addOption(optTargetDir);

		// create the parser
		final CommandLineParser parser = new GnuParser();
		CommandLine line = null;
		try {
			line = parser.parse(options, args);
		} catch (final ParseException exp) {
			System.err.println("Parsing arguments failed.  Reason: " + exp.getMessage());
			wrongCall(options);
			return;
		}

		File file = new File(line.getOptionValue("srcdir"));

		//Parses the program in the current file and stores the result in the Projection structure
		Injector injector = new ScribbleStandaloneSetup().createInjectorAndDoEMFRegistration();
		XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
		resourceSet.setURIConverter(new ExtensibleURIConverterImpl());
		Resource res = resourceSet.getResource(URI.createFileURI(file.getAbsolutePath()), true);

		ScribbleProgram prog = (ScribbleProgram) res.getContents().get(0);


		//Initialize the projector
		Projection p = new Projection(file);
		TypeChecker typeChecker = new TypeChecker(prog);

		//Runs the type checker on the parsed file
		String info;
		if(res.getErrors().size()>0){
			info ="Syntax error(s) found during the parsing ";
			Iterator<Diagnostic> it = res.getErrors().iterator();
			while(it.hasNext()){
				Diagnostic d = it.next();
				System.out.println("Line "+d.getLine()+": "+d.getMessage());
			}
		}
		else {
			typeChecker.run();
			if(typeChecker.errorFound()){
				info ="Well Formedness error(s) found, unable to launch projection ";
				typeChecker.printErrors();
			}

			else {
				try{
					p.run(prog);
					info = "Projection terminated successfuly";
				}catch(Exception e){
					System.out.println(e.toString());
					info = "Error encountered during the projection process";
				} 
			}
		}

		System.out.println(info);


	}

	/**
	 * Print usage information and terminate the program.
	 *
	 * @param options
	 */
	private static void wrongCall(final Options options) {
		final HelpFormatter formatter = new HelpFormatter();
		formatter.printHelp("java " + Scribble.class.getName() + " [OPTIONS]", options);
		System.exit(-1);
	
	
	
	}
}
