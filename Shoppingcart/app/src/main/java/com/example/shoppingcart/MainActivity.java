package com.example.shoppingcart;

import androidx.appcompat.app.AppCompatActivity;

import android.app.LauncherActivity;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private EditText product, quantity;
    private ListView productList;
    ArrayList<String> listItem;
    ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       // product = findViewById(R.id.txtprod);
        //quantity = findViewById(R.id.txtquan);

        listItem = new ArrayList<>();
        productList = findViewById(R.id.list);

        //viewSave();

    }

   /* private void viewSave() {

        Database manager = new Database(
                this,
                "product",
                null,
                1
        );

       SQLiteDatabase product = manager.getWritableDatabase();

        Cursor row = product.rawQuery("SELECT * FROM productos", null);

        if (row.getCount() == 0) {
            //Toast.makeText(this, "::: There aren't any products :::", Toast.LENGTH_SHORT).show();
        } else {
            while (row.moveToNext()) {
                listItem.add(row.getString(1));
                listItem.add(row.getString(2));
                listItem.add(row.getString(3));
                listItem.add(row.getString(4));
            }
            adapter = new ArrayAdapter(
                    this,
                    android.R.layout.simple_dropdown_item_1line,
                    listItem
            );
            productList.setAdapter(adapter);
        }

    }*/
}
