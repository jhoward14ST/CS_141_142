
public class TimeSpan {
	private int[] times;
	private int addHours;
	private int addMinutes;
	
	//this is the constructor as it shares the same name as the class
	public TimeSpan(int hours, int minutes) {
		if (minutes >= 60) {
			hours = hours + (minutes / 60);
			minutes = (minutes % 60);
		}
		times = new int [2];
		times[0] = hours;
		times[1] = minutes;
		addHours = times[0];
		addMinutes = times[1];
	}
	public int getHours() {
		return this.times[0];
	}
	public int getMinutes() {
		return this.times[1];
	}
	public void add(int hours, int minutes) {
		if (minutes >= 60) {
			times[0] = ((hours + (minutes / 60)) + times[0]);
			times[1] = ((minutes % 60) + times[1]);
		} else {
		times[0] = (hours + times[0]);
		times[1] = (minutes + times[1]);
		if (times[1] >= 60) {
			times[0] = ((hours + (minutes / 60)) + times[0]);
			times[1] = ((minutes % 60) + times[1]);
		}
		}
	}
	public void add(TimeSpan t) {
		times[0] = (times[0] + t.addHours);
		times[1] = (times[1] + t.addMinutes);
		if (times[1] >= 60) {
			times[0] = times[0] + (times[1] / 60);
			times[1] = times[1] - ((times[1] / 60) * 60);
		}
	}
	public double getTotalHours() {
		if (times[1] >= 60) {
			double hoursInput = times[0];
			double minutesInput = times[1];
			minutesInput = minutesInput % 60;
			hoursInput = hoursInput + (minutesInput - (minutesInput % 60)) / 60;
			double totalHours = (hoursInput + minutesInput);
			return totalHours;
		} else {
		double intToDouble = getMinutes();
		double minutesDecimal = (intToDouble/ 60);
		double hoursDecimal = (getHours() / 1);
		double totalHours = (hoursDecimal + minutesDecimal);
		return totalHours;
		}
	}
	public String toString() {
		String s = times[0] + "h" + times[1] + "m";
		return s;
	}
}
