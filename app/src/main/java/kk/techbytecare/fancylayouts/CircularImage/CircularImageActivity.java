package kk.techbytecare.fancylayouts.CircularImage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.squareup.picasso.Picasso;

import de.hdodenhof.circleimageview.CircleImageView;
import kk.techbytecare.fancylayouts.R;

public class CircularImageActivity extends AppCompatActivity {

    CircleImageView imgProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circular_image);

        imgProfile = findViewById(R.id.imgProfile);

        Picasso
                .get()
                .load(R.drawable.google)
                .into(imgProfile);
    }
}
