package adaptadores;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.puebliando1.AmpliandoRestaurantes;
import com.example.puebliando1.R;
import com.example.puebliando1.moldes.MoldeRestaurantes;

import java.util.ArrayList;

public class AdaptadorRestaurantes  extends RecyclerView.Adapter <AdaptadorRestaurantes.viewHolder>{

    public ArrayList<MoldeRestaurantes> listaRestaurantes;

    public AdaptadorRestaurantes(ArrayList<MoldeRestaurantes> listaRestaurantes) {
        this.listaRestaurantes = listaRestaurantes;
    }

    @NonNull
    @Override
    public AdaptadorRestaurantes.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View vista = LayoutInflater.from(parent.getContext()).inflate(R.layout.molderestaurante,null,false);
        return new viewHolder(vista);
    }

    @Override
    public void onBindViewHolder(@NonNull AdaptadorRestaurantes.viewHolder holder, int position) {
        holder.actualizarDatos(listaRestaurantes.get(position));
    }

    @Override
    public int getItemCount() {
        return listaRestaurantes.size();
    }

    ImageView fotoRestaurante;
    TextView nombreRestaurante;
    TextView precioRestaurante;
    TextView contactoRestaurante;
    TextView numeroRestaurante;
    TextView platoRecomendado;


    public class viewHolder extends RecyclerView.ViewHolder {
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            fotoRestaurante = itemView.findViewById(R.id.fotoListaRestaurante);
            nombreRestaurante = itemView.findViewById(R.id.nombreListaRestaurante);
            precioRestaurante = itemView.findViewById(R.id.RangoRestaurantes);
            contactoRestaurante = itemView.findViewById(R.id.TelefonoRestaurante);
            numeroRestaurante = itemView.findViewById(R.id.NumeroRestaurante);
            platoRecomendado = itemView.findViewById(R.id.PlatoRecomendado);
            //get = traer
            //set = configurar
        }
        public  void actualizarDatos(MoldeRestaurantes moldeRestaurantes) {
            fotoRestaurante.setImageResource(moldeRestaurantes.getFoto());
            nombreRestaurante.setText(moldeRestaurantes.getNombre());
            precioRestaurante.setText(moldeRestaurantes.getRangoPrecio());
            contactoRestaurante.setText(moldeRestaurantes.getTelefono());
            numeroRestaurante .setText(moldeRestaurantes.getTelefono());
            platoRecomendado .setText(moldeRestaurantes.getPlatoRecomendado());

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(itemView.getContext(), AmpliandoRestaurantes.class);
                    intent.putExtra("datosrestaurantes",moldeRestaurantes);
                    itemView.getContext().startActivity(intent);
                }
            });
        }
    }
}
