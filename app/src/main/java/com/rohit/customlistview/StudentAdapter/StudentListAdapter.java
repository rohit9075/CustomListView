package com.rohit.customlistview.StudentAdapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.rohit.customlistview.R;
import com.rohit.customlistview.model.Student;

import java.util.List;

public class StudentListAdapter extends ArrayAdapter<Student> {

    List<Student> studentList ;
    Context mContext;

    public StudentListAdapter(Context context, int resource, List<Student> studentList) {
        super(context, resource , studentList);
        this.studentList = studentList;
        mContext = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null){
//            LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
//            convertView = inflater.inflate(R.layout.item_list,null , true);

            convertView = LayoutInflater.from(mContext).inflate(R.layout.item_list,null,false);
        }

        Student student = getItem(position);

        TextView mTextViewName = convertView.findViewById(R.id.textView_name);
        mTextViewName.setText(student.getName());

        TextView mTextViewId = convertView.findViewById(R.id.textView_id);
        mTextViewId.setText(student.getId());

        TextView mTextViewCity = convertView.findViewById(R.id.textView_city);
        mTextViewCity.setText(student.getCity());


        return convertView;
    }
}
