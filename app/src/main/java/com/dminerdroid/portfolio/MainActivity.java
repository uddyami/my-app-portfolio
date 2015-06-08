package com.dminerdroid.portfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void LaunchIntent(View v){
        String text="This will launch";
        switch(v.getId()){
            case R.id.button_build_it_bigger:
                text=text+getResources().getString(R.string.build_it_bigger);
                break;
            case R.id.button_capstone:
                text=text+getResources().getString(R.string.capstone);
                break;
            case R.id.button_football_library:
                text=text+getResources().getString(R.string.football_library);
                break;
            case R.id.button_football_score:
                text=text+getResources().getString(R.string.football_score);
                break;
            case R.id.button_spotify_streamer:
                text=text+getResources().getString(R.string.spotify_streamer);
                break;
            case R.id.button_xyz_reader:
                text=text+getResources().getString(R.string.xyz_reader);
                break;

        }
        Toast.makeText(this,text,Toast.LENGTH_SHORT).show();
    }
}
