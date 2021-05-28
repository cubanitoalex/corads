package cu.sld.hlucia.corads;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

public class ActivityHome extends AppCompatActivity {
    private CardView tema1,tema2,tema3,tema4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        tema1 = findViewById(R.id.tema1);
        tema1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivitytema1();
            }
            private void openActivitytema1() {
                Intent intent = new Intent(ActivityHome.this, MainActivity1.class);
                startActivity(intent);
            }
        });


        tema2 = findViewById(R.id.tema2);
        tema2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivitytema2();
            }
            private void openActivitytema2() {
                Intent intent = new Intent(ActivityHome.this, MainActivity2.class);
                startActivity(intent);
            }
        });


        tema3 = findViewById(R.id.tema3);
        tema3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivitytema3();
            }
            private void openActivitytema3() {
                Intent intent = new Intent(ActivityHome.this, MainActivity3.class);
                startActivity(intent);
            }
        });

        tema4 = findViewById(R.id.tema4);
        tema4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivitytema4();
            }
            private void openActivitytema4() {
                Intent intent = new Intent(ActivityHome.this, MainActivity4.class);
                startActivity(intent);
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){

            case R.id.sobre_mi:
                Intent activity10Intent = new Intent(getApplicationContext(), cu.sld.hlucia.corads.MainAutores.class);
                startActivity(activity10Intent);
                break;

        }
        return super.onOptionsItemSelected(item);
    }






}