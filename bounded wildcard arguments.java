class Twod{
int p,q;
Twod(int a,int b){
  p = a;
  q = b;
  }	
}

class threed extends Twod{
int r;
threed(int a,int b,int c){
super( a,b);
r = c;
  }	
}

class fourd extends threed{
int t;

fourd(int a,int b,int c,int d ){
super( a, b, c);
t = d;
  }	
}

class Coordinate< C extends Twod > {
C[] cords;
 
Coordinate (C[] o){ cords = o;    }							
}

public class showCords {
	
static void showab(Coordinate<?> c){
System.out.println("PQ Coordinates :");
for(int i = 0;i<c.cords.length;i++)
System.out.println(c.cords[i].p + " "+ c.cords[i].q);
 System.out.println();
 	
}

static void showabc(Coordinate<? extends threed> c){
System.out.println("PQR Coordinates :");
for(int i = 0;i<c.cords.length;i++)
System.out.println(c.cords[i].p + " "+ c.cords[i].q + " "+ c.cords[i].r);
 System.out.println(); 	
}

static void showabcd(Coordinate<? extends fourd> c){
System.out.println("PQRT Coordinates :");
for(int i = 0;i<c.cords.length;i++)
System.out.println(c.cords[i].p + " "+ c.cords[i].q + " "+ c.cords[i].r+ " "+ c.cords[i].t);
 System.out.println(); 	
}


	public static void main(String[] args) {

Twod [] td = {
	new Twod(10,30),
	new Twod(50,60),
	new Twod(26,73),
 };
Coordinate<Twod> cin = new Coordinate<Twod>(td);
showab(cin);

								fourd [] fd = {
								new fourd(1,2,45,95),
new fourd(76,33,313,436),
new fourd(72,3,31,46)
								};
Coordinate<fourd> fin = new Coordinate<fourd>(fd);
																showab(fin);
showabc(fin);					showabcd(fin);				
	}
}