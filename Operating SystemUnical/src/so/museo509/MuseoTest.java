package so.museo509;

/**
 * @author Maurizio Bilotta
 *
 */
public class MuseoTest {

	private static final int
					CAPIENZA_MUSEO = 500,
					CAPIENZA_SALA_B = 30,
					NUM_VISITATORI = 100;

	public static void main(String[] args) {
		Museo museo = new Museo(CAPIENZA_MUSEO, CAPIENZA_SALA_B);
	
		for (int i = 0; i < NUM_VISITATORI; i++) {
			new Thread(new Visitatore(museo)).start();
		}
	}

}
