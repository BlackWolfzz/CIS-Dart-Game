package ScoreNTime;

import java.util.Timer;
import java.util.TimerTask;

public class Time {

	public static void main(String[] args) {
		Time tim = new Time();
		tim.runTimer();
	}

	Timer timer = new Timer();
	int i = 0;
	TimerTask task = new TimerTask() {
		public void run() {
			String time = getTime(i);
			System.out.println(time);
			i++;

		}
	};

	public void runTimer() {
		timer.schedule(task, 0, 1000);
	}

	static String getTime(int sec) {
		// if we have hours minutes and seconds
		int hours = 0;
		int remainderOfHours = 0;
		int minutes = 0;
		int seconds = 0;

		if (sec >= 3600) {
			hours = sec / 3600;
			remainderOfHours = sec % 3600;

			if (remainderOfHours >= 60) {
				minutes = remainderOfHours / 60;
				seconds = remainderOfHours % 60;
			} else {
				seconds = remainderOfHours;
			}
		}

		else if (sec >= 60) {
			hours = 0;
			minutes = sec / 60;
			seconds = sec % 60;
		}

		else if (sec < 60) {
			hours = 0;
			minutes = 0;
			seconds = sec;
		}

		String strHours;
		String strMins;
		String strSecs;

		if (seconds < 10)
			strSecs = "0" + Integer.toString(seconds);
		else
			strSecs = Integer.toString(seconds);

		if (minutes < 10)
			strMins = "0" + Integer.toString(minutes);
		else
			strMins = Integer.toString(minutes);

		if (hours < 10)
			strHours = "0" + Integer.toString(hours);
		else
			strHours = Integer.toString(hours);

		String time = strHours + ":" + strMins + ":" + strSecs;
		return time;
	}

}
