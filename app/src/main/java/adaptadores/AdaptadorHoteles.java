package adaptadores;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.puebliando1.AmpliandoHotel;
import com.example.puebliando1.R;
import com.example.puebliando1.moldes.Moldehotel;

import java.util.ArrayList;

public class AdaptadorHoteles extends RecyclerView.Adapter<AdaptadorHoteles.viewHolder> {
    //para poder juntar el molde olgico del molde grafico
    //todo adaptador tiene una lista de elementos
    public ArrayList<Moldehotel> listaHoteles;

    //creamos un constructor vacio

    public AdaptadorHoteles() {
    }


    //creamos un contructor lleno


    public AdaptadorHoteles(ArrayList<Moldehotel> listaHoteles) {
        this.listaHoteles = listaHoteles;
    }

    @NonNull
    @Override// el oncreateviewholder crea un elemento grafico
    public AdaptadorHoteles.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View vista= LayoutInflater.from(parent.getContext()).inflate(R.layout.moldehotel,null,false);
        return new viewHolder(vista);
    }

    @Override
    public void onBindViewHolder(@NonNull AdaptadorHoteles.viewHolder holder, int position) {
        holder.actualizarDatos(listaHoteles.get(position));
    }

    @Override
    public int getItemCount() {
        return listaHoteles.size();
    }
    ImageView fotoHotel;
    TextView nombreHotel;
    TextView precioHotel;
    TextView contactoHotel;
    public  class viewHolder extends RecyclerView.ViewHolder {
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            fotoHotel = itemView.findViewById(R.id.fotoListaHotel);
            nombreHotel = itemView.findViewById(R.id.nombreListaHotel);
            precioHotel = itemView.findViewById(R.id.precioListaHotel);
            contactoHotel  = itemView.findViewById(R.id.contactoHotel);

            //get = traer
            //set = configurar
        }

        public  void actualizarDatos(Moldehotel moldehotel) {
            fotoHotel.setImageResource(moldehotel.getFoto());
            nombreHotel.setText(moldehotel.getNombre());
            precioHotel.setText(moldehotel.getPrecio());
            contactoHotel.setText(moldehotel.getTelefono());

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(itemView.getContext(), AmpliandoHotel.class);
                    intent.putExtra("datoshotel",moldehotel);
                    itemView.getContext().startActivity(intent);
                }
            });
        }
    }
}
