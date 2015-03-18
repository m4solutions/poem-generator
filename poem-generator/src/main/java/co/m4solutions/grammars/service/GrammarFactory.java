package co.m4solutions.grammars.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

import co.m4solutions.grammars.model.Grammar;
import co.m4solutions.grammars.model.Production;

public class GrammarFactory {

	public static Grammar buildGrammar(BufferedReader in) {
		
		Grammar grammar = new Grammar();
		grammar.setRules(new ArrayList<Production>());

		String line = null;
		try {
			while ((line = in.readLine()) != null) {
				Production production = ProductionFactory.buildProduction(line, grammar);
				if (grammar.getInitialProduction()==null){
					grammar.setInitialProduction(production);
				}else{
					grammar.getRules().add(production);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return grammar;
	}

}
