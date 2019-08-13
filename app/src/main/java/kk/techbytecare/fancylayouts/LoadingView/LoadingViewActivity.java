package kk.techbytecare.fancylayouts.LoadingView;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.ldoublem.loadingviewlib.LVChromeLogo;
import com.ldoublem.loadingviewlib.LVCircular;
import com.ldoublem.loadingviewlib.LVCircularCD;
import com.ldoublem.loadingviewlib.LVLineWithText;
import com.ldoublem.loadingviewlib.view.LVBattery;
import com.ldoublem.loadingviewlib.view.LVBlazeWood;
import com.ldoublem.loadingviewlib.view.LVBlock;
import com.ldoublem.loadingviewlib.view.LVCircularJump;
import com.ldoublem.loadingviewlib.view.LVCircularRing;
import com.ldoublem.loadingviewlib.view.LVCircularSmile;
import com.ldoublem.loadingviewlib.view.LVCircularZoom;
import com.ldoublem.loadingviewlib.view.LVEatBeans;
import com.ldoublem.loadingviewlib.view.LVFinePoiStar;
import com.ldoublem.loadingviewlib.view.LVFunnyBar;
import com.ldoublem.loadingviewlib.view.LVGears;
import com.ldoublem.loadingviewlib.view.LVGearsTwo;
import com.ldoublem.loadingviewlib.view.LVGhost;
import com.ldoublem.loadingviewlib.view.LVNews;
import com.ldoublem.loadingviewlib.view.LVPlayBall;
import com.ldoublem.loadingviewlib.view.LVRingProgress;
import com.ldoublem.loadingviewlib.view.LVWifi;


import kk.techbytecare.fancylayouts.R;

public class LoadingViewActivity extends AppCompatActivity {

    LVCircularCD lvCircularCD;
    LVCircularRing lvCircularRing;
    LVCircular lvCircular;
    LVFinePoiStar lvFinePoiStar;
    LVCircularSmile lvCircularSmile;
    LVGears lvGears;
    LVGearsTwo lvGearsTwo;
    LVWifi lvWifi;
    LVCircularJump lvCircularJump;
    LVCircularZoom lvCircularZoom;
    LVPlayBall lvPlayBall;
    LVNews lvNews;
    LVLineWithText lvLineWithText;
    LVEatBeans lvEatBeans;
    LVChromeLogo lvChromeLogo;
    LVRingProgress lvRingProgress;
    LVBlock lvBlock;
    LVFunnyBar lvFunnyBar;
    LVGhost lvGhost;
    LVBlazeWood lvBlazeWood;
    LVBattery lvBattery;

