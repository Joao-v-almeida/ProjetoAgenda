package VIEW;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrmMain extends JFrame {
    private JPanel panelPrincipal;
    private JButton btnContato;
    private JButton btnRemover;
    private JTable tbContato;

    public FrmMain() {
        setContentPane(panelPrincipal);
        setSize(500, 250);
        setVisible(true);

        //Centralizar o Form.
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation(dim.width / 2 - getSize().width / 2, dim.height / 2 - getSize().height / 2);

        //Comportamento ao Fechar o sistema.
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //Escutando (prestando atenção)
        setListeners();
    }

    private void setListeners() {
        btnContato.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new FrmContato();
                dispose();
            }
        });
        btnRemover.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}
