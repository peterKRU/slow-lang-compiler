package bytecode_generator;

import java.util.ArrayList;
import java.util.List;

public class ExpressionNormalizer {

	public static List<Integer> normalizeMethodDeclarations(List<Integer> translatedTokens) {

		List<Integer> normalizedTokens = new ArrayList<Integer>();

		for (int i = 0; i < translatedTokens.size() - 1; i++) {

			int currentToken = translatedTokens.get(i);
			int nextToken = translatedTokens.get(i + 1);

			normalizedTokens.add(currentToken);

			if (currentToken == Bytecodes.MDECL && Math.abs(nextToken) > Byte.MAX_VALUE) {

				int methodId = translatedTokens.get(++i);
				normalizedTokens.add(methodId);
				i++;

				int numArgs = translatedTokens.get(++i);
				normalizedTokens.add(numArgs);

				for (int j = 0; j < numArgs; j++) {

					i++;
					int parameter = translatedTokens.get(++i);
					normalizedTokens.add(parameter);
				}

			}

		}

		return normalizedTokens;
	}
}
