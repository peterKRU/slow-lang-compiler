package bytecode_generator;

import java.util.List;

import compiler.ParsedToken;

public interface BytecodeCompiler {
	
	public int[] compileBytecode(List<ParsedToken> parsedTokens);
}
