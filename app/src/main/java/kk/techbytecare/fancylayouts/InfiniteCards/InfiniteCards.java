package kk.techbytecare.fancylayouts.InfiniteCards;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.BaseAdapter;
import android.widget.Button;

import com.bakerj.infinitecards.AnimationTransformer;
import com.bakerj.infinitecards.CardItem;
import com.bakerj.infinitecards.InfiniteCardView;
import com.bakerj.infinitecards.ZIndexTransformer;
import com.bakerj.infinitecards.transformer.DefaultCommonTransformer;
import com.bakerj.infinitecards.transformer.DefaultTransformerToBack;
import com.bakerj.infinitecards.transformer.DefaultTransformerToFront;
import com.bakerj.infinitecards.transformer.DefaultZIndexTransformerCommon;

import kk.techbytecare.fancylayouts.InfiniteCards.Adapter.InfiniteCardAdapter;
import kk.techbytecare.fancylayouts.R;

public class InfiniteCards extends AppCompatActivity {

    InfiniteCardView infiniteCardView;
    Button btnPre,btnReset,btnNext;

    BaseAdapter adapter1, adapter2;

    private int[] resId = {
            R.drawable.pic1,
            R.drawable.pic2,
            R.drawable.pic3,
            R.drawable.pic4,
            R.drawable.pic5
    };

    boolean isAdapter1 = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_infinite_cards);

        btnNext = findViewById(R.id.btnNext);
        btnPre = findViewById(R.id.btnPrevious);
        btnReset = findViewById(R.id.btnReset);

        infiniteCardView = findViewById(R.id.infinite);

        adapter1 = new InfiniteCardAdapter(resId);
        adapter2 = new InfiniteCardAdapter(resId);
        infiniteCardView.setAdapter(adapter1);

        btnPre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isAdapter1) {
                    setStyle2();
                    infiniteCardView.bringCardToFront(adapter1.getCount() - 1);
                } else {
                    setStyle1();
                    infiniteCardView.bringCardToFront(adapter2.getCount() - 1);
                }
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isAdapter1) {
                    setStyle3();
                } else {
                    setStyle2();
                }
                infiniteCardView.bringCardToFront(1);
            }
        });

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (infiniteCardView.isAnimating()) {
                    return;
                }
                isAdapter1 = !isAdapter1;
                if (isAdapter1) {
                    setStyle2();
                    infiniteCardView.setAdapter(adapter1);
                } else {
                    setStyle1();
                    infiniteCardView.setAdapter(adapter2);
                }
            }
        });
    }

    private void setStyle1() {
        infiniteCardView.setClickable(true);
        infiniteCardView.setAnimType(InfiniteCardView.ANIM_TYPE_FRONT);
        infiniteCardView.setAnimInterpolator(new LinearInterpolator());
        infiniteCardView.setTransformerToFront(new DefaultTransformerToFront());
        infiniteCardView.setTransformerToBack(new DefaultTransformerToBack());
        infiniteCardView.setZIndexTransformerToBack(new DefaultZIndexTransformerCommon());
    }

    private void setStyle2() {
        infiniteCardView.setClickable(true);
        infiniteCardView.setAnimType(InfiniteCardView.ANIM_TYPE_SWITCH);
        infiniteCardView.setAnimInterpolator(new OvershootInterpolator(-18));
        infiniteCardView.setTransformerToFront(new DefaultTransformerToFront());
        infiniteCardView.setTransformerToBack(new AnimationTransformer() {
            @Override
            public void transformAnimation(View view, float fraction, int cardWidth, int cardHeight, int fromPosition, int toPosition) {
                int positionCount = fromPosition - toPosition;
                float scale = (0.8f - 0.1f * fromPosition) + (0.1f * fraction * positionCount);
                view.setScaleX(scale);
                view.setScaleY(scale);
                if (fraction < 0.5) {
                    view.setRotationX(180 * fraction);
                } else {
                    view.setRotationX(180 * (1 - fraction));
                }
            }

            @Override
            public void transformInterpolatedAnimation(View view, float fraction, int cardWidth, int cardHeight, int fromPosition, int toPosition) {
                int positionCount = fromPosition - toPosition;
                float scale = (0.8f - 0.1f * fromPosition) + (0.1f * fraction * positionCount);
                view.setTranslationY(-cardHeight * (0.8f - scale) * 0.5f - cardWidth * (0.02f *
                        fromPosition - 0.02f * fraction * positionCount));
            }
        });

        infiniteCardView.setZIndexTransformerToBack(new ZIndexTransformer() {
            @Override
            public void transformAnimation(CardItem card, float fraction, int cardWidth, int cardHeight, int fromPosition, int toPosition) {
                if (fraction < 0.4f) {
                    card.zIndex = 1f + 0.01f * fromPosition;
                } else {
                    card.zIndex = 1f + 0.01f * toPosition;
                }
            }

            @Override
            public void transformInterpolatedAnimation(CardItem card, float fraction, int cardWidth, int cardHeight, int fromPosition, int toPosition) {

            }
        });
    }

    private void setStyle3() {
        infiniteCardView.setClickable(false);
        infiniteCardView.setAnimType(InfiniteCardView.ANIM_TYPE_FRONT_TO_LAST);
        infiniteCardView.setAnimInterpolator(new OvershootInterpolator(-8));
        infiniteCardView.setTransformerToFront(new DefaultCommonTransformer());

        infiniteCardView.setTransformerToBack(new AnimationTransformer() {
            @Override
            public void transformAnimation(View view, float fraction, int cardWidth, int cardHeight, int fromPosition, int toPosition) {
                int positionCount = fromPosition - toPosition;
                float scale = (0.8f - 0.1f * fromPosition) + (0.1f * fraction * positionCount);
                view.setScaleX(scale);
                view.setScaleY(scale);
                if (fraction < 0.5) {
                    view.setTranslationX(cardWidth * fraction * 1.5f);
                    view.setRotationY(-45 * fraction);
                } else {
                    view.setTranslationX(cardWidth * 1.5f * (1f - fraction));
                    view.setRotationY(-45 * (1 - fraction));
                }
            }

            @Override
            public void transformInterpolatedAnimation(View view, float fraction, int cardWidth, int cardHeight, int fromPosition, int toPosition) {
                int positionCount = fromPosition - toPosition;
                float scale = (0.8f - 0.1f * fromPosition) + (0.1f * fraction * positionCount);
                view.setTranslationY(-cardHeight * (0.8f - scale) * 0.5f - cardWidth * (0.02f *
                        fromPosition - 0.02f * fraction * positionCount));
            }
        });

        infiniteCardView.setZIndexTransformerToBack(new ZIndexTransformer() {
            @Override
            public void transformAnimation(CardItem card, float fraction, int cardWidth, int cardHeight, int fromPosition, int toPosition) {
                if (fraction < 0.5f) {
                    card.zIndex = 1f + 0.01f * fromPosition;
                } else {
                    card.zIndex = 1f + 0.01f * toPosition;
                }
            }

            @Override
            public void transformInterpolatedAnimation(CardItem card, float fraction, int cardWidth, int cardHeight, int fromPosition, int toPosition) {

            }
        });
    }
}
