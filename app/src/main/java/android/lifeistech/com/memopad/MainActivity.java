package android.lifeistech.com.memopad;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    SharedPreferences pref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pref = getSharedPreferences("pref_tutorial", MODE_PRIVATE);
        SharedPreferences.Editor editor = pref.edit();

        if (pref.getBoolean("key_tutorial", false) == false) {
            Intent intent1 = new Intent(this, ExplainActivity.class);
            startActivity(intent1);
        }
        Log.d("キーの値", "は" + pref.getBoolean("key_tutorial", false));
    }

    public void memo(View v) {
        Intent intent = new Intent(this, MemoActivity.class);
        startActivity(intent);
    }

    /*
    @Override
    protected void onDestroy(){
        super.onDestroy();

        pref = getSharedPreferences("pref_tutorial", MODE_PRIVATE);
        SharedPreferences.Editor editor = pref.edit();
        editor.remove("key_tutorial");
        editor.commit();
        }
        key_tutorialの値を、最初のアプリ起動時以降ずっとtrueなのを解消しようとしてみた。
        */
}
