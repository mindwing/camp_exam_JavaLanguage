package kr.mindwing.camp_exam_javalanguage;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {

	private TextView resultView;
	private static final int FOR_COUNT = 50;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.activity_main);

		resultView = (TextView) findViewById(R.id.result);
	}

	@Override
	protected void onResume() {
		super.onResume();

		String result = String.format("::::%d::::\n\n", FOR_COUNT + 1);

		result += getForResultBinary();
		result += "\n::::::::::\n";

		result += getForResultOctal();
		result += "\n::::::::::\n";

		result += getForResultDecimal();
		result += "\n::::::::::\n";

		result += getForResultHex();

		resultView.setText(result);
	}

	private String getForResultBinary() {
		String retVal = null;
		int number = 0b1;

		for (int i = 0; i < FOR_COUNT; ++i) {
			number++;
		}

		retVal = "2진수 - 0b" + Integer.toBinaryString(number);

		return retVal;
	}

	private String getForResultOctal() {
		String retVal = null;
		int number = 01;

		for (int i = 0; i < FOR_COUNT; ++i) {
			number++;
		}

		retVal = "8진수 - 0" + Integer.toOctalString(number);

		return retVal;
	}

	private String getForResultDecimal() {
		String retVal = null;
		int number = 1;

		for (int i = 0; i < FOR_COUNT; ++i) {
			number++;
		}

		retVal = "10진수 - " + Integer.toString(number);

		return retVal;
	}

	private String getForResultHex() {
		String retVal = null;
		int number = 0x1;

		for (int i = 0; i < FOR_COUNT; ++i) {
			number++;
		}

		retVal = "16진수 - 0x" + Integer.toHexString(number);

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
