public class CardLock {
	SmartCard lastCard; // instance variable that will hold the last scanned card
	Boolean studentAccess = false;

	public void swipeCard(SmartCard swipedCard) {
		lastCard = swipedCard; // assign the last scanned card to the instance variable
	}

	public SmartCard getLastCardSeen() {
		return lastCard;
	}

	public boolean isUnlocked() { // returns if the door will be unlocked
		if (studentAccess== true){
			return true;
		}
		else if (lastCard.isStaff()){
			return true;
		}
		else{
			return false;
		}
	}

	public void toggleStudentAccess() {
		studentAccess = !studentAccess; // changes the access boolean to the opposite of itself
	}
}
}