package kk.techbytecare.fancylayouts.CoolMenu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;

import android.os.Bundle;

import com.dxtt.coolmenu.CoolMenuFrameLayout;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import kk.techbytecare.fancylayouts.CoolMenu.Fragments.FacebookFragment;
import kk.techbytecare.fancylayouts.CoolMenu.Fragments.GoogleFragment;
import kk.techbytecare.fancylayouts.CoolMenu.Fragments.TwitterFragment;
import kk.techbytecare.fancylayouts.CoolMenu.Fragments.YoutubeFragment;
import kk.techbytecare.fancylayouts.R;

public class CoolMenuActivity extends AppCompatActivity {

    CoolMenuFrameLayout menuFrameLayout;

    List<String> titleList = null;
    List<Fragment> fragments = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cool_menu);

        menuFrameLayout = findViewById(R.id.coolMenu);

        String[] titles = {"GOOGLE","FACEBOOK","YOUTUBE","TWITTER"};
        titleList = Arrays.asList(titles);

        menuFrameLayout.setTitles(titleList);
        //menuFrameLayout.setMenuIcon(R.drawable.menu);

        fragments.add(new GoogleFragment());
        fragments.add(new FacebookFragment());
        fragments.add(new YoutubeFragment());
        fragments.add(new TwitterFragment());

        FragmentPagerAdapter adapter = new FragmentPagerAdapter(getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int position) {
                return fragments.get(position);
            }

            @Override
            public int getCount() {
                return fragments.size();
            }
        };
        menuFrameLayout.setAdapter(adapter);
    }
}
