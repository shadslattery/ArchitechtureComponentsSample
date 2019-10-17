

package com.example.android.todolist;

import com.example.android.todolist.database.TaskEntry;
import androidx.databinding.BaseObservable;
import androidx.databinding.Observable;
import androidx.databinding.ObservableBoolean;
import androidx.databinding.ObservableField;
import androidx.databinding.ObservableInt;

    public class AddNewTaskObservables extends BaseObservable{

        private ObservableField<String> taskName=new ObservableField<>();
//
        public  ObservableField<String> getTaskName()
        {
            return taskName;
        }
//
//        public void setValues(TaskEntry values) {
//            taskName.set(values.getDescription());
//        }
}
