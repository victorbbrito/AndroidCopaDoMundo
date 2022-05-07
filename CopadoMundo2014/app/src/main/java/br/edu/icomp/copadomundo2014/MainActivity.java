package br.edu.icomp.copadomundo2014;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("Copa do Mundo 2014", "Activity principal criada.");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.i("Copa do Mundo 2014", "Método onStart executado.");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.i("Copa do Mundo 2014", "Método onResume executado.");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.i("Copa do Mundo 2014", "Método onPause executado.");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.i("Copa do Mundo 2014", "Método onStop executado.");
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.i("Copa do Mundo 2014", "Método onRestart executado.");
    }

    public void  onClickJogos(View view){
        Intent intent = new Intent(this, JogosActivity.class);
        startActivity(intent);
    }

    public void onClickCidades(View view){
        Intent intent = new Intent(this, CidadesActivity.class);
        startActivity(intent);
    }

    public void onClickSelecoes(View view){
        Intent intent = new Intent(this, SelecoesActivity.class);
        startActivity(intent);
    }

    public void onClickEstatisticas(View view){
        Intent intent = new Intent(this, EstatisticasActivity.class);
        startActivity(intent);
    }

    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.sobre:
                AlertDialog.Builder alert = new AlertDialog.Builder(this);
                String mensage = "SISTEMA DE INFORMAÇÃO DA COPA DO MUNDO DE 2014\n\nvlbb@icomp.ufam.edu.br";
                alert.setMessage(mensage).setNeutralButton("OK", null).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}