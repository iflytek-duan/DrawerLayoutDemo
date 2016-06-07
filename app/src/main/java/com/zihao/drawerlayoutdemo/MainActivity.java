package com.zihao.drawerlayoutdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.zihao.drawerlayoutdemo.adapter.ContentAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView(){
        ListView lv = (ListView) findViewById(R.id.left_listview);
        final ContentAdapter contentAdapter = new ContentAdapter(this, getData());

        if(lv != null) {
            lv.setAdapter(contentAdapter);
            lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    Toast.makeText(MainActivity.this,"click " + contentAdapter.getItem(position),
                            Toast.LENGTH_SHORT).show();
                }
            });
        }
    }

    private ArrayList<String> getData() {
        ArrayList<String> list = new ArrayList<>();
        list.add("个人中心");
        list.add("产品帮助");
        list.add("意见反馈");
        list.add("精品推荐");
        list.add("在线商城");
        list.add("用户协议");
        list.add("关于我们");
        return list;
    }

}