package view.recycler.hybrid.zh.sh.a007_hybrid_recyclerview.Fragments;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import view.recycler.hybrid.zh.sh.a007_hybrid_recyclerview.Model.HybridModel;
import view.recycler.hybrid.zh.sh.a007_hybrid_recyclerview.R;

/**
 * Created by Suhayl SH on 4/1/2017.
 */

public class HomeHybridAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private ArrayList<HybridModel> dataSet;
    Context mContext;
    int total_types;

    public static class ViewHolderTypeZero extends RecyclerView.ViewHolder {

        TextView title_zero, description_zero;
        ImageView cardImagePlace_zero;

        public ViewHolderTypeZero(View viewZero) {
            super(viewZero);

            this.title_zero = (TextView) viewZero.findViewById(R.id.title_zero);
            this.description_zero = (TextView) viewZero.findViewById(R.id.description_zero);
            this.cardImagePlace_zero = (ImageView) viewZero.findViewById(R.id.place_zero);
        }
    }

    public static class ViewHolderTypeOne extends RecyclerView.ViewHolder {

        TextView title_one, description_one;
        ImageView cardImageicon_one, cardImagePlace_one;

        public ViewHolderTypeOne(View viewOne) {
            super(viewOne);

            this.title_one = (TextView) viewOne.findViewById(R.id.title_one);
            this.description_one = (TextView) viewOne.findViewById(R.id.description_one);
            this.cardImageicon_one = (ImageView) viewOne.findViewById(R.id.card_icon_one);
            this.cardImagePlace_one = (ImageView) viewOne.findViewById(R.id.place_one);
        }
    }

    public static class ViewHolderTypeTwo extends RecyclerView.ViewHolder {

        TextView author_two, artists_two;
        ImageView album_one_two, album_two_two, album_three_two;

        public ViewHolderTypeTwo(View viewTwo) {
            super(viewTwo);

            this.author_two = (TextView) viewTwo.findViewById(R.id.count);
            this.artists_two = (TextView) viewTwo.findViewById(R.id.title);
            this.album_one_two = (ImageView) viewTwo.findViewById(R.id.album_one_two);
            this.album_two_two = (ImageView) viewTwo.findViewById(R.id.album_two_two);
            this.album_three_two = (ImageView) viewTwo.findViewById(R.id.album_three_two);
        }
    }

    public HomeHybridAdapter(ArrayList<HybridModel> data, Context context) {
        this.dataSet = data;
        this.mContext = context;
        total_types = dataSet.size();

    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view;
        switch (viewType) {
            case HybridModel.TYPE_ZERO:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_type_zero, parent, false);
                return new ViewHolderTypeZero(view);
            case HybridModel.TYPE_ONE:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_type_one, parent, false);
                return new ViewHolderTypeOne(view);
            case HybridModel.TYPE_TWO:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_type_two, parent, false);
                return new ViewHolderTypeTwo(view);
        }
        return null;
    }

    @Override
    public int getItemViewType(int position) {

        switch (dataSet.get(position).card_type) {
            case 0:
                return HybridModel.TYPE_ZERO;
            case 1:
                return HybridModel.TYPE_ONE;
            case 2:
                return HybridModel.TYPE_TWO;
            default:
                return -1;
        }
    }

    @Override
    public void onBindViewHolder(final RecyclerView.ViewHolder holder, final int listPosition) {

        HybridModel object = dataSet.get(listPosition);
        if (object != null) {
            switch (object.card_type) {
                case HybridModel.TYPE_ZERO:
                    ((ViewHolderTypeZero) holder).title_zero.setText(object.mTitle);
                    ((ViewHolderTypeZero) holder).description_zero.setText(object.text_description);
                    ((ViewHolderTypeZero) holder).cardImagePlace_zero.setImageResource(object.image_one);
                    break;

                case HybridModel.TYPE_ONE:
                    ((ViewHolderTypeOne) holder).title_one.setText(object.mTitle);
                    ((ViewHolderTypeOne) holder).description_one.setText(object.text_description);
                    ((ViewHolderTypeOne) holder).cardImagePlace_one.setImageResource(object.image_one);
                    ((ViewHolderTypeOne) holder).cardImageicon_one.setImageResource(object.image_two);
                    break;

                case HybridModel.TYPE_TWO:

                    ((ViewHolderTypeTwo) holder).artists_two.setText(object.mTitle);
                    ((ViewHolderTypeTwo) holder).author_two.setText(object.text_description);
                    ((ViewHolderTypeTwo) holder).album_one_two.setImageResource(object.image_one);
                    ((ViewHolderTypeTwo) holder).album_two_two.setImageResource(object.image_two);
                    ((ViewHolderTypeTwo) holder).album_three_two.setImageResource(object.image_three);
                    break;
            }
        }

    }

    @Override
    public int getItemCount() {
        return dataSet.size();
    }


}