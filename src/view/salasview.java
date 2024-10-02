package view;

import backend.sala;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
class salasView extends JPanel {
    private ArrayList<sala> listaSalas;

    public salasView(ArrayList<sala> listaSalas) {
        this.listaSalas = listaSalas;
        initPanel();
    }

    private void initPanel() {
        setLayout(new GridLayout(4, 3, 10, 10));
        for (sala sala : listaSalas) {
            JPanel panelSala = crearPanelSala(sala.getNombre(), sala.getEstado());
            add(panelSala);
        }
    }

    private JPanel crearPanelSala(String nombre, String estado) {
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        JLabel nombreLabel = new JLabel(nombre, SwingConstants.CENTER);
        nombreLabel.setFont(new Font("Arial", Font.BOLD, 16));
        panel.add(nombreLabel, BorderLayout.CENTER);

        switch (estado) {
            case "En uso":
                panel.setBackground(Color.RED);
                break;
            case "Fuera de servicio":
                panel.setBackground(Color.YELLOW);
                break;
            case "Disponible":
                panel.setBackground(Color.GREEN);
                break;

        }

        panel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        return panel;
    }
}

