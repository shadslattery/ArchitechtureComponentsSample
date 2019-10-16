package com.example.android.todolist;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import com.example.android.todolist.database.TaskDatabase;

public class ViewModelFactory extends ViewModelProvider.NewInstanceFactory {
    TaskDatabase mOB;
    int taskId;

    public ViewModelFactory(TaskDatabase mOB, int taskId) {
        this.mOB = mOB;
        this.taskId = taskId;
    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        return (T) new AddTaskViewModel(taskId,mOB);
    }
}
