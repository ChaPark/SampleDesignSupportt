package com.chapark.sampledesignsupportt;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link MenuFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 */
public class MenuFragment extends Fragment {

    private OnFragmentInteractionListener mListener;

    public MenuFragment() {
        // Required empty public constructor
    }

    public static final int MENU_MAIN = 100;
    public static final int MENU_MY = 200;
    public static final int MENU_PROFILE = 201;
    public static final int MENU_LOGOUT = 202;
    public static final int MENU_SEARCH = 300;
    public static final int MENU_KEYWORD = 301;
    public static final int MENU_DATE = 302;
    public static final int MENU_SETTING = 400;
    public static final int MENU_PUSH = 401;
    public static final int MENU_ABOUT = 402;


    MenuGroup[] menuList = {
            new MenuGroup("Main", MENU_MAIN)
            , new MenuGroup("My", MENU_MY ,
            new MenuChild("Profile", MENU_PROFILE ),
            new MenuChild("Logout", MENU_LOGOUT))
            , new MenuGroup("Search", MENU_SEARCH ,
            new MenuChild("Keyword", MENU_KEYWORD),
            new MenuChild("Date", MENU_DATE))
            , new MenuGroup("Settings", MENU_SETTING,
            new MenuChild("Push", MENU_PUSH),
            new MenuChild("About", MENU_ABOUT))
    };

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_menu2, container, false);
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p/>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
