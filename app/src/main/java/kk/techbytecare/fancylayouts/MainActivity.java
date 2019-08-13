package kk.techbytecare.fancylayouts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import kk.techbytecare.fancylayouts.CircularImage.CircularImageActivity;
import kk.techbytecare.fancylayouts.CoolMenu.CoolMenuActivity;
import kk.techbytecare.fancylayouts.LoadingView.LoadingViewActivity;

public class MainActivity extends AppCompatActivity {

    Button btnLoading, btnCircular;
    Button btnCoolMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLoading = findViewById(R.id.btnLoadingView);
        btnCircular = findViewById(R.id.btnCircular);

        btnCoolMenu = findViewById(R.id.btnCoolMenu);

        btnLoading.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, LoadingViewActivity.class));
                finish();
            }
        });

        btnCircular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, CircularImageActivity.class));
                finish();
            }
        });

        btnCoolMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, CoolMenuActivity.class));
                finish();
            }
        });

    }
}
