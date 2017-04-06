package view.recycler.hybrid.zh.sh.a007_hybrid_recyclerview.Fragments;

import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import view.recycler.hybrid.zh.sh.a007_hybrid_recyclerview.Model.HybridModel;
import view.recycler.hybrid.zh.sh.a007_hybrid_recyclerview.R;

/**
 * Created by Suhayl SH on 4/1/2017.
 */

public class HomeFragment extends android.support.v4.app.Fragment{


    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    ArrayList<HybridModel> mList;

    private static final String ARG_PARAM1 = "fragmentName";
    private static HomeFragment fragment=null;
    // TODO: Rename and change types of parameters
    private String fragmentName;

    private View homeFragmentView;

    public static HomeFragment newInstance(String fragmentname) {
        if(fragment==null) {
            fragment = new HomeFragment();
            Bundle args = new Bundle();
            args.putString(ARG_PARAM1, fragmentname);
            fragment.setArguments(args);
        }
        return fragment;
    }

    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            fragmentName = getArguments().getString(ARG_PARAM1);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        if(homeFragmentView ==null)
        {
            homeFragmentView = inflater.inflate(R.layout.fragment_home, container, false);
            prepareList();

            mRecyclerView = (RecyclerView) homeFragmentView.findViewById(R.id.hybrid_recycler_view);
            mLayoutManager = new LinearLayoutManager(getActivity());
            mRecyclerView.setLayoutManager(mLayoutManager);
            mRecyclerView.setItemAnimator(new DefaultItemAnimator());
            mAdapter = new HomeHybridAdapter(mList, getActivity());
            mRecyclerView.setAdapter(mAdapter);
        }
        // Inflate the layout for this fragment
        return homeFragmentView;
    }

    public static void deInitialize()
    {
        fragment=null;
    }

    private void prepareList() {

        int[] mDrawbaleImages = new int[]{
                R.drawable.betaab_valley,
                R.drawable.baisaran,
                R.drawable.album2,
                R.drawable.album4,
                R.drawable.album9,
                R.drawable.sh
        };

        //Populate the ArrayList to be used by RecyclerView in HomeFragment
        mList= new ArrayList<>();
        mList.add(new HybridModel(HybridModel.TYPE_ZERO, getResources().getString(R.string.destination_betaab), getResources().getString(R.string.destination_betaab_desc), mDrawbaleImages[0]));
        mList.add(new HybridModel(HybridModel.TYPE_TWO, getResources().getString(R.string.artist_names), getResources().getString(R.string.temp), mDrawbaleImages[2], mDrawbaleImages[3], mDrawbaleImages[4]));
        mList.add(new HybridModel(HybridModel.TYPE_ONE, getResources().getString(R.string.destination_baisaran), getResources().getString(R.string.destination_baisaran_desc), mDrawbaleImages[1], mDrawbaleImages[5]));

    }
}
