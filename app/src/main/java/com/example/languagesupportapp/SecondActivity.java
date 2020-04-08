package com.example.languagesupportapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Locale;

public class SecondActivity extends BaseActivity {
    TextView helloTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /*String languageToLoad =  Locale.getDefault().getDisplayLanguage();; // your language
        Locale locale = new Locale(languageToLoad);
        Locale.setDefault(locale);
        Configuration config = new Configuration();
        config.locale = locale;
        getBaseContext().getResources().updateConfiguration(config,
                getBaseContext().getResources().getDisplayMetrics());*/
        setContentView(R.layout.activity_second);

        helloTV = findViewById(R.id.helloTV);
        helloTV.setText(getApplicationContext().getResources().getString(R.string.hello));
    }
}
