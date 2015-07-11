package so.museo509;

import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 * @author Maurizio Bilotta
 *
 */
public class Visitatore implements Runnable {

	private Museo museo;
	private Random r = new Random();

	private static final int
			MIN_TEMPO_SALA = 3,
			MAX_TEMPO_SALA = 10;

	public Visitatore(Museo museo) {
		this.museo = museo;
	}

	@Override
	public void run() {
		try {
			museo.entra();

			Sala salaA = museo.getSalaA();
			salaA.entra();
			visitaSala();
			salaA.esci();

			Sala salaB = museo.getSalaB();
			salaB.entra();
			visitaSala();
			salaB.esci();

			museo.esci();
		} catch (InterruptedException e) {}
	}

	private void visitaSala() throws InterruptedException {
		attendi(MIN_TEMPO_SALA, MAX_TEMPO_SALA);
	}

	private void attendi(int min, int max) throws InterruptedException {
		TimeUnit.MINUTES.sleep(r.nextInt(max - min + 1) + min);
	}
}
