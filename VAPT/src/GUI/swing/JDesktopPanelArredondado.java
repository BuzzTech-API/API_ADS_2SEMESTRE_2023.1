
package GUI.swing;

import GUI.telasInternas.AtividadeDadosAluno;
import java.awt.*;
import javax.swing.*;

public class JDesktopPanelArredondado extends JFrame {
    public JDesktopPanelArredondado() {
        setTitle("Exemplo de JDesktopPane com Bordas Arredondadas");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Cria um JPanel com layout manager BorderLayout para conter o JDesktopPane
        JPanel panel = new JPanel(new BorderLayout()) {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // Desenha as bordas arredondadas
                g.setColor(Color.BLACK);
                g.drawRoundRect(0, 0, getWidth() - 1, getHeight() - 1, 20, 20);
            }
        };

        // Cria o JDesktopPane e adiciona ao JPanel
        JDesktopPane desktopPane = new JDesktopPane();
        panel.add(desktopPane, BorderLayout.CENTER);
        
        // Adiciona o JPanel ao JFrame
        add(panel);

        setSize(800, 600);
        setVisible(true);
        desktopPane.add(new AtividadeDadosAluno()).setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JDesktopPanelArredondado frame = new JDesktopPanelArredondado();
            
        });
    }
}