package lc028.str.str;

public class StringDetector {
	public int strStr(String haystack,String needle){
		
		String[] splited = haystack.split(needle);
		System.out.println(splited.length);
		for(String a: splited){
			System.out.println(a);
			
		}
		return 0;
		
		
	}

	
	public static void main(String[] args) {
		StringDetector sd = new StringDetector();
		sd.strStr("abcdefgh", "gh");
	}
	
	
}
