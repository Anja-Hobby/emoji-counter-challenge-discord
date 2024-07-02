package challenges3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;

public class Gui_reader extends JFrame {
    private JTextField folderLocationField;
    private JTextField amountOfWeeksField;
    private JTextArea outputArea;

    public Gui_reader() {
        setTitle("Reader GUI");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        // Panel for input fields
        JPanel inputPanel = new JPanel(new GridLayout(3, 2));
        
        inputPanel.add(new JLabel("Folder Location:"));
        folderLocationField = new JTextField(30);
        inputPanel.add(folderLocationField);
        
        inputPanel.add(new JLabel("Amount of Weeks:"));
        amountOfWeeksField = new JTextField(5);
        inputPanel.add(amountOfWeeksField);
        
        JButton processButton = new JButton("Process Files");
        processButton.addActionListener(new ProcessButtonListener());
        inputPanel.add(processButton);
        
        // Output area
        outputArea = new JTextArea(10, 40);
        outputArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(outputArea);
        
        add(inputPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);
    }

    private class ProcessButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String folderLocation = folderLocationField.getText();
            int amountOfWeeks;
            try {
                amountOfWeeks = Integer.parseInt(amountOfWeeksField.getText());
            } catch (NumberFormatException ex) {
                outputArea.setText("Invalid number for weeks.");
                return;
            }
            
            // Call the reader's main logic
            processFiles(folderLocation, amountOfWeeks);
        }
    }

    private void processFiles(String folderLocation, int amountOfWeeks) {
    	// Check folderLocation and add slashes if necessary
    	if (!folderLocation.endsWith("\\")) {folderLocation = folderLocation + "\\";}
        int week = 0;
        ArrayList<BufferedReader> br_week_list = new ArrayList<>();

        while (week <= amountOfWeeks) {
            String file_name = folderLocation + "\\chatW" + week + ".txt";
            File file = new File(file_name);
            if (file.exists() && file.isFile()) {
                try {
                    br_week_list.add(new BufferedReader(new FileReader(file)));
                } catch (FileNotFoundException e) {
                    outputArea.append("File not found: " + file_name + "\n");
                    return;
                }
            }
            week++;
        }

        try {
            new Process(getBufReader(folderLocation + "promise.txt"),
                        getBufReader(folderLocation + "done.txt"),
                        getBufReader(folderLocation + "bonus.txt"),
                        br_week_list,
                        outputArea);
        } catch (FileNotFoundException e) {
            outputArea.append("Required file not found: " + e.getMessage() + "\n");
        } catch (Exception e) {
            outputArea.append("An error occurred: " + e.getMessage() + "\n");
        }
    }

    private BufferedReader getBufReader(String fileLocation) throws FileNotFoundException {
        return new BufferedReader(new FileReader(new File(fileLocation)));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Gui_reader gui = new Gui_reader();
            gui.setVisible(true);
        });
    }
}