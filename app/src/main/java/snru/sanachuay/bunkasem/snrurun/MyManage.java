package snru.sanachuay.bunkasem.snrurun;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by Administrator on 17/5/2559.
 */
public class MyManage {
    //Explicit
    private MyOpenHelper myOpenHelper;
    private SQLiteDatabase sqLiteDatabase;

    public static final String user_table = "userTABLE";
    public static final String colum_id = "_id";
    public static final String colum_name = "Name";
    public static final String colum_user = "User";
    public static final String colum_password = "Password";
    public static final String colum_avata = "Avata";

    public MyManage(Context context) {
        myOpenHelper = new MyOpenHelper(context);
        sqLiteDatabase = myOpenHelper.getWritableDatabase();


    }   // Constructor

    public long addUser(String strName,
                        String strUser,
                        String strPassword,
                        String strAvata) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(colum_name, strName);
        contentValues.put(colum_user, strUser);
        contentValues.put(colum_password, strPassword);
        contentValues.put(colum_avata, strAvata);

        return sqLiteDatabase.insert(user_table, null, contentValues);
    }


}   //Main Class
