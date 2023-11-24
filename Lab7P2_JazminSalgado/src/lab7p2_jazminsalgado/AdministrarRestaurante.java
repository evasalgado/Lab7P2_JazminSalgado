/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7p2_jazminsalgado;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author evaja
 */
public class AdministrarRestaurante {
    private ArrayList<restaurante> listarRest = new ArrayList<>();
    private File archivo = null;

    public AdministrarRestaurante(String path) {
        archivo = new File(path);
    }

    public ArrayList<restaurante> getListarRest() {
        return listarRest;
    }

    public void setListarRest(ArrayList<restaurante> listarRest) {
        this.listarRest = listarRest;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "listarRest=" + listarRest ;
    }

    

    public void setRest(restaurante r) {
        this.listarRest.add(r);
    }

    public void escribir() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;

        try {
            fw = new FileWriter(archivo, true);
            bw = new BufferedWriter(fw);
            for (restaurante rest: listarRest) {
                bw.write(rest.getNombre() + ";"+rest.getUbicacion()+ ";"
                +rest.getProductos()+ ";");
            }
            bw.flush();
        } catch (Exception e) {
        }
        bw.close();
        fw.close();
    }

    public void cargar() {
        Scanner carga = null;
        listarRest = new ArrayList<>();
        if (archivo.exists()) {
            try {
                carga = new Scanner(archivo);
                carga.useDelimiter(";");
                while (carga.hasNext()) {
                    listarRest.add(new restaurante(carga.nextLine(),carga.nextLine())
                    );
                }
            } catch (Exception e) {
            }
            carga.close();
        }
    }
}
