package wisemensolutions.nammavvce;

/*Created by Kartikeya Malimath on 26-11-2017*/

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class facility extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facility);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


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

        switch(id){

            case R.id.home:
                Intent home = new Intent(facility.this, MainActivity.class);
                startActivity(home);
                break;
            case R.id.about_vvce:
                Intent admini = new Intent(facility.this, about_vvce.class);
                startActivity(admini);
                break;

            case R.id.facilities:
                Intent facility = new Intent(facility.this, facility.class);
                startActivity(facility);
                break;

            case R.id.activities:
                Intent activities = new Intent(facility.this, activitiesandmemo.class);
                startActivity(activities);
                break;

            case R.id.alumni:
                Intent alumni = new Intent(facility.this, alumni.class);
                startActivity(alumni);
                break;

            case R.id.club:
                Intent club = new Intent(facility.this, clubs.class);
                startActivity(club);
                break;

            case R.id.app:
                Intent aboutapp = new Intent(facility.this, about_app.class);
                startActivity(aboutapp);
                break;

            case R.id.gallary:
                Intent gallery = new Intent(facility.this, gallery.class);
                startActivity(gallery);
                break;

            case R.id.nav_share:
                Intent share = new Intent(Intent.ACTION_SEND);
                share.setType("text/plain");
                share.putExtra(Intent.EXTRA_SUBJECT,"Namma VVCE");
                String applink = "Download it now from Playstore for free";
                share.putExtra(Intent.EXTRA_TEXT,"Download VVCE Mysuru official app Namma VVCE and get all updates about the college\n" + applink);
                startActivity(Intent.createChooser(share, "Share via"));
                break;


        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
