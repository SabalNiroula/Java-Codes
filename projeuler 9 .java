public class Main {
static long Getnum(long limit){
	double c;
		long answer = 0;	
 for(var a =3 ; a<limit;a++){
 for (var b = a+1; b<limit;a++){
 	c = Math.pow(a,2) + Math.pow(b,2);
 	c = Math.sqrt(c);
 	if((a+b+c) == limit){
 		answer =(long)(a*b*c);
 		break;
 	}
  }
 }
 return answer;
}
	public static void main(String[] args) {
	System.out.println(Getnum( 1000));	
	}
}