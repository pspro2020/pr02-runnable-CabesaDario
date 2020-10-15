package iniciacionHilosDos;



public class Potencias {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 10; i++) {
			Thread hilosPotencia = new Thread(new Power(i));
			if (i%2 == 0) {
				hilosPotencia.setPriority(Thread.MAX_PRIORITY);
			}else {
				hilosPotencia.setPriority(Thread.MIN_PRIORITY);
			}
			
			
			
			hilosPotencia.start();
			
		}

	}

}
