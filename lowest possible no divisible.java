public class Main {
	
static Long recieve (Long c){
	Long ans = 1l;
	for(Long i = 1l;c>=i;i++) {
	
    ans =  ( ans*i ) / (gcd(ans,i));   
	}
	return ans;
}
		
static Long gcd(Long a,Long b){
	if (a%b==0)
	return b;
	else return gcd(b,a%b);
}

	public static void main(String[] args) {
	
 
	System.out.println(recieve(20l));	
	}
} // LOWEST POSSIBLE NO DIVISIBLE FROM 1 TO N.
//PROJECT EULER 5 QUESTION.