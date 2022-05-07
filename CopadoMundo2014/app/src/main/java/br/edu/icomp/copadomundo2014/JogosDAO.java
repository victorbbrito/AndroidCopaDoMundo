package br.edu.icomp.copadomundo2014;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

public class JogosDAO{
    private Context context;
    private SQLiteDatabase database;

    public JogosDAO(Context context){
        this.context = context;
        this.database = (new Database(context)).getReadableDatabase();
    }

    public ArrayList<Jogos> getList(){
        ArrayList<Jogos> result = new ArrayList<Jogos>();
        String sql = "SELECT * FROM jogos";
        Cursor cursor = database.rawQuery(sql,null);

        while (cursor.moveToNext()){
            String selecao1 = cursor.getString(0);
            String selecao2 = cursor.getString(1);
            String data = cursor.getString(2);
            String estado = cursor.getString(3);
            String cidade = cursor.getString(4);
            String estadio = cursor.getString(5);
            String placar = cursor.getString(6);
            String penalti = cursor.getString(7);
            String tipo = cursor.getString(8);
            String resultado = cursor.getString(9);
            result.add(new Jogos(selecao1,selecao2,data,estado,cidade,estadio,placar,penalti,tipo,resultado));
        }

        return  result;
    }
}
