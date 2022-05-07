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

public class JogosActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private JogosAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jogos);

        recyclerView = findViewById(R.id.list_recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        adapter = new JogosAdapter(this);
        recyclerView.setAdapter(adapter);
    }

    protected void onRestart(){
        super.onRestart();
        adapter.update();
        adapter.notifyDataSetChanged();
    }
}

class JogosAdapter extends RecyclerView.Adapter<JogosViewHolder> {
    private Context context;
    private ArrayList<Jogos> jogos;
    JogosDAO jogosDAO;

    public JogosAdapter(Context context){
        this.context = context;
        jogosDAO = new JogosDAO(context);
        update();
    }

    public void update(){
        jogos = jogosDAO.getList();
    }

    @Override
    public JogosViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        ConstraintLayout v = (ConstraintLayout) LayoutInflater.from(parent.getContext()).inflate(R.layout.list_jogos,parent,false);
        JogosViewHolder vh = new JogosViewHolder(v, context);
        return vh;
    }

    public void onBindViewHolder(JogosViewHolder holder, int position){
        holder.selecoes.setText(jogos.get(position).getSelecoes());
        holder.data.setText(jogos.get(position).getData());
        holder.placar.setText(jogos.get(position).getPlacar());
        holder.estadio.setText(jogos.get(position).getEstadio());
        holder.estado.setText(jogos.get(position).getEstado());
        holder.cidade.setText(jogos.get(position).getCidade());
        holder.resultado.setText(jogos.get(position).getResultado());
        holder.tipo.setText(jogos.get(position).getTipo());
    }

    public int getItemCount(){
        return jogos.size();
    }
}

class JogosViewHolder extends RecyclerView.ViewHolder{
    public Context context;
    public TextView selecoes,data,placar,resultado,cidade,estado,estadio,tipo;

    public JogosViewHolder(ConstraintLayout v, Context context){
        super(v);
        this.context = context;
        selecoes = v.findViewById(R.id.itemSelecoes);
        data = v.findViewById(R.id.itemData);
        placar = v.findViewById(R.id.itemPlacar);
        resultado = v.findViewById(R.id.itemResultado);
        cidade = v.findViewById(R.id.itemCidade);
        estado = v.findViewById(R.id.itemEstado);
        estadio = v.findViewById(R.id.itemEstadio);
        tipo = v.findViewById(R.id.itemTIpo);
    }
}