package compiler;

import java.util.Objects;

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

	@Override
	public int hashCode() {
		return Objects.hash(type, value);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ParsedToken other = (ParsedToken) obj;
		return Objects.equals(type, other.type) && Objects.equals(value, other.value);
	}

}
