package wisemensolutions.nammavvce;

/*Created by Kartikeya P Malimath on 08-11-2017.*/

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

import static wisemensolutions.nammavvce.R.layout.cse_faculty;

public class cseactivity extends AppCompatActivity {

    public Button csefaculty;
    public TextView cse_recent1;
    public TextView cse_recent2;
    public TextView cse_recent3;
    public TextView cse_recent4;

    private Firebase cserecent_ref1;
    private Firebase cserecent_ref2;
    private Firebase cserecent_ref3;
    private Firebase cserecent_ref4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cseactivity);
        facultycs();
    }


public void facultycs(){
    csefaculty = (Button)findViewById(R.id.csefaculty);
    csefaculty.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            Intent csefaculty = new Intent(cseactivity.this, cse_faculty.class);
            startActivity(csefaculty);
        }
    });



    /* Cse backend DATABASE java created by Kartikeya Malimath on 17-11-2017*/

    cse_recent1 = (TextView)findViewById(R.id.cse_recent1);
    cse_recent1.setSelected(true);
    Firebase.setAndroidContext(this);
    cserecent_ref1 = new Firebase("https://vvce-mysuru.firebaseio.com/cse_recent1");
    cserecent_ref1.addValueEventListener(new ValueEventListener() {
        @Override
        public void onDataChange(DataSnapshot dataSnapshot) {

            String recent1 = dataSnapshot.getValue(String.class);

            cse_recent1.setText(recent1);
        }

        @Override
        public void onCancelled(FirebaseError firebaseError) {

        }
    });

    cse_recent2 = (TextView)findViewById(R.id.cse_recent2);
    cse_recent2.setSelected(true);
    Firebase.setAndroidContext(this);
    cserecent_ref2 = new Firebase("https://vvce-mysuru.firebaseio.com/cse_recent2");
    cserecent_ref2.addValueEventListener(new ValueEventListener() {
        @Override
        public void onDataChange(DataSnapshot dataSnapshot) {

            String recent2 = dataSnapshot.getValue(String.class);

            cse_recent2.setText(recent2);
        }

        @Override
        public void onCancelled(FirebaseError firebaseError) {

        }
    });

    cse_recent3 = (TextView)findViewById(R.id.cse_recent3);
    cse_recent3.setSelected(true);
    Firebase.setAndroidContext(this);
    cserecent_ref3 = new Firebase("https://vvce-mysuru.firebaseio.com/cse_recent3");
    cserecent_ref3.addValueEventListener(new ValueEventListener() {
        @Override
        public void onDataChange(DataSnapshot dataSnapshot) {

            String recent3 = dataSnapshot.getValue(String.class);

            cse_recent3.setText(recent3);
        }

        @Override
        public void onCancelled(FirebaseError firebaseError) {

        }
    });

    cse_recent4 = (TextView)findViewById(R.id.cse_recent4);
    cse_recent4.setSelected(true);
    Firebase.setAndroidContext(this);
    cserecent_ref4 = new Firebase("https://vvce-mysuru.firebaseio.com/cse_recent4");
    cserecent_ref4.addValueEventListener(new ValueEventListener() {
        @Override
        public void onDataChange(DataSnapshot dataSnapshot) {

            String recent4 = dataSnapshot.getValue(String.class);

            cse_recent4.setText(recent4);
        }

        @Override
        public void onCancelled(FirebaseError firebaseError) {

        }
    });

}


}