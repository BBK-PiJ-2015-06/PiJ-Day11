public class MobilePhone extends OldPhone {
	
	private String[] recentCalls = {"-", "-", "-", "-", "-", "-", "-", "-", "-", "-"};
	
	public MobilePhone(String brand) {
		super(brand);
	}
	
	@Override
	public void call(String number) {
		super.call(number);
		populateRecentCalls(number);
	} 
	
	public void populateRecentCalls(String number) {
		int count = 0;
		if(recentCalls[count].equals("-")) {
			recentCalls[count] = number;
		} else if(recentCalls[9].equals("-")) {
			while(recentCalls[count] != "-") {
				count++;
				if(count > 9) {
					return;
				}
			}
			recentCalls[count] = number;
		} else {
			recentCalls[0] = recentCalls[1];
			recentCalls[1] = recentCalls[2];
			recentCalls[2] = recentCalls[3];
			recentCalls[3] = recentCalls[4];
			recentCalls[4] = recentCalls[5];
			recentCalls[5] = recentCalls[6];
			recentCalls[6] = recentCalls[7];
			recentCalls[7] = recentCalls[8];
			recentCalls[8] = recentCalls[9];
			recentCalls[9] = number;
		}
	}
	
	public void ringAlarm(String event) {
		System.out.println("Alarm ringing for " + event);
	}
	
	public void playGame(String game) {
		System.out.println("Playing " + game);
	}
	
	public void printLastNumbers() {
		System.out.println("Recent contacts:");
		for(int i = 9; i >= 0; i--) {
			if(recentCalls[i] != "-") {
				System.out.println(recentCalls[i]);
			}
		}
	}
	
}