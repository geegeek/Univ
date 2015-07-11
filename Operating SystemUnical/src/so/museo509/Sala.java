package so.museo509;

import java.util.concurrent.Semaphore;

/**
 * @author Maurizio Bilotta
 *
 */
public class Sala {

	private Semaphore possoEntrare;

	public Sala(int capienza) {
		possoEntrare = new Semaphore(capienza, true);
	}

	public void entra() throws InterruptedException {
		possoEntrare.acquire();
	}

	public void esci() {
		possoEntrare.release();
	}
}
