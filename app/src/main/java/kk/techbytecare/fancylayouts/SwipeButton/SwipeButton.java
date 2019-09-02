package kk.techbytecare.fancylayouts.SwipeButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import kk.techbytecare.fancylayouts.MainActivity;
import kk.techbytecare.fancylayouts.R;
import kk.techbytecare.fancylayouts.SwipeButton.Adapter.MyAdapter;
import kk.techbytecare.fancylayouts.SwipeButton.Helper.MyButtonClickListener;
import kk.techbytecare.fancylayouts.SwipeButton.Helper.MySwipeHelper;
import kk.techbytecare.fancylayouts.SwipeButton.Model.Item;

public class SwipeButton extends AppCompatActivity {

    RecyclerView recyclerTest;
    MyAdapter adapter;
    LinearLayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swipe_button);

        recyclerTest = findViewById(R.id.recycler_test);

        recyclerTest.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerTest.setLayoutManager(layoutManager);

        MySwipeHelper swipeHelper = new MySwipeHelper(this,recyclerTest,200) {
            @Override
            public void initiateMyButton(RecyclerView.ViewHolder viewHolder, List<MySwipeHelper.MyButton> buffer) {
                buffer.add(new MyButton(
                        SwipeButton.this,
                        "Delete",
                        R.drawable.ic_delete_white_24dp,
                        30,
                        Color.parseColor("#FF9502"),
                        new MyButtonClickListener(){
                            @Override
                            public void onClick(int pos) {
                                Toast.makeText(SwipeButton.this, "Delete Clicked", Toast.LENGTH_SHORT).show();
                            }
                        }
                ));
                buffer.add(new MyButton(
                        SwipeButton.this,
                        "Update",
                        R.drawable.ic_edit_white_24dp,
                        30,
                        Color.parseColor("#FF3c30"),
                        new MyButtonClickListener(){
                            @Override
                            public void onClick(int pos) {
                                Toast.makeText(SwipeButton.this, "Update Clicked", Toast.LENGTH_SHORT).show();
                            }
                        }
                ));
            }
        };

        generateItem();
    }

    private void generateItem() {
        List<Item> itemList = new ArrayList<>();

        for (int i = 0; i < 50; i++) {

            itemList.add(new Item("Pie 0"+(++i),
                    "10000$",
                    "https://cdn2.iconfinder.com/data/icons/food-drink-37/64/pie-bakery-dessert-food-512.png"));
        }

        adapter = new MyAdapter(this,itemList);
        recyclerTest.setAdapter(adapter);
    }
}
