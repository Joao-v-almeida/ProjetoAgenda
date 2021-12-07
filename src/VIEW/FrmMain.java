package VIEW;

import BUSINESS.BusinessContato;
import ENTIDADE.EntidadeContato;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class FrmMain extends JFrame {
    private JPanel panelPrincipal;
    private JButton btnContato;
    private JButton btnRemover;
    private JTable tbContato;
    private JLabel lblContadorContatos;
    private BusinessContato mBusinessContato;

    public FrmMain() {
        setContentPane(panelPrincipal);
        setSize(500, 250);
        setVisible(true);

        mBusinessContato = new BusinessContato();

        //Centralizar o Form.
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation(dim.width / 2 - getSize().width / 2, dim.height / 2 - getSize().height / 2);

        //Comportamento ao Fechar o sistema.
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //Escutando (prestando atenção)
        setListeners();
        carregarContatos();

    }

    private void carregarContatos() {
        List<EntidadeContato> listaContato = mBusinessContato.getList();

        String[] nomeColunas = {"Nome", "Telefone"};
        DefaultTableModel model = new DefaultTableModel(new Object[0][0], nomeColunas);

        for (EntidadeContato i : listaContato) {
            Object[] o = new Object[2]; //Nome e Telefone.
            o[0] = i.getNome();
            o[1] = i.getTelefone();
            model.addRow(o);
        }

        tbContato.clearSelection();
        tbContato.setModel(model);
        lblContadorContatos.setText(mBusinessContato.getContadorContatos());
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
