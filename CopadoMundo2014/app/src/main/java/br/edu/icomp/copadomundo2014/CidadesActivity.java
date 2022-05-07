package br.edu.icomp.copadomundo2014;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CidadesActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private CidadesAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cidades);

        recyclerView = findViewById(R.id.list_cidades);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        adapter = new CidadesAdapter(this);
        recyclerView.setAdapter(adapter);
    }

    protected void onRestart(){
        super.onRestart();
        adapter.update();
        adapter.notifyDataSetChanged();
    }
}

class CidadesAdapter extends RecyclerView.Adapter<CidadesViewHolder>{
    private Context context;
    private ArrayList<Cidades> cidades;
    CidadesDAO cidadesDAO;

    public CidadesAdapter(Context context){
        this.context = context;
        cidadesDAO = new CidadesDAO(context);
        update();
    }

    public void update(){
        cidades = cidadesDAO.getList();
    }

    @Override
    public CidadesViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        ConstraintLayout v = (ConstraintLayout) LayoutInflater.from(parent.getContext()).inflate(R.layout.list_cidades,parent,false);
        CidadesViewHolder vh = new CidadesViewHolder(v, context);
        return vh;
    }

    public void onBindViewHolder(CidadesViewHolder holder, int position){
        holder.estadio.setText(cidades.get(position).getEstadio());
        holder.estado.setText(cidades.get(position).getEstado());
        holder.cidade.setText(cidades.get(position).getCidade());
    }

    public int getItemCount(){
        return cidades.size();
    }

}

class CidadesViewHolder extends RecyclerView.ViewHolder{
    public Context context;
    public TextView cidade,estado,estadio;

    public CidadesViewHolder(ConstraintLayout v, Context context){
        super(v);
        this.context = context;
        cidade = v.findViewById(R.id.item_cidade);
        estado = v.findViewById(R.id.item_estado);
        estadio = v.findViewById(R.id.item_etadio);
    }
}