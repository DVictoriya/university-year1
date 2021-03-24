public class SmartCard{
	private String owner;
	boolean areTheyStaff;
	
	public SmartCard(String ownerName){// assigning name to owner
		owner= ownerName;
		areTheyStaff = false;
	}
    public static void main(String[] args){
	   
		}
	public String getOwner(){//getting the owner of the card
      return owner;
	}
	
	public boolean isStaff(){  // checking if the card belongs to staff
		if(areTheyStaff== true){
			return true;
			}
		else{
			return false;
		}
	}
	public void setStaff(boolean staffStatus){ //assigning staffStatus to areTheyStaff
		areTheyStaff=staffStatus;
}
}

