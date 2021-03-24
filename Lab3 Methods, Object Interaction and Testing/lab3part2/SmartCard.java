public class SmartCard{
	private String owner;
	boolean areTheyStaff;
	
	public SmartCard(String ownerName){ // assigning name to owner
		owner= ownerName;
		areTheyStaff = false;
	}
    public static void main(String[] args){
	    SmartCard mySmartCard = new SmartCard("Anna Undergrad");  //creating new stmart card and giving  it a name to use
		SmartCard studentSmartCard = new SmartCard("Anna Undergrad");
		SmartCard staffSmartCard = new SmartCard("Dr. Bob Lecturer");
		}
	public String getOwner(){ //getting the owner of the card
      return owner;
	}
	
	public boolean isStaff(){ // checking if the card belongs to staff
		if(areTheyStaff){
			return true;
			}
		else{
			return false;
		}
	}
	public void setStaff(boolean staffStatus){ //assigning staffStatus to areTheyStaff
		areTheyStaff=staffStatus;
}
 


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