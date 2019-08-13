package kk.techbytecare.fancylayouts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import kk.techbytecare.fancylayouts.LoadingView.LoadingViewActivity;

public class MainActivity extends AppCompatActivity {

    Button btnLoading, btnCircular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLoading = findViewById(R.id.btnLoadingView);
        btnCircular = findViewById(R.id.btnCircular);

        btnLoading.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, LoadingViewActivity.class));
                finish();
            }
        });

    }
}
