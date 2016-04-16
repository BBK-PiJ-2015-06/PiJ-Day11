public class Script {
	
	public static void main(String[] args) {
		Script launcher = new Script();
		launcher.launch();
	}
	
	private void launch() {
		MobilePhone myPhone = new SmartPhone("brand");
		myPhone.call("01");
		myPhone.call("02");
		myPhone.browseWeb("Google");
		myPhone.findPosition();
		myPhone.ringAlarm("Wake Up!");
		myPhone.playGame("Minesweeper");
		myPhone.printLastNumbers();
	}
}