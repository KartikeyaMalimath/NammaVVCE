package wisemensolutions.nammavvce;

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
import android.widget.TextView;

import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;

public class activitiesandmemo extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    public TextView notification1;
    public TextView notification2;
    public TextView notification3;
    public TextView notification4;
    public TextView notification5;
    public TextView notification6;
    public TextView notification7;
    public TextView notification8;

    private Firebase notification_ref1;
    private Firebase notification_ref2;
    private Firebase notification_ref3;
    private Firebase notification_ref4;
    private Firebase notification_ref5;
    private Firebase notification_ref6;
    private Firebase notification_ref7;
    private Firebase notification_ref8;

    /*Created by Kartikeya Malimath on 26-11-2017*/
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activitiesandmemo);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        
        init();
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
                Intent home = new Intent(activitiesandmemo.this, MainActivity.class);
                startActivity(home);
                break;
            case R.id.about_vvce:
                Intent admini = new Intent(activitiesandmemo.this, about_vvce.class);
                startActivity(admini);
                break;

            case R.id.facilities:
                Intent facility = new Intent(activitiesandmemo.this, facility.class);
                startActivity(facility);
                break;

            case R.id.activities:
                Intent activities = new Intent(activitiesandmemo.this, activitiesandmemo.class);
                startActivity(activities);
                break;

            case R.id.alumni:
                Intent alumni = new Intent(activitiesandmemo.this, alumni.class);
                startActivity(alumni);
                break;

            case R.id.club:
                Intent club = new Intent(activitiesandmemo.this, clubs.class);
                startActivity(club);
                break;

            case R.id.app:
                Intent aboutapp = new Intent(activitiesandmemo.this, about_app.class);
                startActivity(aboutapp);
                break;

            case R.id.gallary:
                Intent gallery = new Intent(activitiesandmemo.this, gallery.class);
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
    
    
    
    public void init(){

        
        /*Notifiactions backend system created by Kartikeya Malimath on 26-11-2017*/
        
        notification1 = (TextView)findViewById(R.id.notification1);
        notification1.setSelected(true);
        Firebase.setAndroidContext(this);
        notification_ref1 = new Firebase("https://vvce-mysuru.firebaseio.com/notification1");
        notification_ref1.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                String recent1 = dataSnapshot.getValue(String.class);

                notification1.setText(recent1);
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });

        notification2 = (TextView)findViewById(R.id.notification2);
        notification2.setSelected(true);
        Firebase.setAndroidContext(this);
        notification_ref2 = new Firebase("https://vvce-mysuru.firebaseio.com/notification2");
        notification_ref2.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                String recent2 = dataSnapshot.getValue(String.class);

                notification2.setText(recent2);
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });

        notification3 = (TextView)findViewById(R.id.notification3);
        notification3.setSelected(true);
        Firebase.setAndroidContext(this);
        notification_ref3 = new Firebase("https://vvce-mysuru.firebaseio.com/notification3");
        notification_ref3.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                String recent3 = dataSnapshot.getValue(String.class);

                notification3.setText(recent3);
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });

        notification4 = (TextView)findViewById(R.id.notification4);
        notification4.setSelected(true);
        Firebase.setAndroidContext(this);
        notification_ref4 = new Firebase("https://vvce-mysuru.firebaseio.com/notification4");
        notification_ref4.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                String recent4 = dataSnapshot.getValue(String.class);

                notification4.setText(recent4);
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });

        notification5 = (TextView)findViewById(R.id.notification5);
        notification5.setSelected(true);
        Firebase.setAndroidContext(this);
        notification_ref5 = new Firebase("https://vvce-mysuru.firebaseio.com/notification5");
        notification_ref5.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                String recent5 = dataSnapshot.getValue(String.class);

                notification5.setText(recent5);
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });

        notification6 = (TextView)findViewById(R.id.notification6);
        notification6.setSelected(true);
        Firebase.setAndroidContext(this);
        notification_ref6 = new Firebase("https://vvce-mysuru.firebaseio.com/notification6");
        notification_ref6.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                String recent6 = dataSnapshot.getValue(String.class);

                notification6.setText(recent6);
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });

        notification7 = (TextView)findViewById(R.id.notification7);
        notification7.setSelected(true);
        Firebase.setAndroidContext(this);
        notification_ref7 = new Firebase("https://vvce-mysuru.firebaseio.com/notification7");
        notification_ref7.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                String recent7 = dataSnapshot.getValue(String.class);

                notification7.setText(recent7);
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });

        notification8 = (TextView)findViewById(R.id.notification8);
        notification8.setSelected(true);
        Firebase.setAndroidContext(this);
        notification_ref8 = new Firebase("https://vvce-mysuru.firebaseio.com/notification8");
        notification_ref8.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                String recent8 = dataSnapshot.getValue(String.class);

                notification8.setText(recent8);
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });
        
        
    }
}
