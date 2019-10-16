package com.example.android.todolist;

import android.app.Application;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;
import java.util.Observer;
import java.util.Objects;
import java.util.*;

import com.example.android.todolist.database.AppDatabase;
import com.example.android.todolist.database.TaskDatabase;
import com.example.android.todolist.database.TaskEntry;

public class AddTaskViewModel extends ViewModel {

    private AddNewTaskObservables newTaskObservables=new AddNewTaskObservables();
    private LiveData<TaskEntry> task;
    private AppDatabase appDatabase;

    public AddNewTaskObservables getNewTaskObservables(){

        return newTaskObservables;
    }

    public AddTaskViewModel(AppDatabase database, int taskID){
        task=database.taskDao().loadTaskById(taskID);
        newTaskObservables.setValues(task.getValue());
    }

    public LiveData<TaskEntry>  getTask() {
        return task;
    }

       /*public void getTaskByTaskId(int taskId) {
        task=appDatabase.taskDao().loadTaskById(taskId);
    }*/

       //public void saveData(){

       }


