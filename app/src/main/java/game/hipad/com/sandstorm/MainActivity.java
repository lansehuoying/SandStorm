package game.hipad.com.sandstorm;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void OnClickPlane(View v) {

        startActivity(new Intent(this, com.hurteng.sandstorm.MainActivity.class));
    }

}
