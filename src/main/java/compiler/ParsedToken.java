package compiler;

public class ParsedToken {

	private String type;
	private String value;

	public ParsedToken(String type, String value) {

		this.type = type;
		this.value = value;
	}

	public String getType() {
		return type;
	}

	public String getValue() {
		return value;
	}

	public void addModifier(String modifier) {

		value = modifier + value;
	}

	@Override
	public String toString() {
		return "[" + type + " : " + value + "]";
	}

}
