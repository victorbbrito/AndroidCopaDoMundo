package br.edu.icomp.copadomundo2014;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class EstatisticasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estatisticas);
    }

    public void onClickGols(View view){
        Intent intent = new Intent(this, GolsActivity.class);
        startActivity(intent);
    }

    public void onClickAssistencias(View view){
        Intent intent = new Intent(this, AssistenciasActivity.class);
        startActivity(intent);
    }

    public void onClickCartoesAmarelos(View view){
        Intent intent = new Intent(this, CartoesAmarelosActivity.class);
        startActivity(intent);
    }

    public void onClickCartoesVermelhos(View view){
        Intent intent = new Intent(this, CartoesVermelhosActivity.class);
        startActivity(intent);
    }

    public void onClickClassificacao(View view){
        Intent intent = new Intent(this, ClassificacaoActivity.class);
        startActivity(intent);
    }

}