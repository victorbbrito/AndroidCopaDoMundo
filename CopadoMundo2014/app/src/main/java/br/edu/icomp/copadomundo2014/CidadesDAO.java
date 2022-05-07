package br.edu.icomp.copadomundo2014;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

public class CidadesDAO {
    private Context context;
    private SQLiteDatabase database;

    public CidadesDAO(Context context){
        this.context = context;
        this.database = (new Database(context)).getReadableDatabase();
    }

    public ArrayList<Cidades> getList(){
        ArrayList<Cidades> result = new ArrayList<Cidades>();
        String sql = "SELECT * FROM cidades";
        Cursor cursor = database.rawQuery(sql,null);

        while (cursor.moveToNext()){
            String estado = cursor.getString(0);
            String cidade = cursor.getString(1);
            String estadio = cursor.getString(2);
            result.add(new Cidades(estado,cidade,estadio));
        }
        return result;
    }
}
