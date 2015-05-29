package com.family.navigationdrawer;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class MyFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        int resourceId = getArguments().getInt(MainActivity.KEY_DRAWABLE_ID);
        String textId = getArguments().getString(MainActivity.KEY_TEXT_ID);

        View view = inflater.inflate(R.layout.fragment_my,container,false);

        ImageView imageView = (ImageView)view.findViewById(R.id.imageView);
        imageView.setImageResource(resourceId);
        // Inflate the layout for this fragment

        TextView textView2 = (TextView)view.findViewById(R.id.textView1);
        textView2.setText(textId);

        TextView textView = (TextView)view.findViewById(R.id.textView2);
        switch(textId){
            case "Page1":
                textView.setText("11111111111111111111111111111111111111111111111111111111111111");
                break;
            case "Page2":
                textView.setText("22222222222222222222222222222222222222222222222222222222222222");
                break;
            case "Page3":
                textView.setText("33333333333333333333333333333333333333333333333333333333333333");
                break;
            case "Page4":
                textView.setText("44444444444444444444444444444444444444444444444444444444444444");
                break;
        }
        return view;
    }


}
