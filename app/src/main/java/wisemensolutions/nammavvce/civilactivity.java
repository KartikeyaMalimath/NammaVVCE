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

public class civilactivity extends AppCompatActivity {

    public TextView civil_recent1;
    public TextView civil_recent2;
    public TextView civil_recent3;
    public TextView civil_recent4;
    public Button cvfaculty;

    private Firebase civilrecent_ref1;
    private Firebase civilrecent_ref2;
    private Firebase civilrecent_ref3;
    private Firebase civilrecent_ref4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_civilactivity);
        facultycivil();
    }

    public void facultycivil(){
        cvfaculty = (Button)findViewById(R.id.civilfaculty);
        cvfaculty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent cvfaculty = new Intent(civilactivity.this, civil_faculty.class);
                startActivity(cvfaculty);
            }
        });
        
        /* Civil backend DATABASE java created by Kartikeya Malimath on 18-11-2017*/

        civil_recent1 = (TextView)findViewById(R.id.civil_recent1);
        civil_recent1.setSelected(true);
        Firebase.setAndroidContext(this);
        civilrecent_ref1 = new Firebase("https://vvce-mysuru.firebaseio.com/civil_recent1");
        civilrecent_ref1.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                String recent1 = dataSnapshot.getValue(String.class);

                civil_recent1.setText(recent1);
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });

        civil_recent2 = (TextView)findViewById(R.id.civil_recent2);
        civil_recent2.setSelected(true);
        Firebase.setAndroidContext(this);
        civilrecent_ref2 = new Firebase("https://vvce-mysuru.firebaseio.com/civil_recent2");
        civilrecent_ref2.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                String recent2 = dataSnapshot.getValue(String.class);

                civil_recent2.setText(recent2);
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });

        civil_recent3 = (TextView)findViewById(R.id.civil_recent3);
        civil_recent3.setSelected(true);
        Firebase.setAndroidContext(this);
        civilrecent_ref3 = new Firebase("https://vvce-mysuru.firebaseio.com/civil_recent3");
        civilrecent_ref3.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                String recent3 = dataSnapshot.getValue(String.class);

                civil_recent3.setText(recent3);
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });

        civil_recent4 = (TextView)findViewById(R.id.civil_recent4);
        civil_recent4.setSelected(true);
        Firebase.setAndroidContext(this);
        civilrecent_ref4 = new Firebase("https://vvce-mysuru.firebaseio.com/civil_recent4");
        civilrecent_ref4.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                String recent4 = dataSnapshot.getValue(String.class);

                civil_recent4.setText(recent4);
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });
        
    }
}
