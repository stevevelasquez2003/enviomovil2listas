package adaptadores;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.puebliando1.R;
import com.example.puebliando1.moldes.Moldeturismo;

import java.util.ArrayList;

public class AdaptadorSitios  extends RecyclerView.Adapter <AdaptadorSitios.viewHolder>{

    public ArrayList<Moldeturismo> listasitiosturisticos;

    public AdaptadorSitios() {
    }

    public AdaptadorSitios(ArrayList<Moldeturismo> listaresitiosturisticos) {
        this.listasitiosturisticos = listaresitiosturisticos;
    }


    @NonNull
    @Override
    public AdaptadorSitios.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View vista = LayoutInflater.from(parent.getContext()).inflate(R.layout.molde_turismo,null,false);
        return new viewHolder(vista);
    }

    @Override
    public void onBindViewHolder(@NonNull AdaptadorSitios.viewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return listasitiosturisticos.size();
    }

    ImageView fototurismo;
    TextView nombresitio;
    TextView rangoprecio;
    TextView telefonositio;
    TextView nunmerositios;
    TextView contactositio;
    TextView nombrecontactositios;

    public class viewHolder extends RecyclerView.ViewHolder {
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            fototurismo = itemView.findViewById(R.id.fotoListaSitios);
            nombresitio = itemView.findViewById(R.id.nombreListaSitio);
            rangoprecio = itemView.findViewById(R.id.rangoListaSitios);
            telefonositio = itemView.findViewById(R.id.telefonoListaSitios);
            nunmerositios = itemView.findViewById(R.id.nuemroListaSitios);
            contactositio = itemView.findViewById(R.id.contactoListaSitios);
            nombrecontactositios = itemView.findViewById(R.id.nombreContacto);
            //get = traer
            //set = configurar
        }
        public  void actualizarDatos(Moldeturismo moldeturismo) {
            fototurismo.setImageResource(moldeturismo.getFoto());
            nombresitio.setText(moldeturismo.getNombre());
            rangoprecio.setText(moldeturismo.getPrecio());
            telefonositio.setText(moldeturismo.getTelefono());
            nunmerositios .setText(moldeturismo.getTelefono());
            nombrecontactositios .setText(moldeturismo.getNombreContacto());

        }
    }


}
