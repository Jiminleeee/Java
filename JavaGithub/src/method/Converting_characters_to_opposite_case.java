package method;

public class Converting_characters_to_opposite_case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String line = "heLLO";
		char[] chars = line.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			if (chars[i] >= 97) {
				chars[i] -= 32;
			} else {
				chars[i] += 32;
			}
			System.out.println(chars[i]);
		}

	}

}
