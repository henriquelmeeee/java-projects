package game;

public class uso_for {

	
	public static void main(String[] args) {
		
		for(int c = 0; c < 10; c++) {
			// c é 0, enquanto c for menor que 10, c + 1
			
			System.out.print(+c+"\n");
			
			if(c > 8) {
				
				System.out.println("10");
				System.out.println("Acabou!");
				System.out.println("Reiniciando...");
				System.out.println("Agora, partiremos do 5.");
				c = 5;
			if (c > 8) {
				
				System.out.println("10");
				System.out.println("Acabou!");
				System.out.println("Reiniciando...");
				System.out.println("Agora, partiremos do 8.");
				c = 8;
			if (c > 9) {
					
				System.out.println("Acabou!");
				break;
					
				}
				
			}
				
			}
			
		}
		
		
	}
}
