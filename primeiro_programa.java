package game;

public class uso_for {

	
	public static void main(String[] args) {
		
		for(int c = 0; c < 10; c++) {
			
			System.out.print(+c+"\n");
			
			if(c > 8) {
				
				System.out.println("10");
				System.out.println("Acabou!");
				System.out.println("Reiniciando...");
				System.out.println("Agora, partiremos do 5.");
				int d = 5;
				c = d;
			if (d > 8) {
				
				System.out.println("10");
				System.out.println("Acabou!");
				System.out.println("Reiniciando...");
				System.out.println("Agora, partiremos do 8.");
				int e = 8;
				c = e;
			if (e > 9) {
					
				System.out.println("Acabou!");
				break;
					
				}
				
			}
				
			}
			
		}
		
		
	}
}
