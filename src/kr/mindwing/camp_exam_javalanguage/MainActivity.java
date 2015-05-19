package kr.mindwing.camp_exam_javalanguage;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {

	private TextView resultView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.activity_main);

		resultView = (TextView) findViewById(R.id.result);
	}

	@Override
	protected void onResume() {
		super.onResume();

		String result = getCalcResult();
		resultView.setText(result);
	}

	private String getCalcResult() {
		String resultValue = null;

		int a = 5;
		int b = 10;

		int y = a * 3 + b;

		resultValue = "a = 5";
		resultValue = resultValue + "\n";
		resultValue = resultValue + "b = 10";
		resultValue = resultValue + "\n\n";
		resultValue = resultValue + "a * 3 + b = ";
		resultValue = resultValue + y;

		return resultValue;
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
