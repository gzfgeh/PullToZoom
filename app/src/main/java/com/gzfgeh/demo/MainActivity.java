package com.gzfgeh.demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.gzfgeh.pullToZoom.PullToZoomScrollViewEx;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PullToZoomScrollViewEx scrollView = (PullToZoomScrollViewEx) findViewById(R.id.scroll_view);
        scrollView.setAllView(R.layout.scroll_head_view, R.layout.profile_zoom_view, R.layout.scroll_head_view);
    }
}
