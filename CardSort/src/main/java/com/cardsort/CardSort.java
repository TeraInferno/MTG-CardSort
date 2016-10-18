/**
 * 
 */
package com.cardsort;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.cardsort.util.ApiUtil;

/**
 * @author agrossnickle
 *
 */
public class CardSort {

	private static Options options;
	private static Log log = LogFactory.getLog(CardSort.class);

	
	public static void setupOptions()
	{
		options = new Options();
		
		Option inputFile = new Option("i", "input", true, "input file path");
		inputFile.setRequired(true);
		options.addOption(inputFile);
		
		Option sortCriteria = new Option("s", "criteria", true, "criteria to sort on");
		sortCriteria.setRequired(true);
		options.addOption(sortCriteria);	
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {	
		
		log.debug("Setting up CLI tooling...");
		setupOptions();
				
		CommandLineParser parser = new DefaultParser();
		HelpFormatter helpFormatter = new HelpFormatter();
		CommandLine cmdLine = null;
		
		try {
			cmdLine = parser.parse(options, args);			
		} catch (ParseException e) {
			log.error("Unable to parse options", e);
			helpFormatter.printHelp("CardSort", options);
			System.exit(1);
			return;
		}
		
		String inputFilePath = cmdLine.getOptionValue("input");
		String sortCriteria = cmdLine.getOptionValue("criteria");
						
		log.debug("Igniting App Engines...");
		AppCore core = new AppCore();
		core.addAppOption("file", inputFilePath);
		core.addAppOption("criteria", sortCriteria);
		
		core.execute();		
	}
}
