package com.example.android.todolist.database;

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

    private LiveData<TaskEntry> taskEntryLiveData;

    