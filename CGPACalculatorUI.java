import java.awt.*;
import java.awt.event.*;
import java.util.HashMap;
import javax.swing.*;

public class CGPACalculatorUI extends JFrame implements ActionListener 
{
    private static final long serialVersionUID = 1L;

    // Creating a HashMap of grades and their corresponding grade points
    private HashMap<String, Double> gradePoint = new HashMap<String, Double>();
    {
        gradePoint.put("O", 10.0);
        gradePoint.put("A+", 9.0);
        gradePoint.put("A", 8.0);
        gradePoint.put("B+", 7.0);
        gradePoint.put("B", 6.0);
        gradePoint.put("C", 5.0);
        gradePoint.put("P", 4.0);
        gradePoint.put("F", 0.0);
    }

    // Creating UI components
    private JLabel semLabel;
    private JLabel numSubLabel;
    private JLabel subNameLabel;
    private JLabel creditsLabel;
    private JLabel gradeLabel;
    private JTextField semField;
    private JTextField numSubField;
    private JTextField subNameField;
    private JTextField creditsField;
    private JComboBox<String> gradeBox;
    private JButton addButton;
    private JButton calculateButton;
    private JTextArea outputArea;

    // Creating variables to store the current semester and total credits/grade points
    private int currentSem = 1;
    private double totalCredits = 0.0;
    private double totalGradePoints = 0.0;

    public CGPACalculatorUI() {
        // Setting up the window
        setTitle("CGPA Calculator");
        setSize(600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Creating the UI components
        semLabel = new JLabel("Semester:");
        numSubLabel = new JLabel("Number of subjects:");
        subNameLabel = new JLabel("Subject name:");
        creditsLabel = new JLabel("Credits:");
        gradeLabel = new JLabel("Grade:");
        semField = new JTextField(10);
        numSubField = new JTextField(10);
        subNameField = new JTextField(10);
        creditsField = new JTextField(10);
        gradeBox = new JComboBox<String>(gradePoint.keySet().toArray(new String[0]));
        addButton = new JButton("Add Subject");
        calculateButton = new JButton("Calculate CGPA");
        outputArea = new JTextArea(10, 40);

        // Creating the panel for the input fields and add button
        JPanel inputPanel = new JPanel(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 0;
        inputPanel.add(semLabel, c);
        c.gridx = 1;
        inputPanel.add(semField, c);
        c.gridx = 0;
        c.gridy = 1;
        inputPanel.add(numSubLabel, c);
        c.gridx = 1;
        inputPanel.add(numSubField, c);
        c.gridx = 0;
        c.gridy = 2;
        inputPanel.add(subNameLabel, c);
        c.gridx = 1;
        inputPanel.add(subNameField, c);
        c.gridx = 0;
        c.gridy = 3;
        inputPanel.add(creditsLabel, c);
        c.gridx = 1;
        inputPanel.add(creditsField, c);
        c.gridx = 0;
        c.gridy = 4;
        inputPanel.add(gradeLabel, c);
        c.gridx = 1;
        inputPanel.add(gradeBox, c);
        c.gridx = 0;
        c.gridy = 5;
        c.grid
