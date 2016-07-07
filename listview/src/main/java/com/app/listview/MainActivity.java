package com.app.listview;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends Activity {

    private String[] names = new String[]{"hutou", "yaoyu", "libai", "liqingzhao"};
    private String[] descs = new String[]{"asdfasfd", "qwerqwreq", "zxvzxv", "upiuopiup"};
    private int[] imageIds = new int[]{R.drawable.tiger, R.drawable.nongyu, R.drawable.qingzhao, R.drawable.libai};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        List<Map<String, Object>> listItems = new ArrayList<Map<String, Object>>();
        for(int i = 0;i<names.length;i++) {
            Map<String, Object> listItem = new HashMap<String, Object>();
            listItem.put("header", imageIds[i]);
            listItem.put("personName",names[i]);
            listItem.put("desc",descs[i]);
            listItems.add(listItem);
        }
        //创建一个SimpleAdapter
        SimpleAdapter simpleAdapter = new SimpleAdapter(this, listItems, R.layout.simple_item,
                new String[]{"personName", "header", "desc"}, new int[]{R.id.name, R.id.header, R.id.desc});
        ListView list = (ListView) findViewById(R.id.mylist);
        list.setAdapter(simpleAdapter);


//        setContentView(R.layout.activity_main);
//        ListView list1 = (ListView) findViewById(R.id.list1);
//        String[] arr1 = {"wukong", "zhubajie", "laoniu"};
//
//        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this, R.layout.array_item, arr1);
//        list1.setAdapter(adapter1);
//        ListView list2 = (ListView) findViewById(R.id.list2);
//        String[] arr2 = {"java", "Hibernate", "Spring", "Android"};
//        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this, R.layout.checked_item, arr2);
//
//        list2.setAdapter(adapter2);
    }
}
