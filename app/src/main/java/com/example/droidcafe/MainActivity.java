package com.example.droidcafe;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, OrderActivity.class);
                startActivity(intent);

            }
        });
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
        
        /// pull try tesdafasdfasdf
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        switch(id){
            case R.id.action_order:
                displayToast(getString(R.string.action_order_message));
                break;
            case R.id.action_contact:
                displayToast(getString(R.string.action_contact_message));
                break;
            case R.id.action_favorities:
                displayToast(getString(R.string.action_favorites_message));
                break;
            case R.id.action_status:
                displayToast(getString(R.string.action_status_message));
                break;
            default:
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    public void displayToast(String massage) {
        Toast.makeText(getApplicationContext(), massage, Toast.LENGTH_SHORT).show();
    }

    public void showFroyoOrder(View view) {
        displayToast(getString(R.string.froyo_order_massage));
    }

    public void showIcecreamOrder(View view) {
        displayToast(getString(R.string.ice_cream_order_massage));
    }

    public void showDountOrder(View view) {
        displayToast(getString(R.string.dount_order_massage));
    }

}
