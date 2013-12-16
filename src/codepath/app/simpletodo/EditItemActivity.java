package codepath.app.simpletodo;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;

public class EditItemActivity extends Activity {

	String detail;
	int position;
	EditText etActive;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_edit_item);
		detail = getIntent().getStringExtra("string_detail");
		position = getIntent().getIntExtra("string_positn", 0);
		etActive = (EditText) findViewById(R.id.etActive);
		etActive.setText(detail);
		etActive.setSelection(detail.length());
	}

	public void saveEditText(View v) {
		Intent mainAct = new Intent();
		detail = etActive.getText().toString();
		mainAct.putExtra("stringDetails", detail);
		mainAct.putExtra("stringPositin", position);
		setResult(RESULT_OK, mainAct);
		finish();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.edit_item, menu);
		return true;
	}

}
