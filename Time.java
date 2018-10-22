package encapsulation;

public class Time {
	private int hour;
	private int minute;
	private int second;
	public void displayTime() {
		System.out.println(" The time is: " + hour + ": " + minute + ":" + second);
	
	}
 public void setHour(int h) {
	 hour = h;
 }
 public int gethour() {
	return hour;
 }
 public void setMinute(int m) {
	 minute = m;
 }
 public int getminute() {
	 return minute;
 }
 public void setSecond(int s) {
	 second = s;
 }
 public int getsecond() {
	 return second;
 }
 
	public static void main(String[] args) {
		Time time = new Time();
		time.setHour(12);
		time.setMinute(14);
		time.setSecond(55);
		time.displayTime();
		

	}

}
