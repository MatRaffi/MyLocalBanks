package sg.edu.rp.c346.s19024292.mylocalbanks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    Button btnDbs, btnOcbc, btnUob;



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here.
        int id = item.getItemId();

        if (id == R.id.buttonOcbc) {
            btnOcbc.setText("OCBC ");
            return true;
        } else if (id == R.id.buttonOcbc) {
            btnUob.setText(R.string.ocbcChinese);
            return true;

        }

        else {
            btnOcbc.setText("Error translation");
        }

        if (id == R.id.buttonUob) {
            btnOcbc.setText("UOB");
            return true;
        } else if (id == R.id.buttonUob) {
            btnUob.setText(R.string.uobChinese);
            return true;
        } else {
            btnUob.setText("Error translation");
        }

        if (id == R.id.buttonDbs) {
            btnOcbc.setText("DBS");
            return true;
        } else if (id == R.id.buttonDbs) {
            btnUob.setText(R.string.dbsChinese);
            return true;
        } else {
            btnUob.setText("Error translation");
        }

        return super.onOptionsItemSelected(item);

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnDbs = findViewById(R.id.buttonDbs);
        btnOcbc = findViewById(R.id.buttonOcbc);
        btnUob = findViewById(R.id.buttonUob);

        btnUob.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentCall = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + "18002222121"));
                startActivity(intentCall);

                Intent intent = new Intent(Intent. ACTION_VIEW, Uri.parse("https://www.uob.com.sg"));
                startActivity(intent);


            }
        });



        btnOcbc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentCall = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + "18003633333"));
                startActivity(intentCall);

                Intent intent = new Intent(Intent. ACTION_VIEW, Uri.parse("https://www.dbs.com.sg"));
                startActivity(intent);


            }
        });

        btnDbs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentCall = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + "18001111111"));
                startActivity(intentCall);

                Intent intent = new Intent(Intent. ACTION_VIEW, Uri.parse("https://www.dbs.com.sg"));
                startActivity(intent);


            }
        });





    }




}
