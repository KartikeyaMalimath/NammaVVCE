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

public class eeeactivity extends AppCompatActivity {

    public Button eeefaculty;
    public TextView eee_recent1;
    public TextView eee_recent2;
    public TextView eee_recent3;
    public TextView eee_recent4;

    private Firebase eeerecent_ref1;
    private Firebase eeerecent_ref2;
    private Firebase eeerecent_ref3;
    private Firebase eeerecent_ref4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eeeactivity);
        facultyeee();
    }

    public void facultyeee(){

        eeefaculty = (Button)findViewById(R.id.eeefaculty);
        eeefaculty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent eeefaculty = new Intent(eeeactivity.this , eee_faculty.class);
                startActivity(eeefaculty);
            }
        });
        
        
        /* Ece backend DATABASE java created by Kartikeya Malimath on 17-11-2017*/

        eee_recent1 = (TextView)findViewById(R.id.eee_recent1);
        eee_recent1.setSelected(true);
        Firebase.setAndroidContext(this);
        eeerecent_ref1 = new Firebase("https://vvce-mysuru.firebaseio.com/eee_recent1");
        eeerecent_ref1.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                String recent1 = dataSnapshot.getValue(String.class);

                eee_recent1.setText(recent1);
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });

        eee_recent2 = (TextView)findViewById(R.id.eee_recent2);
        eee_recent2.setSelected(true);
        Firebase.setAndroidContext(this);
        eeerecent_ref2 = new Firebase("https://vvce-mysuru.firebaseio.com/eee_recent2");
        eeerecent_ref2.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                String recent2 = dataSnapshot.getValue(String.class);

                eee_recent2.setText(recent2);
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });

        eee_recent3 = (TextView)findViewById(R.id.eee_recent3);
        eee_recent3.setSelected(true);
        Firebase.setAndroidContext(this);
        eeerecent_ref3 = new Firebase("https://vvce-mysuru.firebaseio.com/eee_recent3");
        eeerecent_ref3.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                String recent3 = dataSnapshot.getValue(String.class);

                eee_recent3.setText(recent3);
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });

        eee_recent4 = (TextView)findViewById(R.id.eee_recent4);
        eee_recent4.setSelected(true);
        Firebase.setAndroidContext(this);
        eeerecent_ref4 = new Firebase("https://vvce-mysuru.firebaseio.com/eee_recent4");
        eeerecent_ref4.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                String recent4 = dataSnapshot.getValue(String.class);

                eee_recent4.setText(recent4);
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });
    }
}
