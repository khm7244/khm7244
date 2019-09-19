package com.example.test_home;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TabHost;

import com.example.test_home.fragment.PeopleFragment;

public class friend_list extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friend_list);
        TabHost tabHost1 = (TabHost)findViewById(R.id.tabHost1);
        tabHost1.setup();

        //첫번째 탭
        TabHost.TabSpec ts1 = tabHost1.newTabSpec("Tab Spec 1");
        ts1.setContent(R.id.content1);
        ts1.setIndicator("",getResources().getDrawable(R.drawable.ic_person_black_24dp));
        //ts1.setIndicator("친구");
        tabHost1.addTab(ts1);

        //두번째 탭
        TabHost.TabSpec ts2 = tabHost1.newTabSpec("Tab Spec 2");
        ts2.setContent(R.id.content2);
        ts2.setIndicator("",getResources().getDrawable(R.drawable.ic_comment_black_24dp));
        //ts2.setIndicator("채팅");
        tabHost1.addTab(ts2);

        //세번째 탭
        TabHost.TabSpec ts3 = tabHost1.newTabSpec("Tab Spec 3");
        ts3.setContent(R.id.content3);
        ts3.setIndicator("",getResources().getDrawable(R.drawable.ic_reorder_black_24dp));
        //ts3.setIndicator("설정");
        tabHost1.addTab(ts3);


        getFragmentManager().beginTransaction().replace(R.id.friend_list_frame,new PeopleFragment()).commit();




    }
}
