package mldn;
public class mldn_01 {
	public static void main(String args[]){
		String str="abcabc33abcfsss";
		str.replaceAll("a", "-");
		str.replaceAll("b", "");
		str.replaceAll("3", "");
		System.out.println(str);
	}
}
