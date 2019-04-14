package com.example.sichael.flash;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ServiceProviderHomeActivity extends AppCompatActivity {

    ListView listView;
    List list = new ArrayList<>();
    private ArrayAdapter arrayAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service_provider_home);
        listView = (ListView) findViewById(R.id.jobList);
        EditText theFilter = (EditText)findViewById(R.id.searchFilter);

        list.add("Job 1");
        list.add("Job 2");
        list.add("Job 3");
        list.add("Job 4");
        list.add("Job 5");
        list.add("Job 6");
        list.add("Job 7");
        list.add("Job 8");
        list.add("Job 9");


        arrayAdapter = new ArrayAdapter(ServiceProviderHomeActivity.this, android.R.layout.simple_list_item_1, list);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(list.get(position).equals("Job 1")) {
                    Intent intent = new Intent(view.getContext(), JobOne.class);
                    startActivity(intent);
                }
                if(list.get(position).equals("Job 2")) {
                    Intent intent = new Intent(view.getContext(), JobTwo.class);
                    startActivity(intent);
                }
                if(list.get(position).equals("Job 3")) {
                    Intent intent = new Intent(view.getContext(), JobThree.class);
                    startActivity(intent);
                }
            }
        });

        theFilter.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                (ServiceProviderHomeActivity.this).arrayAdapter.getFilter().filter(s);
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    public void toProfile(View view) {
        Intent intent = new Intent(this, ServiceProviderProfileActivity.class);
        startActivity(intent);
    }


}
