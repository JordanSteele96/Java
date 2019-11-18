
public class Vowels {

	public static void main(String[] args) {
		int a = 0;
		int e = 0;
		int i = 0;
		int o = 0;
		int u = 0;
			
		String word = "Hello";
		if(word.contains("a")) {
			a++;
		}if(word.contains("e")){
			e++;
		}if(word.contains("i")) {
			i++;
		}if(word.contains("o")){
			o++;
		}if(word.contains("u")){
			u++;
		}
		System.out.print("A:"+ a + "\n" + "E:"+ e + "\n" +"I:"+ i + "\n" +"O:"+ o + "\n" +"U:"+u);
	}

}
