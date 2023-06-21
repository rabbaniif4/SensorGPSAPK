package com.rabbani.latihansensorgps_10120130;
/**
 * MUHAMMAD RABBANI A
 * IF-4
 * 10120130
 */
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDialogFragment;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.rabbani.latihansensorgps_10120130.databinding.ActivityMainBinding;
import com.rabbani.latihansensorgps_10120130.ui.about.AboutFragment;
import com.rabbani.latihansensorgps_10120130.ui.lokasi.LokasiFragment;
import com.rabbani.latihansensorgps_10120130.ui.profile.ProfileFragment;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView bottomNavigationView;
    private NavController navController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);

        bottomNavigationView = findViewById(R.id.nav_view);
        // Inisialisasi NavHostFragment dan NavController
        NavHostFragment navHostFragment = (NavHostFragment) getSupportFragmentManager().findFragmentById(R.id.nav_host_fragment_activity_main);
        navController = navHostFragment.getNavController();

        // Set up BottomNavigationView dengan NavController
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                int itemId = item.getItemId();
                if (itemId == R.id.navigation_about) {
                    navController.navigate(R.id.navigation_about);
                    return true;
                } else if (itemId == R.id.navigation_lokasi) {
                    navController.navigate(R.id.navigation_lokasi);
                    return true;
                } else if (itemId == R.id.navigation_profile) {
                    navController.navigate(R.id.navigation_profile);
                    return true;
                }
                return false;
            }
        });
    }
}

