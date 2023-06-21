package com.rabbani.latihansensorgps_10120130.ui.about;
/**
 * MUHAMMAD RABBANI A
 * IF-4
 * 10120130
 */
import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.os.Bundle;

import com.rabbani.latihansensorgps_10120130.MainActivity;
import com.rabbani.latihansensorgps_10120130.R;
import com.rabbani.latihansensorgps_10120130.adapter.AboutFragmentAdapter;

import java.util.ArrayList;
import java.util.List;
public class AboutFragment extends Fragment {

    private ViewPager viewPager;

    private PagerAdapter pagerAdapter;

    private MainActivity mainActivity;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.activity_about_fragment, container, false);

        viewPager = root.findViewById(R.id.viewpager);

        return root;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {

        mainActivity = (MainActivity) getActivity();
        mainActivity.getSupportActionBar().hide();

        List<Fragment> list = new ArrayList<>();
        list.add(new AboutFragment1());
        list.add(new AboutFragment2());

        pagerAdapter = new AboutFragmentAdapter(requireActivity().getSupportFragmentManager(),list);

        viewPager.setAdapter(pagerAdapter);
    }
}