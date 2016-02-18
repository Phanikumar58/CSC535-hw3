
public class processExpression {
	public static void main(String[] args)
	{
		void moveToNextChar() {
			currentChar = (++position < expression.length()) ? expression
					.charAt(position) : -1;
		}

		void ignoreWhitespace() {
			while (Character.isWhitespace(currentChar))
				moveToNextChar();
		Integer parse() {
			moveToNextChar(); //initially set to -1, now moving to first character
			Integer value = parseExpression();
			if (currentChar != -1)
				throw new RuntimeException("Unexpected: "
						+ (char) currentChar);
			return value;
		}
		
	}

}
