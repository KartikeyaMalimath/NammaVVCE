package wisemensolutions.nammavvce;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;

public class tapactivity extends AppCompatActivity {

    public TextView tap_recent1;
    public TextView tap_recent2;
    public TextView tap_recent3;
    public TextView tap_recent4;

    private Firebase taprecent_ref1;
    private Firebase taprecent_ref2;
    private Firebase taprecent_ref3;
    private Firebase taprecent_ref4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tapactivity);
        tapbackend();
    }
    
    public void tapbackend(){
        
        /* TaP backend DATABASE java created by Kartikeya Malimath on 26-11-2017*/

        tap_recent1 = (TextView)findViewById(R.id.tap_recent1);
        tap_recent1.setSelected(true);
        Firebase.setAndroidContext(this);
        taprecent_ref1 = new Firebase("https://vvce-mysuru.firebaseio.com/tap_recent1");
        taprecent_ref1.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                String recent1 = dataSnapshot.getValue(String.class);

                tap_recent1.setText(recent1);
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });

        tap_recent2 = (TextView)findViewById(R.id.tap_recent2);
        tap_recent2.setSelected(true);
        Firebase.setAndroidContext(this);
        taprecent_ref2 = new Firebase("https://vvce-mysuru.firebaseio.com/tap_recent2");
        taprecent_ref2.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                String recent2 = dataSnapshot.getValue(String.class);

                tap_recent2.setText(recent2);
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });

        tap_recent3 = (TextView)findViewById(R.id.tap_recent3);
        tap_recent3.setSelected(true);
        Firebase.setAndroidContext(this);
        taprecent_ref3 = new Firebase("https://vvce-mysuru.firebaseio.com/tap_recent3");
        taprecent_ref3.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                String recent3 = dataSnapshot.getValue(String.class);

                tap_recent3.setText(recent3);
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });

        tap_recent4 = (TextView)findViewById(R.id.tap_recent4);
        tap_recent4.setSelected(true);
        Firebase.setAndroidContext(this);
        taprecent_ref4 = new Firebase("https://vvce-mysuru.firebaseio.com/tap_recent4");
        taprecent_ref4.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                String recent4 = dataSnapshot.getValue(String.class);

                tap_recent4.setText(recent4);
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });
    }
}
