package cn.yunt.www.pagerbottomnavigationstrip.activity;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import cn.yunt.www.pagerbottomnavigationstrip.R;
import cn.yunt.www.pagerbottomnavigationstrip.adapter.MyViewPagerAdapter;
import cn.yunt.www.pagerbottomnavigationstrip.item.BaseTabItem;
import cn.yunt.www.pagerbottomnavigationstrip.item.NormalItemView;
import cn.yunt.www.pagerbottomnavigationstrip.widget.NavigationController;
import cn.yunt.www.pagerbottomnavigationstrip.widget.PageBottomTabLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        PageBottomTabLayout tab = (PageBottomTabLayout) findViewById(R.id.tab);
        NavigationController navigationController = tab.custom()
                .addItem(newItem(R.mipmap.img_home_on, R.mipmap.img_home_ok, "首页"))
                .addItem(newItem(R.mipmap.img_product_on, R.mipmap.img_product_ok, "产品"))
                .addItem(newItem(R.mipmap.img_user_on, R.mipmap.img_user_ok, "我的"))
                .build();
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewPager);
        viewPager.setAdapter(new MyViewPagerAdapter(getSupportFragmentManager(), navigationController.getItemCount()));
        navigationController.setupWithViewPager(viewPager);
    }

    //创建一个Item
    private BaseTabItem newItem(int drawable, int checkedDrawable, String text) {
        NormalItemView normalItemView = new NormalItemView(this);
        normalItemView.initialize(drawable, checkedDrawable, text);
        normalItemView.setTextDefaultColor(Color.GRAY);
        normalItemView.setTextCheckedColor(0xFF009688);
        return normalItemView;
    }
}
