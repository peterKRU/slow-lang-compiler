package bytecode_generator;

import java.util.List;

import compiler.ParsedToken;

public interface TokenTranslator {
	
	public List<Integer> translateTokens(List<ParsedToken> parsedTokens);
}
