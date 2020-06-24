
public class Loops {

	public static void main(String[] args) {
	
		int x = 0;
		int y = 100;
		
		System.out.println("----While Loop 1----");
		while (x <= 100) {
			
			System.out.println(x);
			x += 2;
		}
	
		System.out.println("----While Loop 2----");
		while (y >= 0) {
			
			System.out.println(y);
			y -= 3;
		}
	
		System.out.println("----For Loop 1----");
		for (int i = 1; i <= 100; i += 2) {
			System.out.println(i);
		}
			
		System.out.println("----For Loop 2----");
		for (int i = 1; i <= 100; i ++) {
			
			if ((i % 3 == 0) && (i % 5 == 0)) {
				System.out.println("Hello World");
				
			} else if (i % 5 == 0) {
			System.out.println("World");
			
			} else if (i % 3 == 0) {
				System.out.println("Hello");
			}
			else {
				System.out.println(i);
			}
			
		}

		
		
		
		
	}

}
