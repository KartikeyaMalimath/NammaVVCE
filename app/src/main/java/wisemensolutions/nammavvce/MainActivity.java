package wisemensolutions.nammavvce;

/*Created by Kartikeya P Malimath on 08-11-2017.*/


import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.messaging.FirebaseMessaging;


public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener{



    public TextView textView14;
    public TextView textView15;
    public TextView textView8;
    public TextView textView9;
    public TextView textView16;
    public TextView textView17;
    public TextView textView18;
    public TextView textView19;
    public ImageView imageview4;
    public ImageView imageview5;
    public ImageView imageview2;
    public ImageView imageview3;
    public ImageView imageview6;
    public ImageView imageview7;
    public ImageView imageview8;
    public ImageView imageview9;
    public ImageView imageview10;
    public ImageView imageview11;
    public ImageView imageview12;
    public ImageView facebook;
    public ImageView insta;
    public ImageView twitter;
    public ImageView linked;

    private TextView vvce_recent1;
    private TextView vvce_recent2;
    private TextView vvce_recent3;
    private TextView vvce_recent4;

    public Firebase vvcerecent1_ref;
    public Firebase vvcerecent2_ref;
    public Firebase vvcerecent3_ref;
    public Firebase vvcerecent4_ref;


    private static long back_pressed_time;
    private static long PERIOD = 4000;


    @RequiresApi(api = Build.VERSION_CODES.GINGERBREAD)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer,toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        init();

    }


    @RequiresApi(api = Build.VERSION_CODES.GINGERBREAD)
    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else if (back_pressed_time + PERIOD > System.currentTimeMillis())
            finishAffinity();
        else
            Toast.makeText(this, "Press Back again to Exit", Toast.LENGTH_SHORT).show();
        back_pressed_time = System.currentTimeMillis();
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

    @RequiresApi(api = Build.VERSION_CODES.GINGERBREAD)
    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        switch(id){

            case R.id.home:
                Intent home = new Intent(MainActivity.this, MainActivity.class);
                startActivity(home);
                break;
            case R.id.about_vvce:
                Intent admini = new Intent(MainActivity.this, about_vvce.class);
                startActivity(admini);
                break;

            case R.id.facilities:
                Intent facility = new Intent(MainActivity.this, facility.class);
                startActivity(facility);
                break;

            case R.id.activities:
                Intent activities = new Intent(MainActivity.this, activitiesandmemo.class);
                startActivity(activities);
                break;

            case R.id.alumni:
                Intent alumni = new Intent(MainActivity.this, alumni.class);
                startActivity(alumni);
                break;

            case R.id.club:
                Intent club = new Intent(MainActivity.this, clubs.class);
                startActivity(club);
                break;

            case R.id.app:
                Intent aboutapp = new Intent(MainActivity.this, about_app.class);
                startActivity(aboutapp);
                break;

            case R.id.gallary:
                Intent gallery = new Intent(MainActivity.this, gallery.class);
                startActivity(gallery);
                break;

            case R.id.nav_share:
                Intent share = new Intent(Intent.ACTION_SEND);
                share.setType("text/plain");
                share.putExtra(Intent.EXTRA_SUBJECT,"Namma VVCE");
                String applink = "https://drive.google.com/open?id=1Xra2hLOu7Ksva0UwHyRVimAkbhkIp7P1 \nDownload it now for free";
                share.putExtra(Intent.EXTRA_TEXT,"Download VVCE Mysuru official app Namma VVCE beta version 2.0 from the below link \n" + applink);
                startActivity(Intent.createChooser(share, "Share via"));
                break;


        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }


    /*App Main activity Java file Created by Kartikeya Malimath*/



    public void init(){



        textView14 = (TextView)findViewById(R.id.textView14);
        textView14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent cse = new Intent(MainActivity.this, cseactivity.class);
                startActivity(cse);
            }
        });

        imageview4 = (ImageView)findViewById(R.id.imageview4);
        imageview4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent cse1 = new Intent(MainActivity.this, cseactivity.class);
                startActivity(cse1);
            }
        });

        textView15 = (TextView)findViewById(R.id.textView15);
        textView15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent ise = new Intent(MainActivity.this, iseactivity.class);
                startActivity(ise);
            }
        });

        imageview5 = (ImageView)findViewById(R.id.imageview5);
        imageview5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent ise1 = new Intent(MainActivity.this, iseactivity.class);
                startActivity(ise1);
            }
        });

        textView8 = (TextView)findViewById(R.id.textView8);
        textView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ece = new Intent(MainActivity.this, eceactivity.class);
                startActivity(ece);
            }
        });

        imageview2 = (ImageView)findViewById(R.id.imageview2);
        imageview2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ece1 = new Intent(MainActivity.this, eceactivity.class);
                startActivity(ece1);
            }
        });

        textView9 = (TextView)findViewById(R.id.textView9);
        textView9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent eee = new Intent(MainActivity.this, eeeactivity.class);
                startActivity(eee);
            }
        });

        imageview3 = (ImageView)findViewById(R.id.imageview3);
        imageview3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent eee1 = new Intent(MainActivity.this, eeeactivity.class);
                startActivity(eee1);
            }
        });

        textView16 = (TextView)findViewById(R.id.textView16);
        textView16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mech = new Intent(MainActivity.this, mechactivity.class);
                startActivity(mech);
            }
        });

        imageview6 = (ImageView)findViewById(R.id.imageview6);
        imageview6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mech1 = new Intent(MainActivity.this, mechactivity.class);
                startActivity(mech1);
            }
        });

        textView17 = (TextView)findViewById(R.id.textView17);
        textView17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent civil = new Intent(MainActivity.this, civilactivity.class);
                startActivity(civil);
            }
        });

        imageview7 = (ImageView)findViewById(R.id.imageview7);
        imageview7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent civil1 = new Intent(MainActivity.this, civilactivity.class);
                startActivity(civil1);
            }
        });

        textView18 = (TextView)findViewById(R.id.textView18);
        textView18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mba = new Intent(MainActivity.this, mbaactivity.class);
                startActivity(mba);
            }
        });

        imageview8 = (ImageView)findViewById(R.id.imageview8);
        imageview8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mba1 = new Intent(MainActivity.this, mbaactivity.class);
                startActivity(mba1);
            }
        });

        textView19 = (TextView)findViewById(R.id.textView19);
        textView19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tap = new Intent(MainActivity.this, tapactivity.class);
                startActivity(tap);
            }
        });

        imageview9 = (ImageView)findViewById(R.id.imageview9);
        imageview9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tap1 = new Intent(MainActivity.this, tapactivity.class);
                startActivity(tap1);
            }
        });

        imageview10 = (ImageView)findViewById(R.id.imageview10);
        imageview10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent call = new Intent(Intent.ACTION_DIAL);
                call.setData(Uri.parse("tel:08212510677"));
                startActivity(call);
            }
        });

        imageview11 = (ImageView)findViewById(R.id.imageview11);
        imageview11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gps = new Intent(Intent.ACTION_VIEW);
                gps.setData(Uri.parse("https://goo.gl/maps/5mbnxU8XrMp"));
                startActivity(gps);
            }
        });

        imageview12 = (ImageView)findViewById(R.id.imageview12);
        imageview12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent email = new Intent(Intent.ACTION_VIEW);
                email.setData(Uri.parse("mailto:principal@vvce.ac.in"));
                startActivity(email);
            }
        });



        /*created by Kartikeya P Malimath on 10-11-2017*/


        facebook = (ImageView)findViewById(R.id.facebook);
        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fb = new Intent(Intent.ACTION_VIEW);
                fb.setData(Uri.parse("https://www.facebook.com/vvceofficial"));
                startActivity(fb);
            }
        });

        insta = (ImageView)findViewById(R.id.insta);
        insta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent insta = new Intent(Intent.ACTION_VIEW);
                insta.setData(Uri.parse("https://www.instagram.com/vvceofficial"));
                startActivity(insta);
            }
        });

        twitter = (ImageView)findViewById(R.id.twitter);
        twitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent twitter = new Intent(Intent.ACTION_VIEW);
                twitter.setData(Uri.parse("https://twitter.com/vvceofficial"));
                startActivity(twitter);
            }
        });

        linked = (ImageView)findViewById(R.id.linked);
        linked.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent linked = new Intent(Intent.ACTION_VIEW);
                linked.setData(Uri.parse("https:/www.linkedin.com/company/vvceofficial"));
                startActivity(linked);
            }
        });




        /*Created by Kartikeya P Malimath on 08-11-2017.*/
        /*BackEnd DataBase for Recent Events of Main activity*/



        vvce_recent1 = (TextView)findViewById(R.id.vvce_recent1);
        vvce_recent1.setSelected(true);
        Firebase.setAndroidContext(this);
        vvcerecent1_ref = new Firebase("https://vvce-mysuru.firebaseio.com/vvce_recent1");
        vvcerecent1_ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                String recent1 = dataSnapshot.getValue(String.class);

                vvce_recent1.setText(recent1);
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });

        vvce_recent2 = (TextView)findViewById(R.id.vvce_recent2);
        vvce_recent2.setSelected(true);
        Firebase.setAndroidContext(this);
        vvcerecent2_ref = new Firebase("https://vvce-mysuru.firebaseio.com/vvce_recent2");
        vvcerecent2_ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                String recent2 = dataSnapshot.getValue(String.class);

                vvce_recent2.setText(recent2);
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });

        vvce_recent3 = (TextView)findViewById(R.id.vvce_recent3);
        vvce_recent3.setSelected(true);
        Firebase.setAndroidContext(this);
        vvcerecent3_ref = new Firebase("https://vvce-mysuru.firebaseio.com/vvce_recent3");
        vvcerecent3_ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                String recent3 = dataSnapshot.getValue(String.class);

                vvce_recent3.setText(recent3);
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });

        vvce_recent4 = (TextView)findViewById(R.id.vvce_recent4);
        vvce_recent4.setSelected(true);
        Firebase.setAndroidContext(this);
        vvcerecent4_ref = new Firebase("https://vvce-mysuru.firebaseio.com/vvce_recent4");
        vvcerecent4_ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                String recent4 = dataSnapshot.getValue(String.class);

                vvce_recent4.setText(recent4);
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });



    }


}



