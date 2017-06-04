package com.examen.wyucra.examen.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by wyucra on 27/05/2017.
 */

public class ManipuladorDatabaseHelper  extends SQLiteOpenHelper {

    private static final String DB_NAME = "willydb.db";
    private static final Integer DB_VERSION = 1;


  /*  private final StringBuffer SQL_CREATE_TABLE_RESTAURANTE = new StringBuffer()
            .append("CREATE TABLE IF NOT EXISTS "+ RestauranteModel.TABLE_NAME+" ( ")
            .append(RestauranteModel.ID_FIELD+" INTEGER PRIMARY KEY AUTOINCREMENT, ")
            .append(RestauranteModel.NOMBRE_FIELD+" TEXT, ")
            .append(RestauranteModel.EMAIL_FIELD+" TEXT, ")
            .append(RestauranteModel.TELEFONO_FIELD+" TEXT, ")
            .append(RestauranteModel.DIRECCION_FIELD+" TEXT ")
            .append(")");

    private final StringBuffer SQL_DELETE_TABLE_RESTAURANTE = new StringBuffer()
            .append("DROP TABLE IF EXISTS " + RestauranteModel.TABLE_NAME);  */


    public ManipuladorDatabaseHelper(Context context){
        super(context, DB_NAME, null, DB_VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
     //   db.execSQL(SQL_CREATE_TABLE_RESTAURANTE.toString());
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
     //   db.execSQL(SQL_DELETE_TABLE_RESTAURANTE.toString());
        onCreate(db);
    }

    @Override
    public void onDowngrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        super.onDowngrade(db, oldVersion, newVersion);

    }
}
