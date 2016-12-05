package com.example.swarupa.assignment52;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }
    public  boolean onOptionsItemSelected(MenuItem item)
    {
        switch (item.getItemId())
        {
            case R.id.menu1:
                Toast.makeText(this,"Clicked on Computer ",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.menu2:
                Toast.makeText(this,"Clicked on GamePad ",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.menu3:
                Toast.makeText(this,"Clicked on Camera",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.menu4:
                Toast.makeText(this,"Clicked on Video",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.menu5:
                Toast.makeText(this,"Clicked on Email",Toast.LENGTH_SHORT).show();
                return true;
        }
        return true;
    }

}
