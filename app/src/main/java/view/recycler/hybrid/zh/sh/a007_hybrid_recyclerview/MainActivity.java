package view.recycler.hybrid.zh.sh.a007_hybrid_recyclerview;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

import view.recycler.hybrid.zh.sh.a007_hybrid_recyclerview.Fragments.HomeFragment;
import view.recycler.hybrid.zh.sh.a007_hybrid_recyclerview.Model.HybridModel;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Fragment mHome = HomeFragment.newInstance("Home");
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.fragment_container, mHome);
        ft.commit();



    }
}
