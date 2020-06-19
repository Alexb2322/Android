package com.example.shoppingcart;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class Database extends SQLiteOpenHelper {

    public Database(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }


    @Override
    public void onCreate(SQLiteDatabase product) {
        product.execSQL("CREATE TABLE productos (" +
                "id integer primary key autoincrement not null, " +
                "prod text not null unique, " +
                "prec int not null)"
        );
        product.execSQL("INSERT INTO " +
                "productos (prod_name, canti) "+
                "values('pera' , '12')"
        );
        product.execSQL("INSERT INTO " +
                "productos (prod_name, canti) "+
                "values('manzana' , '24')"

        );
        product.execSQL("INSERT INTO " +
                "productos (prod_name, canti) "+
                "values('mango' , '8')"

        );
        product.execSQL("INSERT INTO " +
                "productos (prod_name, canti) "+
                "values('naranjas' , '20')"

        );

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
