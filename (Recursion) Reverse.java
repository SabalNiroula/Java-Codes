public class Main {
	
static String rev(String s,int l){
	if(l==0) return ""+s.charAt(0);
	
	else return s.charAt(l)+""+rev(s,l-1);
	
}
	
	public static void main(String[] args) {
		
String s = "sabal";
System.out.println(rev(s,s.length()-1));
				
	}
}