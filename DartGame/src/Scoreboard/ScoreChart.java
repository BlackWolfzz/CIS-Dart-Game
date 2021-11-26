package Scoreboard;

import io.quickchart.QuickChart;

public class ScoreChart {

	public static String chart(String[] args) {
		QuickChart chart = new QuickChart();
		chart.setWidth(500);
		chart.setHeight(300);
		chart.setConfig("{" + " type: 'bar'," + " data: {" + " labels: ['1', '2', '3', '4']," + " datasets: [{"
				+ " label: 'Score'," + " data: [400, 350, 200, 160]" + " label: 'Time'," + " data: [100, 110, 70, 200]"
				+ " }]" + " }" + "}");

		System.out.println(chart.getUrl());
		String URL = "https://quickchart.io/chart?c=%7B%0A%20%20type%3A%20%27bar%27%2C%0A%20%20data%3A%20%7B%0A%20%20%20%20labels%3A%20%5B%271%27%2C%20%272%27%2C%20%273%27%2C%20%274%27%5D%2C%0A%20%20%20%20datasets%3A%20%5B%7B%0A%20%20%20%20%20%20label%3A%20%27Score%27%2C%0A%20%20%20%20%20%20data%3A%20%5B400%2C%20350%2C%20200%2C%20160%5D%0A%20%20%20%20%7D%2C%20%7B%0A%20%20%20%20%20%20label%3A%20%27Time%27%2C%0A%20%20%20%20%20%20data%3A%20%5B100%2C%20110%2C%2070%2C%20200%5D%0A%20%20%20%20%7D%5D%0A%20%20%7D%0A%7D%0A";
		return URL;
	}

}
