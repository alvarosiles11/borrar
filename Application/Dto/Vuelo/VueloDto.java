package Application.Dto.Vuelo;

import java.util.ArrayList;
import com.google.gson.Gson;

public class VueloDto {

    public ArrayList<TripulanteDto> ListaTripulante;
    public ArrayList<AsientoDisponibleDto> ListaAsiento;

    public VueloDto() {
        ListaTripulante = new ArrayList<TripulanteDto>();
        ListaAsiento = new ArrayList<AsientoDisponibleDto>();
    }

    public ArrayList<TripulanteDto> getListaTripulante() {
        return ListaTripulante;
    }

    public void setListaTripulante(ArrayList<TripulanteDto> listaTripulante) {
        ListaTripulante = listaTripulante;
    }

    public ArrayList<AsientoDisponibleDto> getListaAsiento() {
        return ListaAsiento;
    }

    public void setListaAsiento(ArrayList<AsientoDisponibleDto> listaAsiento) {
        ListaAsiento = listaAsiento;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

}
