package android.lifeistech.com.memopad;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ExplainActivity extends AppCompatActivity {
    SharedPreferences pref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explain);

        pref = getSharedPreferences("pref_tutorial", MODE_PRIVATE);
        SharedPreferences.Editor editor = pref.edit();
        editor.putBoolean("key_tutorial", true);
        editor.commit();
    }

    public void button(View v) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
