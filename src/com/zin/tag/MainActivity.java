package com.zin.tag;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.TextView;

import com.example.itag.R;
import com.zin.tag.view.FlowLayout;

public class MainActivity extends Activity {
	String[] mVals = new String[] {
		"Hello", "Android for Application", "WEB", "Java", "Android", "WEB", "Java"
		, "Android", "Application", "Java", "Android", "WEB", "Java"
	};
	
	private FlowLayout mFView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        mFView = (FlowLayout) findViewById(R.id.fview);
        initDate();
    }
    
	private void initDate() {
//		for (int i = 0; i < mVals.length; i++) {
//			Button btn = new Button(this);
//			MarginLayoutParams lp = new MarginLayoutParams(MarginLayoutParams.WRAP_CONTENT, MarginLayoutParams.WRAP_CONTENT);
//			btn.setText(mVals[i]);
//			
//			mFView.addView(btn, lp);
//		}
		LayoutInflater mInflater = LayoutInflater.from(this);
		for (int i = 0; i < mVals.length; i++) {
			TextView tv = (TextView) mInflater.inflate(R.layout.text, mFView, false);
			tv.setText(mVals[i]);
			mFView.addView(tv);
		}
	}
}
