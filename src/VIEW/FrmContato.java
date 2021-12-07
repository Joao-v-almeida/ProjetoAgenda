package VIEW;

import BUSINESS.BusinessContato;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrmContato extends JFrame {

    private JPanel panelPrincipal;
    private JTextField txtNome;
    private JTextField txtTelefone;
    private JPanel panelBotao;
    private JButton btnSalvar;
    private JButton btnCancelar;
    private BusinessContato mBusinessContato;

    public FrmContato() {
        setContentPane(panelPrincipal);
        setSize(500, 250);
        setVisible(true);

        mBusinessContato = new BusinessContato();

        //Centralizar o Form.
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation(dim.width / 2 - getSize().width / 2, dim.height / 2 - getSize().height / 2);

        //Comportamento ao Fechar o sistema.
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        setListeners();
    }

    private void setListeners() {
        btnCancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new FrmMain();
                dispose();
            }
        });

        btnSalvar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String nome = txtNome.getText();
                    String telefone = txtTelefone.getText();

                    mBusinessContato.salvar(nome, telefone);
                    new FrmMain();
                    dispose();
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(new JFrame(), ex.getMessage(), "Atenção!",1);
                }

            }
        });
    }
}

