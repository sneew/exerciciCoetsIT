package itExerciciRockets;

public class Thruster implements Runnable{
	private int maxPower;
	private int currentPower;
	private int targetPower;
	
	public Thruster() {
		super();
	}	

	public Thruster(int maxPower) {
		super();
		this.maxPower = maxPower;
		this.currentPower = 0;
		this.targetPower = 0;
	}

	public int getTargetPower() {
		return targetPower;
	}

	public void setTargetPower(int targetPower) {
		this.targetPower = targetPower;
	}

	public int getMaxPower() {
		return maxPower;
	}

	public void setMaxPower(int maxPower) {
		this.maxPower = maxPower;
	}

	public int getActualPower() {
		return currentPower;
	}

	public void setActualPower(int actualPower) {
		this.currentPower = actualPower;
	}
		
	public void run() {
		try {
			System.out.println("el fil comença, potencia a " + this.targetPower + ", i aquest propulsor te pot. max: " + this.maxPower);
			if (targetPower>currentPower) {
				if(targetPower>maxPower) {
					targetPower = maxPower;
					for (int i = currentPower; i < targetPower; i++) {
						Thread.sleep(100);
						currentPower++;
						System.out.println("Propulsor amb pot.Max: " + this.maxPower + " pot.Actual: " + currentPower);
					}	
				} else if (targetPower<maxPower) {
					for (int i = currentPower; i < targetPower; i++) {
						Thread.sleep(100);
						currentPower++;
						System.out.println("Propulsor amb pot.Max: " + this.maxPower + " pot.Actual: " + currentPower);
					}
				}
				System.out.println("el fil acaba, potencia a " + this.targetPower + ", i aquest propulsor te pot. max: " + this.maxPower);
			} else if (targetPower<currentPower) {
				System.out.println("el fil comença, potencia a " + this.targetPower + ", i aquest propulsor te pot. max: " + this.maxPower);
				for (int i = currentPower; i > targetPower; i--) {
					Thread.sleep(100);
					currentPower--;
					System.out.println("Propulsor amb pot.Max: " + this.maxPower + " pot.Actual: " + currentPower);
				}
				System.out.println("el fil acaba, potencia a " + this.targetPower + ", i aquest propulsor te pot. max: " + this.maxPower);
			}
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
