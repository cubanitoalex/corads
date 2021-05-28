package cu.sld.hlucia.corads;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

public class MainActivity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);

        TextView textView = (TextView)findViewById(R.id.textView);
        textView.setText(Html.fromHtml(getResources().getString(R.string.intro)));
        VideoView videoView =(VideoView)findViewById(R.id.videoView);
        MediaController mediaController= new MediaController(this);
        mediaController.setAnchorView(videoView);
        Uri uri= Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.one);
        videoView.setMediaController(mediaController);
        videoView.setVideoURI(uri);
        videoView.requestFocus();
        videoView.setOnPreparedListener (mp -> mp.setLooping(true));
        videoView.setMediaController(null);
        videoView.start();
    }
}