    Button btnStop,btnStart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading_view);

        //1st row
        lvCircularCD = findViewById(R.id.lvCD);
        lvCircularRing = findViewById(R.id.lvRing);
        lvCircular = findViewById(R.id.lvCircular);
        lvFinePoiStar = findViewById(R.id.lvStar);

        //2nd row
        lvCircularSmile = findViewById(R.id.lvSmile);
        lvGears = findViewById(R.id.lvGears);
        lvGearsTwo = findViewById(R.id.lvGears2);
        lvWifi = findViewById(R.id.lvWifi);

        //3rd row
        lvCircularJump = findViewById(R.id.lvJump);
        lvCircularZoom = findViewById(R.id.lvZoom);
        lvPlayBall = findViewById(R.id.lvBall);
        lvNews = findViewById(R.id.lvNews);

        //4th row
        lvLineWithText = findViewById(R.id.lvLine);
        lvEatBeans = findViewById(R.id.lvEat);

        //5th row
        lvChromeLogo = findViewById(R.id.lvChrome);
        lvRingProgress = findViewById(R.id.lvRingProgress);
        lvBlock = findViewById(R.id.lvBlock);
        lvFunnyBar = findViewById(R.id.lvBar);

        //6th row
        lvGhost = findViewById(R.id.lvGhost);
        lvBlazeWood = findViewById(R.id.lvWood);
        lvBattery = findViewById(R.id.lvBattery);

        btnStop = findViewById(R.id.btnStop);
        btnStart = findViewById(R.id.btnStart);



        lvCircularCD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // lvCircularCD.setViewColor(android.R.color.white);
                lvCircularCD.startAnim();
            }
        });

        lvCircularRing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //lvCircularRing.setViewColor(android.R.color.white);
                //lvCircularRing.setBarColor(android.R.color.white);
                lvCircularRing.startAnim();
            }
        });

        lvCircular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //lvCircular.setViewColor(android.R.color.white);
                //lvCircular.setRoundColor(android.R.color.white);
                lvCircular.startAnim();
            }
        });

        lvFinePoiStar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //lvFinePoiStar.setViewColor(android.R.color.white);
                //lvFinePoiStar.setCircleColor(android.R.color.white);
                lvFinePoiStar.startAnim();
                lvFinePoiStar.setDrawPath(true);
            }
        });

        lvCircularSmile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //lvCircularSmile.setViewColor(android.R.color.white);
                lvCircularSmile.startAnim();
            }
        });

        lvGears.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //lvGears.setViewColor(android.R.color.white);
                lvGears.startAnim();
            }
        });

        lvGearsTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //lvGearsTwo.setViewColor(android.R.color.white);
                lvGearsTwo.startAnim();
            }
        });

        lvWifi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //lvWifi.setViewColor(android.R.color.white);
                lvWifi.startAnim();
            }
        });

        lvCircularJump.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //lvCircularJump.setViewColor(android.R.color.white);
                lvCircularJump.startAnim();
            }
        });

        lvCircularZoom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //lvCircularZoom.setViewColor(android.R.color.white);
                lvCircularZoom.startAnim();
            }
        });

        lvPlayBall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //lvPlayBall.setViewColor(android.R.color.white);
                //lvPlayBall.setBallColor(android.R.color.white);
                lvPlayBall.startAnim();
            }
        });

        lvNews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //lvNews.setViewColor(android.R.color.white);
                lvNews.startAnim();
            }
        });

        lvLineWithText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //lvLineWithText.setViewColor(android.R.color.white);
                //lvLineWithText.setTextColor(android.R.color.white);
                lvLineWithText.setValue(1-100);
            }
        });

        lvEatBeans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //lvEatBeans.setViewColor(android.R.color.white);
                //lvEatBeans.setEyeColor(android.R.color.white);
                lvEatBeans.startAnim();
            }
        });

        lvChromeLogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lvChromeLogo.startAnim();
            }
        });

        lvRingProgress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //lvRingProgress.setViewColor(android.R.color.white);
                //lvRingProgress.setTextColor(android.R.color.white);
                //lvRingProgress.setPorBarStartColor(android.R.color.white);
                //lvRingProgress.setPorBarEndColor(android.R.color.white);
                lvRingProgress.startAnim();
            }
        });

        lvBlock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //lvBlock.setViewColor(android.R.color.white);
                lvBlock.isShadow(true);
                //lvBlock.setShadowColor(android.R.color.white)
                lvBlock.startAnim();
            }
        });

        lvFunnyBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //lvFunnyBar.setViewColor(android.R.color.white)
                lvFunnyBar.startAnim();
            }
        });

        lvGhost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //lvGhost.setViewColor(android.R.color.white);
                //lvGhost.setHandColor(android.R.color.white);
                lvGhost.startAnim();
            }
        });

        lvBlazeWood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lvBlazeWood.startAnim();
            }
        });

        lvBattery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //lvBattery.setViewColor(android.R.color.white);
                //lvBattery.setCellColor(android.R.color.white);
                lvBattery.setShowNum(true);
                lvBattery.setValue(0-100);
                lvBattery.startAnim();
            }
        });

        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startAllAnimation();
            }
        });

        btnStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopAnimation();
            }
        });

    }



    private void startAllAnimation() {
        lvCircularCD.startAnim();
        lvCircularRing.startAnim();
        lvCircular.startAnim();
        lvFinePoiStar.startAnim();
        lvCircularSmile.startAnim();
        lvGears.startAnim();
        lvGearsTwo.startAnim();
        lvWifi.startAnim();
        lvCircularJump.startAnim();
        lvCircularZoom.startAnim();
        lvPlayBall.startAnim();
        lvNews.startAnim();
        lvEatBeans.startAnim();
        lvChromeLogo.startAnim();
        lvRingProgress.startAnim();
        lvBlock.startAnim();
        lvFunnyBar.startAnim();
        lvGhost.startAnim();
        lvBlazeWood.startAnim();
        lvBattery.startAnim();
    }

    private void stopAnimation() {
        lvCircularCD.stopAnim();
        lvCircularRing.stopAnim();
        lvCircular.stopAnim();
        lvFinePoiStar.stopAnim();
        lvCircularSmile.stopAnim();
        lvGears.stopAnim();
        lvGearsTwo.stopAnim();
        lvWifi.stopAnim();
        lvCircularJump.stopAnim();
        lvCircularZoom.stopAnim();
        lvPlayBall.stopAnim();
        lvNews.stopAnim();
        lvEatBeans.stopAnim();
        lvChromeLogo.stopAnim();
        lvRingProgress.stopAnim();
        lvBlock.stopAnim();
        lvFunnyBar.stopAnim();
        lvGhost.stopAnim();
        lvBlazeWood.stopAnim();
        lvBattery.stopAnim();
    }

}
