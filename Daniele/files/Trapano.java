package files;

import java.io.Serializable;

public class Trapano implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static final boolean FORWARD = true;
	public static final boolean REVERSE = false;
	public static final int SPEED_LIMIT = 10000;
	public static final int STEP = 500;

	private int numeroGiri = 0;
	private boolean direction = FORWARD;

	public void incrementaVelocità() {
		numeroGiri += STEP;
		if (numeroGiri > SPEED_LIMIT)
			numeroGiri = 0;
	}

	public void decrementaVelocità() {
		numeroGiri -= STEP;
		if (numeroGiri < 0)
			numeroGiri = 0;
	}

	public void stop() {
		numeroGiri = 0;
	}

	public boolean isActive() {
		return numeroGiri > 0;
	}

	public boolean isStopped() {
		return !isActive();
	}

	public void setDirection(boolean direction) {
		this.direction = direction;
	}

	@Override
	public String toString() {
		return "Trapano [numeroGiri=" + numeroGiri + ", direction=" + decodeDirection() + "]";
	}

	private String decodeDirection() {
		return this.direction ? "FORWARD" : "REVERSE";
	}

}
