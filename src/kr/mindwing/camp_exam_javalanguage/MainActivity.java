package kr.mindwing.camp_exam_javalanguage;

import java.util.Random;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {

	private TextView resultView;
	private Random random = new Random();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.activity_main);

		resultView = (TextView) findViewById(R.id.result);
	}

	@Override
	protected void onResume() {
		super.onResume();

		setFoodString();
		setBGColor();
	}

	private void setFoodString() {
		String strFood = null;
		int intFood = random.nextInt() % 2;

		switch (intFood) {
		case 0:
			strFood = intFood + ": 배달의 요기요";
			break;

		case 1:
			strFood = intFood + ": 요기요민족";
			break;

		default:
			strFood = intFood + ": 라면물 끓이기";
			break;
		}

		resultView.setText(strFood);
	}

	private void setBGColor() {
		int intColor = random.nextInt() % 3;

		switch (intColor) {
		case 0:
			resultView.setBackgroundColor(Color.RED);
			break;

		case 1:
			resultView.setBackgroundColor(Color.YELLOW);
			break;

		case -1:
			resultView.setBackgroundColor(Color.BLUE);
			break;

		default:
			resultView.setBackgroundColor(Color.GRAY);
			break;
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
