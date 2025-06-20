package Random_test_practice;
//splitting of words in a sentance with the delimiter
public class Count_word {
	public static void main(String[] args) {
		String s="This is a-sample-buddy-don't worry";
		for(String a:s.split("-")) {
			System.out.println(a);
		}
		
	}
}
