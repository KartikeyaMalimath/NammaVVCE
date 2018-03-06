package wisemensolutions.nammavvce;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class gallery extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    ViewPager viewPager;
    LinearLayout sliderDotspanel;
    private int dotscount;
    private ImageView[] dots;

    ViewPager viewPager2;
    LinearLayout sliderDotspanel2;
    private int dotscount2;
    private ImageView[] dots2;

    ViewPager viewPager3;
    LinearLayout sliderDotspanel3;
    private int dotscount3;
    private ImageView[] dots3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        init();

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.appfeedback) {
            Intent feedback = new Intent(Intent.ACTION_VIEW);
            feedback.setData(Uri.parse("mailto:vvce.app@gmail.com"));
            startActivity(feedback);
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        switch (id) {

            case R.id.home:
                Intent home = new Intent(gallery.this, MainActivity.class);
                startActivity(home);
                break;
            case R.id.about_vvce:
                Intent admini = new Intent(gallery.this, about_vvce.class);
                startActivity(admini);
                break;

            case R.id.facilities:
                Intent facility = new Intent(gallery.this, facility.class);
                startActivity(facility);
                break;

            case R.id.activities:
                Intent activities = new Intent(gallery.this, activitiesandmemo.class);
                startActivity(activities);
                break;

            case R.id.alumni:
                Intent alumni = new Intent(gallery.this, alumni.class);
                startActivity(alumni);
                break;

            case R.id.club:
                Intent club = new Intent(gallery.this, clubs.class);
                startActivity(club);
                break;

            case R.id.app:
                Intent aboutapp = new Intent(gallery.this, about_app.class);
                startActivity(aboutapp);
                break;

            case R.id.gallary:
                Intent gallery = new Intent(gallery.this, gallery.class);
                startActivity(gallery);
                break;

            case R.id.nav_share:
                Intent share = new Intent(Intent.ACTION_SEND);
                share.setType("text/plain");
                share.putExtra(Intent.EXTRA_SUBJECT, "Namma VVCE");
                String applink = "Download it now from Playstore for free";
                share.putExtra(Intent.EXTRA_TEXT, "Download VVCE Mysuru official app Namma VVCE and get all updates about the college\n" + applink);
                startActivity(Intent.createChooser(share, "Share via"));
                break;


        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    public void init(){
        viewPager = (ViewPager) findViewById(R.id.viewPager);

        sliderDotspanel = (LinearLayout) findViewById(R.id.SliderDots);

        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(this);

        viewPager.setAdapter(viewPagerAdapter);

        dotscount = viewPagerAdapter.getCount();
        dots = new ImageView[dotscount];

        for(int i = 0; i < dotscount; i++){

            dots[i] = new ImageView(this);
            dots[i].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.non_active_dot));

            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);

            params.setMargins(8, 0, 8, 0);

            sliderDotspanel.addView(dots[i], params);

        }

        dots[0].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.active_dot));

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {

                for(int i = 0; i< dotscount; i++){
                    dots[i].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.non_active_dot));
                }

                dots[position].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.active_dot));

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        /*second slider images*/

        viewPager2 = (ViewPager) findViewById(R.id.viewPager2);

        sliderDotspanel2 = (LinearLayout) findViewById(R.id.SliderDots2);

        ViewPagerAdapter2 viewPagerAdapter2 = new ViewPagerAdapter2(this);

        viewPager2.setAdapter(viewPagerAdapter2);

        dotscount2 = viewPagerAdapter2.getCount();
        dots2 = new ImageView[dotscount2];

        for(int i = 0; i < dotscount2; i++){

            dots2[i] = new ImageView(this);
            dots2[i].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.non_active_dot));

            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);

            params.setMargins(8, 0, 8, 0);

            sliderDotspanel2.addView(dots2[i], params);

        }

        dots2[0].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.active_dot));

        viewPager2.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {

                for(int i = 0; i< dotscount2; i++){
                    dots2[i].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.non_active_dot));
                }

                dots2[position].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.active_dot));

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        /*third slider images*/

        viewPager3 = (ViewPager) findViewById(R.id.viewPager3);

        sliderDotspanel3 = (LinearLayout) findViewById(R.id.SliderDots3);

        ViewPagerAdapter3 viewPagerAdapter3 = new ViewPagerAdapter3(this);

        viewPager3.setAdapter(viewPagerAdapter3);

        dotscount3 = viewPagerAdapter3.getCount();
        dots3 = new ImageView[dotscount3];

        for(int i = 0; i < dotscount3; i++){

            dots3[i] = new ImageView(this);
            dots3[i].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.non_active_dot));

            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);

            params.setMargins(8, 0, 8, 0);

            sliderDotspanel3.addView(dots3[i], params);

        }

        dots3[0].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.active_dot));

        viewPager3.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {

                for(int i = 0; i< dotscount3; i++){
                    dots3[i].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.non_active_dot));
                }

                dots3[position].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.active_dot));

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

    }

}

