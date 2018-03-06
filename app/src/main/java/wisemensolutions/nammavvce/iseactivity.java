package wisemensolutions.nammavvce;

/* Created by Kartikeya P Malimath on 08-11-2017.*/

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

public class iseactivity extends AppCompatActivity {

    public Button isefaculty;
    public TextView ise_recent1;
    public TextView ise_recent2;
    public TextView ise_recent3;
    public TextView ise_recent4;

    private Firebase iserecent_ref1;
    private Firebase iserecent_ref2;
    private Firebase iserecent_ref3;
    private Firebase iserecent_ref4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iseactivity);
        facultyis();
    }

    public void facultyis(){
        isefaculty= (Button)findViewById(R.id.isefaculty);
        isefaculty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent isefaculty = new Intent(iseactivity.this, ise_faculty.class);
                startActivity(isefaculty);
            }
        });



         /* Ise backend DATABASE java created by Kartikeya Malimath on 18-11-2017*/

        ise_recent1 = (TextView)findViewById(R.id.ise_recent1);
        ise_recent1.setSelected(true);
        Firebase.setAndroidContext(this);
        iserecent_ref1 = new Firebase("https://vvce-mysuru.firebaseio.com/ise_recent1");
        iserecent_ref1.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                String recent1 = dataSnapshot.getValue(String.class);

                ise_recent1.setText(recent1);
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });

        ise_recent2 = (TextView)findViewById(R.id.ise_recent2);
        ise_recent2.setSelected(true);
        Firebase.setAndroidContext(this);
        iserecent_ref2 = new Firebase("https://vvce-mysuru.firebaseio.com/ise_recent2");
        iserecent_ref2.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                String recent2 = dataSnapshot.getValue(String.class);

                ise_recent2.setText(recent2);
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });

        ise_recent3 = (TextView)findViewById(R.id.ise_recent3);
        ise_recent3.setSelected(true);
        Firebase.setAndroidContext(this);
        iserecent_ref3 = new Firebase("https://vvce-mysuru.firebaseio.com/ise_recent3");
        iserecent_ref3.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                String recent3 = dataSnapshot.getValue(String.class);

                ise_recent3.setText(recent3);
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });

        ise_recent4 = (TextView)findViewById(R.id.ise_recent4);
        ise_recent4.setSelected(true);
        Firebase.setAndroidContext(this);
        iserecent_ref4 = new Firebase("https://vvce-mysuru.firebaseio.com/ise_recent4");
        iserecent_ref4.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                String recent4 = dataSnapshot.getValue(String.class);

                ise_recent4.setText(recent4);
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });

    }
}
