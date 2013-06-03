package net.metax.android.hellodroid;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends Activity {
    private TextView message;
    private ImageView droid;
    private View.OnClickListener droidTapListener;
    private int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        InitializeApp();

    }

    private void InitializeApp() {
        message = (TextView) findViewById(R.id.message);
        droid = (ImageView) findViewById(R.id.imageView);

        //
        droidTapListener = new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                TapDroid();
            }
        };
        droid.setOnClickListener(droidTapListener);
        
    }

    private void TapDroid() {
        counter++;
        String temp;
        switch(counter)
        {
            case 1:
                temp = "once";
                break;
            case 2:
                temp = "twice";
                break;
            default:
                temp = String.format("%d times", counter);

        }
        message.setText(String.format("You touched the droid %s", temp));
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
