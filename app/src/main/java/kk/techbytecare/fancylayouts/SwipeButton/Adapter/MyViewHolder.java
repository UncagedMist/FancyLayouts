package kk.techbytecare.fancylayouts.SwipeButton.Adapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import kk.techbytecare.fancylayouts.R;

public class MyViewHolder extends RecyclerView.ViewHolder {

    TextView cart_item_name,cart_item_price;
    ImageView cart_image;

    public MyViewHolder(@NonNull View itemView) {
        super(itemView);

        cart_item_name = itemView.findViewById(R.id.cart_item_name);
        cart_item_price = itemView.findViewById(R.id.cart_item_price);

        cart_image = itemView.findViewById(R.id.cart_image);


    }
}
