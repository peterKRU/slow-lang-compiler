package compiler;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNodeImpl;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import bytecode_generator.Vocabulary;

public class ParseTreeToJsonConverter {

	private static final Gson PRETTY_PRINT_GSON = new GsonBuilder().setPrettyPrinting().create();
	private static final Gson GSON = new Gson();
	private static final String[] VOCABULARY_INDEXED_TABLE = Vocabulary.TOKEN_NAMES;

	public static String convertToJson(ParseTree tree) {
		return convertToJson(tree, true);
	}

	private static Map<String, Object> convertToMap(ParseTree tree) {
		Map<String, Object> map = new LinkedHashMap<>();
		traverse(tree, map);
		return map;
	}

	private static void traverse(ParseTree tree, Map<String, Object> map) {

		if (tree instanceof TerminalNodeImpl) {

			Token token = ((TerminalNodeImpl) tree).getSymbol();

			if (token.getType() == -1) {
				map.put("type", "EOF");
				map.put("value", "NULL");
			} else {
				map.put("type", VOCABULARY_INDEXED_TABLE[token.getType()]);
				map.put("value", token.getText());
			}
		} else {
			List<Map<String, Object>> children = new ArrayList<>();
			String name = tree.getClass().getSimpleName().replaceAll("Context$", "");
			map.put(Character.toLowerCase(name.charAt(0)) + name.substring(1), children);

			for (int i = 0; i < tree.getChildCount(); i++) {
				Map<String, Object> nested = new LinkedHashMap<>();
				children.add(nested);
				traverse(tree.getChild(i), nested);
			}
		}
	}

	private static String convertToJson(ParseTree tree, boolean prettyPrint) {

		return prettyPrint ? PRETTY_PRINT_GSON.toJson(convertToMap(tree)) : GSON.toJson(convertToMap(tree));
	}

}
