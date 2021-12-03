package Scoreboard;

import io.quickchart.QuickChart;

/**
 * 
 * @author Nimesh // Connecter for Score board // Score board API using Quick
 *         Chart
 *
 */

public class ScoreChart {

	// Generates a bar chart

	public static String chart(String[] args) {
		QuickChart chart = new QuickChart();
		chart.setWidth(500);
		chart.setHeight(300);
		chart.setConfig("{" + " type: 'bar'," + " data: {" + " labels: ['Easy', 'Medium', 'Hard']," + " datasets: [{"
				+ " label: 'Level'," + " data: [20, 14, 5]" + " }]" + " }" + "}");

		System.out.println(chart.getUrl());
		String URL = "https://quickchart.io/chart?c=%7B%0A%20%20type%3A%20%27bar%27%2C%0A%20%20data%3A%20%7B%0A%20%20%20%20labels%3A%20%5B%27Easy%27%2C%20%27Medium%27%2C%20%27Hard%27%5D%2C%0A%20%20%20%20datasets%3A%20%5B%7B%0A%20%20%20%20%20%20label%3A%20%27Level%27%2C%0A%20%20%20%20%20%20data%3A%20%5B20%2C%2014%2C%205%5D%0A%20%20%20%20%7D%5D%0A%20%20%7D%0A%7D%0A";
		return URL;
	}

}
