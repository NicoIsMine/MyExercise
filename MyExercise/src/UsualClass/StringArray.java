package UsualClass;

public class StringArray {

	public static void main(String[] args) {
		String[] s = new String[5];
		s[0] = "fewwfew";
		s[1] = "fef";
		for (int i = 0; i < s.length; i++) {
			if(s[i]!=null||s[i]!=""){
				System.out.print("1");
			}
//			else{
//				System.out.println("0");
//			}
		}
		System.out.println(s.length);
	}
}
