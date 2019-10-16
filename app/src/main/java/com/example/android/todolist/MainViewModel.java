package com.example.android.todolist;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.example.android.todolist.database.TaskDatabase;
import com.example.android.todolist.database.TaskEntry;

import java.util.List;

public class MainViewModel extends AndroidViewModel {
    private LiveData<List<TaskEntry>> liveDataTasks;
    public MainViewModel(@NonNull Application application) {
        super(application);
        liveDataTasks= TaskDatabase.getInstance(application.getApplicationContext()).taskDAO().getAllTasks();
    }

    public LiveData<List<TaskEntry>> getLiveDataTasks() {
        return liveDataTasks;
    }
}
