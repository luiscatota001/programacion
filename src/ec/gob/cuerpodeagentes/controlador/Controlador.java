package ec.gob.cuerpodeagentes.controlador;

import ec.gob.cuerpodeagentes.modelo.Punto;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author luisc
 */
public class Controlador {

    Punto p;
    ArrayList<Punto> listaPunto = new ArrayList<>();

    public void menu() {
        int op = 0;
        String opcionesMenu = "1.- Punto\n"
                + "2.- Recta\n"
                + "3.- Poligono\n"
                + "4.- Ovalo\n"
                + "5.- Salir";
        do {
            try {
                op = Integer.parseInt(JOptionPane.showInputDialog(opcionesMenu));
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            switch (op) {
                case 1:
                    menuPunto();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
            }

        } while (op != 5);
    }

    public void menuPunto() {
        int op = 0;
        String menu = "1.- Crear Punto\n"
                + "2.- Modificar Punto\n"
                + "3.- Eliminar Punto\n"
                + "4.- Imprimir\n"
                + "5.- Salir";
        do {
            try {
                op = Integer.parseInt(JOptionPane.showInputDialog(menu));
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

            switch (op) {
                case 1:
                    crearPunto();
                    break;
                case 2:
                    modificarPunto();
                    break;
                case 3:
                    eliminarPunto();
                    break;
                case 4:
                    imprimir();
                    break;
            }

        } while (op != 5);
    }

    public void crearPunto() {
        p = new Punto();
        try {
            p.setX(Integer.parseInt(JOptionPane.showInputDialog("Ingrese X")));
            p.setY(Integer.parseInt(JOptionPane.showInputDialog("Ingrese Y")));
            listaPunto.add(p);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println(p.toString());
    }

    public void modificarPunto() {
        try {
            int op = Integer.parseInt(JOptionPane.showInputDialog(imprimir()));
            listaPunto.get(op).setX(Integer.parseInt(JOptionPane.showInputDialog("Reingresa X")));
            listaPunto.get(op).setY(Integer.parseInt(JOptionPane.showInputDialog("Reingresa Y")));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void eliminarPunto() {
        try {
            int op = Integer.parseInt(JOptionPane.showInputDialog(imprimir()));
            listaPunto.remove(op);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public String imprimir() {
        return listaPunto.toString();
    }
}
