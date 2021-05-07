package fr.francois.fibo;

public class Fibo {

	public static void main(String[] args) {
		fibo(0);

	}
public static void fibo(int n) {
		
		boolean isOk = false;
		int[] fib = {1,1,2,3,5,8,13,21};
		for(int i = 1; i <= fib.length; i++) {
			if(n == i) {
				n -= 1;
				isOk = true;
			}
		}
		if(isOk) {
			System.out.println(fib[n]);
		}else {
			System.out.println("ce n'est pas possible");
		}
		
	}
}
