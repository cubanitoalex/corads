package cu.sld.hlucia.corads;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        TextView textView13 = (TextView)findViewById(R.id.textView13);
        textView13.setText(Html.fromHtml(getResources().getString(R.string.A4)));
        TextView textView15 = (TextView)findViewById(R.id.textView15);
        textView15.setText(Html.fromHtml(getResources().getString(R.string.A5)));
        TextView textView19 = (TextView)findViewById(R.id.textView19);
        textView19.setText(Html.fromHtml(getResources().getString(R.string.A6)));
        TextView textView25 = (TextView)findViewById(R.id.textView25);
        textView25.setText(Html.fromHtml(getResources().getString(R.string.A9)));
        TextView textView27 = (TextView)findViewById(R.id.textView27);
        textView27.setText(Html.fromHtml(getResources().getString(R.string.A11)));
        TextView textView29 = (TextView)findViewById(R.id.textView29);
        textView29.setText(Html.fromHtml(getResources().getString(R.string.A12)));
        TextView textView32 = (TextView)findViewById(R.id.textView32);
        textView32.setText(Html.fromHtml(getResources().getString(R.string.A14)));







    }
}