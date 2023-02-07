package bytecode_generator;

import java.util.List;

import compiler.ParsedToken;

public interface BytecodeCompiler {
	
	public byte[] compileBytecode(List<ParsedToken> parsedTokens);
}
