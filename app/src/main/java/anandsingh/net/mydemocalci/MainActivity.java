package anandsingh.net.mydemocalci;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

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

    public void doAdd(View view)
    {
        EditText editText1 = (EditText) findViewById(R.id.etEnterNum1);
        EditText editText2 = (EditText) findViewById(R.id.etEnterNum2);

        int a = Integer.parseInt(editText1.getText().toString());
        int b = Integer.parseInt(editText2.getText().toString());

        TextView textView3 = (TextView)findViewById(R.id.tvResult);

        textView3.setText(String.valueOf(a+b));
    }

    public  void doSub(View view)
    {
        EditText editText1 = (EditText) findViewById(R.id.etEnterNum1);
        EditText editText2 = (EditText) findViewById(R.id.etEnterNum2);

        int a = Integer.parseInt(editText1.getText().toString());
        int b = Integer.parseInt(editText2.getText().toString());

        TextView textView3 = (TextView)findViewById(R.id.tvResult);

        textView3.setText(String.valueOf(a-b));
    }
}
