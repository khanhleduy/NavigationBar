package l.com.ldk.duykhanh.fragmentandroid;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

import devlight.io.library.ntb.NavigationTabBar;

public class MainActivity extends AppCompatActivity {

    NavigationTabBar navigationTabBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final String[] colors = getResources().getStringArray(R.array.jos);

        navigationTabBar = (NavigationTabBar) findViewById(R.id.ntb);
        ArrayList<NavigationTabBar.Model> models = new ArrayList<>();
        models.add(
                new NavigationTabBar.Model.Builder(
                        getResources().getDrawable(R.drawable.ic_cloud_black_24dp),
                        Color.parseColor(colors[0])
                ).title("One")
                        .build()
        );
        models.add(
                new NavigationTabBar.Model.Builder(
                        getResources().getDrawable(R.drawable.ic_favorite_black_24dp),
                        Color.parseColor(colors[1])
                ).title("Two")
                        .build()
        );
        models.add(
                new NavigationTabBar.Model.Builder(
                        getResources().getDrawable(R.drawable.ic_grade_black_24dp),
                        Color.parseColor(colors[2])
                ).title("Three")
                        .build()
        );
        models.add(
                new NavigationTabBar.Model.Builder(
                        getResources().getDrawable(R.drawable.ic_local_post_office_black_24dp),
                        Color.parseColor(colors[3])
                ).title("Four")
                        .build()
        );

        navigationTabBar.setModels(models);
//        navigationTabBar.setViewPager(viewPager, 1); // WHEN YOU USE VIEWPAGER
        navigationTabBar.setBadgeSize(10);
        navigationTabBar.setIsTinted(true);
        navigationTabBar.setIsSwiped(true);
    }

    public NavigationTabBar getNavigationTabBar() {

        return navigationTabBar;
    }
}
