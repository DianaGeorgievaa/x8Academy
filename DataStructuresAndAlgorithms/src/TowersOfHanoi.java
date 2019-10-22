package datastructures;

public class TowersOfHanoi {

	public void towersOfHanoiRecursive(int disks, char firstTower, char secondTower, char thirdTower) {

		if (disks > 0) {
			towersOfHanoiRecursive(disks - 1, firstTower, thirdTower, secondTower);
			System.out.println("Move top disk from tower " + firstTower + " to tower " + thirdTower);
			towersOfHanoiRecursive(disks - 1, thirdTower, secondTower, firstTower);
		}
	}

	public static void main(String args[]) {
	}

}
