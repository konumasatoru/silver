public class Main {
	public static void main(String[] args) {
		String s = "Java 17";
		s.append(" Silver");
		int length = s.length();
		int index = s.indexOf("Gold");
		System.out.println(length + " : " + index);
	}
}
// appendはStringに対応していないため、Stringbuilderでオブジェクト作ってからappendしてtoStringで変換する。