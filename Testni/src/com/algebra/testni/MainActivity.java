package com.algebra.testni;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
private static final String BUNDLE_TEXT_RES="pero";
	private Button mKlik;
	private EditText mUnos;
	private TextView mIspis;
	private Object value;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		mKlik = (Button) findViewById(R.id.main_btn);
		mUnos = (EditText) findViewById(R.id.main_unos_edittext);
		mIspis = (TextView) findViewById(R.id.main_ispis_textview);
		if (savedInstanceState!=null)
		mIspis.setText(savedInstanceState.getString("data"));
		mKlik.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				mIspis.setText(mUnos.getText().toString());

			}
		});

	}
	
	@Override
	protected void onSaveInstanceState(Bundle outState) {
		// TODO Auto-generated method stub
		super.onSaveInstanceState(outState);
	
	outState.putString("pero", mUnos. getText().toString());
	}

	public static String getBundleTextRes() {
		return BUNDLE_TEXT_RES;
	}

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}

}
