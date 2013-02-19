package team20.getawesome;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract.Profile;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    
    /**called when user presses the Profile button*/
    @SuppressLint("NewApi")
    public void openProfile(View view)
    {
    	Intent intent = new Intent(this, UserProfileActivity.class);
    	startActivity(intent);
    }
    
    /**called when user presses the Fitness button */
    public void openFitness(View view)
    {
    	Intent intent = new Intent(this, Fitness.class);
    	startActivity(intent);
    }
    
    /**called when user presses the Health button */
    public void openHealth(View view)
    {
    	Intent intent = new Intent(this, Health.class);
    	startActivity(intent);
    }
}
