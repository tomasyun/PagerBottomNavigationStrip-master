package cn.yunt.www.pagerbottomnavigationstrip.widget;

import android.support.v4.view.ViewPager;


interface BottomLayoutController {

    /**
     * 方便适配ViewPager页面切换<p>
     * 注意：ViewPager页面数量必须等于导航栏的Item数量
     * @param viewPager {@link ViewPager}
     */
    void setupWithViewPager(ViewPager viewPager);
}
