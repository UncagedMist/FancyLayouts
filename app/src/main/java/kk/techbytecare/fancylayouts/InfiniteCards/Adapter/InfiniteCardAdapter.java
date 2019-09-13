package kk.techbytecare.fancylayouts.InfiniteCards.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import kk.techbytecare.fancylayouts.R;

public class InfiniteCardAdapter extends BaseAdapter {

    private int[] resIds = {};

    public InfiniteCardAdapter(int[] resIds) {
        this.resIds = resIds;
    }

    @Override
    public int getCount() {
        return resIds.length;
    }

    @Override
    public Object getItem(int pos) {
        return resIds[pos];
    }

    @Override
    public long getItemId(int pos) {
        return pos;
    }

    @Override
    public View getView(int pos, View view, ViewGroup parent) {

        if (view == null)   {
            view = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.item_card,parent,false);
        }
        view.setBackgroundResource(resIds[pos]);
        return view;
    }
}
