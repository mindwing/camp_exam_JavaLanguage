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

		String result = getIfResult(5, 10);

		result = result + "\n\n::::::::::::::::\n\n";

		result = result + getIfResult(100, 10);

		result = result + "\n\n::::::::::::::::\n\n";

		result = result + getIfResult(500, 500);

		resultView.setText(result);
	}

	private String getIfResult(int a, int b) {
		String retVal = null;

		if (a > b) {
			retVal = String.format("a = %d\nb = %d\n\na > b", a, b);
		} else if (a < b) {
			retVal = String.format("a = %d\nb = %d\n\na < b", a, b);
		} else {
			retVal = String.format("a = %d\nb = %d\n\na == b", a, b);
		}

		return retVal;
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
