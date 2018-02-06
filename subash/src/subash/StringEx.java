package subash;

public class StringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ss = "abfcz";
		char temp;
		char ch[]= ss.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			
			for (int j = 0; j < ch.length; j++) {
				
				if(ch[i]>ch[j])
				{
					temp = ch [i];
					ch[i] = ch[j];
					ch[j] = temp;
				}
			}
		}

		System.out.println(String.copyValueOf(ch));
	}

}
