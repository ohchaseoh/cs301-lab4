package cs301.birthdaycake;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_main);
        // create reference to the cakeview
        CakeView cakeView = findViewById(R.id.cakeview);
        // create the cake controller
        CakeController cakeController = new CakeController(cakeView);
        // create a reference to the "blow out" button
        Button blowOutButton = findViewById(R.id.blowButton);
        // set the cakeController to listen to the blowOutButton
        blowOutButton.setOnClickListener(cakeController);
    }

    public void goodbye(View button)
    {
        Log.i("button", "Goodbye");
    }
}
