package com.example.android.todolist;

import android.util.Log;

import androidx.annotation.NonNull;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.example.android.todolist.database.TaskDatabase;
import com.example.android.todolist.database.TaskEntry;

public class AddTaskViewModel extends ViewModel {

    private AddNewTaskObservables newTaskObservables = new AddNewTaskObservables();
    private static final String TAG = AddTaskViewModel.class.getSimpleName();
    private LiveData<TaskEntry> taskEntryLiveData;

    public AddTaskViewModel(@NonNull int taskId,@NonNull TaskDatabase mOB) {
        Log.e(TAG, "Data fetched in add task");
        this.taskEntryLiveData = mOB.taskDAO().getTaskById(taskId);
    }

    public AddNewTaskObservables getNewTaskObservables() {
        return newTaskObservables;
    }


    public LiveData<TaskEntry> getTaskEntryLiveData() {
        return taskEntryLiveData;
    }
}
