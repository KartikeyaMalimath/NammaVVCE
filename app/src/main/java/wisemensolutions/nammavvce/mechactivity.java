package wisemensolutions.nammavvce;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;

public class mechactivity extends AppCompatActivity {

    public Button mechfaculty;
    public TextView mech_recent1;
    public TextView mech_recent2;
    public TextView mech_recent3;
    public TextView mech_recent4;

    private Firebase mechrecent_ref1;
    private Firebase mechrecent_ref2;
    private Firebase mechrecent_ref3;
    private Firebase mechrecent_ref4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mechactivity);
        facultymech();
    }

    public void facultymech(){
        mechfaculty = (Button)findViewById(R.id.mechfaculty);
        mechfaculty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mechfaculty  = new Intent(mechactivity.this, mech_faculty.class);
                startActivity(mechfaculty);
            }
        });
        
        
        /* Mech backend DATABASE java created by Kartikeya Malimath on 18-11-2017*/

        mech_recent1 = (TextView)findViewById(R.id.mech_recent1);
        mech_recent1.setSelected(true);
        Firebase.setAndroidContext(this);
        mechrecent_ref1 = new Firebase("https://vvce-mysuru.firebaseio.com/mech_recent1");
        mechrecent_ref1.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                String recent1 = dataSnapshot.getValue(String.class);

                mech_recent1.setText(recent1);
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });

        mech_recent2 = (TextView)findViewById(R.id.mech_recent2);
        mech_recent2.setSelected(true);
        Firebase.setAndroidContext(this);
        mechrecent_ref2 = new Firebase("https://vvce-mysuru.firebaseio.com/mech_recent2");
        mechrecent_ref2.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                String recent2 = dataSnapshot.getValue(String.class);

                mech_recent2.setText(recent2);
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });

        mech_recent3 = (TextView)findViewById(R.id.mech_recent3);
        mech_recent3.setSelected(true);
        Firebase.setAndroidContext(this);
        mechrecent_ref3 = new Firebase("https://vvce-mysuru.firebaseio.com/mech_recent3");
        mechrecent_ref3.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                String recent3 = dataSnapshot.getValue(String.class);

                mech_recent3.setText(recent3);
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });

        mech_recent4 = (TextView)findViewById(R.id.mech_recent4);
        mech_recent4.setSelected(true);
        Firebase.setAndroidContext(this);
        mechrecent_ref4 = new Firebase("https://vvce-mysuru.firebaseio.com/mech_recent4");
        mechrecent_ref4.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                String recent4 = dataSnapshot.getValue(String.class);

                mech_recent4.setText(recent4);
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });
    }
}
