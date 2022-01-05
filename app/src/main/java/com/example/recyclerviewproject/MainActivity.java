package com.example.recyclerviewproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

/*    lateinit var viewModel: NoteViewModel
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstancesState)
                setContentView(R.layout.activity_main)
                        viewModel = ViewModelProvider(owner: this
    ViewModelProvider.AndroidViewModelFactory.getInstance(application)).get(NoteViewModel::class.java)
   viewModel.allNotes.observe(owner: this, Observer{it: List<Note>!)
   })
   }
    }*/

    RecyclerView recyclerView;
    LinearLayoutManager layoutManager;
    List<ModelClass> userList;
    Adapter adapter;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initData();
        InitRecyclerView();





    }

    private void InitRecyclerView() {
        recyclerView=findViewById(R.id.recyclerView);
        layoutManager=new LinearLayoutManager(this);
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        adapter=new Adapter(userList);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();




    }

    private void initData() {
        userList=new ArrayList<>();

        userList.add(new ModelClass(R.drawable.ic_launcher_background,"Ravikumar","12:55 am",
                "how r u?","--------------------"));
        userList.add(new ModelClass(R.drawable.ic_launcher_background,"Ravikumar","12:55 am",
                "how r u?","--------------------"));

    }
}