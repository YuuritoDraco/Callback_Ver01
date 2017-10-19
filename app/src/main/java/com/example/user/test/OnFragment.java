package com.example.user.test;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by user on 10/19/2017.
 */

public class OnFragment extends Fragment
{
    private OnFragmentListener mListener;

    //private OnListener onListener;

    private void Fragment()
    {

    }

    public static OnFragment newInstance()
    {
        OnFragment onFragment = new OnFragment();
        Bundle args = new Bundle();
        onFragment.setArguments(args);
        return onFragment;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState)
    {
        Button button = (Button)view.findViewById(R.id.buttonClick);
        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                mListener.onClick();
            }
        });
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this onFragment
        return inflater.inflate(R.layout.fragment, container, false);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentListener) {
            mListener = (OnFragmentListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    public interface OnFragmentListener {
        void onClick();
    }

    /*public void setOnTextListener(OnListener listener) {

        listener = onListener;
    }*/
}
