package jun29;

class MorseConverter
{
	public static void main(String[] args) 
	{
		if (args.length !=1) {
			System.out.println("usage: java MorseConverter WORD");
			System.exit(0);  // ���α׷��� �����Ѵ�.
		}

		System.out.println("source:"+ args[0]);
		String source = args[0].toUpperCase(); // �빮�ڷ� ��ȯ�Ѵ�.
		
		String[] morse = {".-", "-...", "-.-.","-..", "."
						,"..-.", "--.", "....","..",".---"
						, "-.-", ".-..", "--", "-.", "---"
						, ".--.", "--.-",".-.","...","-"
						, "..-", "...-", ".--", "-..-","-.--"
						, "--.." };
		String result="";

		for (int i=0; i < source.length() ; i++ ) {
			result+=morse[source.charAt(i)-'A'];
		}
		
		System.out.println("morse:"+result);
	}
}