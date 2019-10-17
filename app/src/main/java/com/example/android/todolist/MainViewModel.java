package com.example.android.todolist;

import android.app.Application;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.example.android.todolist.database.TaskDatabase;
import com.example.android.todolist.database.TaskEntry;

import java.util.List;

public class MainViewModel extends AndroidViewModel {
    private LiveData<List<TaskEntry>> liveDataTasks;
    private static final String TAG = MainViewModel.class.getSimpleName();
    public MainViewModel(@NonNull Application application) {
        super(application);
        Log.e(TAG, "Actively Retrieving the task from the DataBase");
        liveDataTasks= TaskDatabase.getInstance(this.getApplication()).taskDAO().getAllTasks();
    }

    public LiveData<List<TaskEntry>> getLiveDataTasks() {
        return liveDataTasks;
    }
}

// Last Part Change from AAC11