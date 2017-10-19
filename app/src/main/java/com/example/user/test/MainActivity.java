package com.example.user.test;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements OnFragment.OnFragmentListener
{
    OnListener onListener;

    OnFragment onFragment = OnFragment.newInstance();
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();

        fragmentTransaction.add(R.id.fragment_container, onFragment, "tag");

        fragmentTransaction.commit();

        /*onFragment.setOnTextListener(new OnListener()
        {
            @Override
            public void onClick()
            {
                Toast.makeText(getApplicationContext(), "CLICKED!!!", Toast.LENGTH_SHORT).show();
            }
        });*/
    }

    // cua interface OnFragmentListener
    @Override
    public void onClick()
    {
        Toast.makeText(getApplicationContext(), "CLICKED!!!", Toast.LENGTH_SHORT).show();
    }
}
