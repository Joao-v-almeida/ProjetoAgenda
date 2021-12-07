package VIEW;

import javax.swing.*;

public class FrmContato extends JFrame {

    private JPanel panelPrincipal;
    private JTextField txtNome;
    private JTextField txtTelefone;
    private JPanel panelBotao;
    private JButton btnSalvar;
    private JButton btnCancelar;

    public FrmContato() {
        setContentPane(panelPrincipal);
        setSize(500, 250);
        setVisible(true);
    }
}

