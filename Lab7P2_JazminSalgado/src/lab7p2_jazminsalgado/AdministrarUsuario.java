/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7p2_jazminsalgado;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author evaja
 */
public class AdministrarUsuario {

    private ArrayList<usuario> listarUsers = new ArrayList<>();
    private File archivo = null;

    public AdministrarUsuario(String path) {
        archivo = new File(path);
    }

    public ArrayList<usuario> getListarUsers() {
        return listarUsers;
    }

    public void setListarUsers(ArrayList<usuario> listarUsers) {
        this.listarUsers = listarUsers;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "listarUsers=" + listarUsers + '}';
    }

    public void setUsers(usuario u) {
        this.listarUsers.add(u);
    }

    public void escribir() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;

        try {
            fw = new FileWriter(archivo, true);
            bw = new BufferedWriter(fw);
            for (usuario lu : listarUsers) {
                bw.write(lu.getNombre() + ";" + lu.getUsername() + ";"
                        + lu.getContraseña() + ";" + lu.getSaldo()+ ";");
            }
            bw.flush();
        } catch (Exception e) {
        }
        bw.close();
        fw.close();
    }

    public void cargar() {
        Scanner carga = null;
        listarUsers = new ArrayList<>();
        if (archivo.exists()) {
            try {
                carga = new Scanner(archivo);
                carga.useDelimiter(";");
                while (carga.hasNext()) {
                    listarUsers.add(new usuario(carga.nextLine(),
                            carga.next(),
                            carga.next(),
                            carga.nextDouble()
                    )
                    );
                }
            } catch (Exception e) {
            }
            carga.close();
        }
    }

}
