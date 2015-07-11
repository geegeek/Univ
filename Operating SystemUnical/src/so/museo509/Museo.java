package so.museo509;


/**
 * @author Maurizio Bilotta
 *
 */
public class Museo extends Sala {

	private Sala salaA;
	private Sala salaB;

	public Museo(int capienza, int capienzaSalaB) {
		super(capienza);
		salaA = new Sala(capienza);
		salaB = new Sala(capienzaSalaB);
	}

	public Sala getSalaA() {
		return salaA;
	}

	public Sala getSalaB() {
		return salaB;
	}
}
