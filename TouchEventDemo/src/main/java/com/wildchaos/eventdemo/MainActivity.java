package com.wildchaos.eventdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by 孙俊伟 on 2015/10/15.
 */
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView contentA = (TextView) findViewById(R.id.contentA);
        TextView contentB = (TextView) findViewById(R.id.contentB);
        TextView contentC = (TextView) findViewById(R.id.contentC);
        ViewGroupA groupA = (ViewGroupA) findViewById(R.id.viewGroupA);
        ViewGroupB groupB = (ViewGroupB) findViewById(R.id.viewGroupB);
        ChildView childView = (ChildView) findViewById(R.id.childView);
        groupA.setContent(contentA, contentB, contentC);
        groupB.setContent(contentB);
        childView.setContent(contentC);
    }
}
