package cu.sld.hlucia.corads;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainAutores extends AppCompatActivity {
    LinearLayout listItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_autores);


        //Abriendo Facebook Jose

        listItem = (LinearLayout) findViewById(R.id.main_action_about_social_facebook171);
        listItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String facebookUrl = "https://www.facebook.com/profile.php?id=100007984531425";
                try {
                    int versionCode = getPackageManager().getPackageInfo("com.facebook.katana", 0).versionCode;
                    if (versionCode >= 3002850) {
                        Uri uri = Uri.parse("fb://facewebmodal/f?href=" + facebookUrl);
                        startActivity(new Intent(Intent.ACTION_VIEW, uri));
                    } else {
                        Uri uri = Uri.parse("fb://page/100007984531425");
                        startActivity(new Intent(Intent.ACTION_VIEW, uri));
                    }
                } catch (PackageManager.NameNotFoundException e) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(facebookUrl)));
                }
            }
        });






//Abriendo Facebook Alexis

        listItem = (LinearLayout) findViewById(R.id.main_action_about_social_facebook17);
        listItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String facebookUrl = "https://www.facebook.com/cubanitoalex";
                try {
                    int versionCode = getPackageManager().getPackageInfo("com.facebook.katana", 0).versionCode;
                    if (versionCode >= 3002850) {
                        Uri uri = Uri.parse("fb://facewebmodal/f?href=" + facebookUrl);
                        startActivity(new Intent(Intent.ACTION_VIEW, uri));
                    } else {
                        Uri uri = Uri.parse("fb://page/cubanitoalex");
                        startActivity(new Intent(Intent.ACTION_VIEW, uri));
                    }
                } catch (PackageManager.NameNotFoundException e) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(facebookUrl)));
                }
            }
        });

        //Abriendo Facebook Erick

        listItem = (LinearLayout) findViewById(R.id.main_action_about_social_facebook18);
        listItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String facebookUrl = "https://www.facebook.com/eyriscruzsanchez";
                try {
                    int versionCode = getPackageManager().getPackageInfo("com.facebook.katana", 0).versionCode;
                    if (versionCode >= 3002850) {
                        Uri uri = Uri.parse("fb://facewebmodal/f?href=" + facebookUrl);
                        startActivity(new Intent(Intent.ACTION_VIEW, uri));
                    } else {
                        Uri uri = Uri.parse("fb://page/eyriscruzsanchez");
                        startActivity(new Intent(Intent.ACTION_VIEW, uri));
                    }
                } catch (PackageManager.NameNotFoundException e) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(facebookUrl)));
                }
            }
        });





        //Abriendo Twitter Alexis
        listItem = (LinearLayout) findViewById(R.id.main_action_about_social_twitter17);
        listItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/cubanito_alex"));
                startActivity(browserIntent);
            }

        });


        //Abriendo Twitter Erick
        listItem = (LinearLayout) findViewById(R.id.main_action_about_social_twitter18);
        listItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/EyrisCruzS"));
                startActivity(browserIntent);
            }

        });



        //Abriendo Email Jose
        listItem = (LinearLayout) findViewById(R.id.main_action_about_email1771);
        listItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SENDTO);
                intent.setData(Uri.parse("mailto:jcabrales698@gmail.com"));
                startActivity(intent);
            }
        });


       
        //Abriendo Email Alexis
        listItem = (LinearLayout) findViewById(R.id.main_action_about_email17);
        listItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SENDTO);
                intent.setData(Uri.parse("mailto:alexishlg@infomed.sld.cu"));
                startActivity(intent);
            }
        });


        //Abriendo Email Erick
        listItem = (LinearLayout) findViewById(R.id.main_action_about_email18);
        listItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SENDTO);
                intent.setData(Uri.parse("mailto:erick@infomed.sld.cu"));
                startActivity(intent);
            }
        });




        //Abriendo Whatsapp Jose
        listItem = (LinearLayout) findViewById(R.id.main_action_about_social_whatsapp171);
        listItem.setOnClickListener(new View.OnClickListener() {
            String number = "+5355995080";
            public void onClick(View v) {
                String url = "https://api.whatsapp.com/send?phone="+number;
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });


        //Abriendo Whatsapp alexis
        listItem = (LinearLayout) findViewById(R.id.main_action_about_social_whatsapp17);
        listItem.setOnClickListener(new View.OnClickListener() {
            String number = "+5352469458";
            public void onClick(View v) {
                String url = "https://api.whatsapp.com/send?phone="+number;
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        //Abriendo Whatsapp Erick
        listItem = (LinearLayout) findViewById(R.id.main_action_about_social_whatsapp18);
        listItem.setOnClickListener(new View.OnClickListener() {
            String number = "+5353838673";
            public void onClick(View v) {
                String url = "https://api.whatsapp.com/send?phone="+number;
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });



        //Movil Alexis
        listItem = (LinearLayout) findViewById(R.id.movilalexis);
        listItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0)
            {
                callPhoneNumberAlexis();
            }
        });

        //Movil Jose
        listItem = (LinearLayout) findViewById(R.id.moviljose);
        listItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0)
            {
                callPhoneNumberJose();
            }
        });



        //Movil Erick
        listItem = (LinearLayout) findViewById(R.id.movilerick);
        listItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0)
            {
                callPhoneNumberErick();
            }
        });









    }
    public void callPhoneNumberJose()
    {
        try
        {
            if(Build.VERSION.SDK_INT > 22)
            {
                if (ActivityCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    // TODO: Consider calling

                    ActivityCompat.requestPermissions(MainAutores.this, new String[]{Manifest.permission.CALL_PHONE}, 101);

                    return;
                }

                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:" + "55995080"));
                startActivity(callIntent);

            }
            else {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:" + "55995080"));
                startActivity(callIntent);
            }
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }

    public void callPhoneNumberAlexis()
    {
        try
        {
            if(Build.VERSION.SDK_INT > 22)
            {
                if (ActivityCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    // TODO: Consider calling

                    ActivityCompat.requestPermissions(MainAutores.this, new String[]{Manifest.permission.CALL_PHONE}, 101);

                    return;
                }

                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:" + "52469458"));
                startActivity(callIntent);

            }
            else {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:" + "52469458"));
                startActivity(callIntent);
            }
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }


    public void callPhoneNumberErick()
    {
        try
        {
            if(Build.VERSION.SDK_INT > 22)
            {
                if (ActivityCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    // TODO: Consider calling

                    ActivityCompat.requestPermissions(MainAutores.this, new String[]{Manifest.permission.CALL_PHONE}, 101);

                    return;
                }

                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:" + "53838673"));
                startActivity(callIntent);

            }
            else {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:" + "53838673"));
                startActivity(callIntent);
            }
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }




}

