package wisemensolutions.nammavvce;

/*Created by Kartikeya P Malimath on 09-11-2017.*/

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class splashscreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);

        Thread myThread = new Thread() {

                    public void run() {
                        try {
                            sleep(2000);
                            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                            startActivity(intent);
                            finish();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                };
                myThread.start();
            }

            @Override
            protected void onPause() {
                super.onPause();
                finish();
            }
        }




