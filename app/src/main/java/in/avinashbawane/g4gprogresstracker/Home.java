package in.avinashbawane.g4gprogresstracker;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Home extends AppCompatActivity {

    Button plus1,minus1;
    TextView tv ;

    public int total = 130,done = 0;
    //public double percentage = done/total;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button plus1 = (Button) findViewById(R.id.plus1);
        Button minus1 = (Button) findViewById(R.id.minus1);

        final TextView tv = (TextView) findViewById(R.id.textView2);
    }

    public void Increment(View v) {
        try{
            done++;
            tv.setText(Integer.toString((int) done)+"/"+total);
        }
        catch (NullPointerException e)
        {
            Snackbar.make(v,done+" / 130 done",Snackbar.LENGTH_INDEFINITE).show();
        }

        //tv.setText(Integer.toString((int) done));

    }

    public void Decrement(View v) {

       try{
            done--;
            //percentage = done/total;
            tv.setText(""+done);
        }
        catch (NullPointerException e)
        {
            Snackbar.make(v,done+" / 130 done",Snackbar.LENGTH_INDEFINITE).show();
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_home, menu);
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

}
