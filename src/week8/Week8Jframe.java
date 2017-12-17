package week8;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Week8Jframe
{
    JFrame frame;
    JTextArea textArea;


    public void CreateJframe()
    {
        frame = new JFrame();//creating instance of JFrame

        frame.setJMenuBar(GetJMenuBar());
        frame.add(new JScrollPane(GetTextArea()));

        frame.setSize(500,500);//400 width and 500 height
        frame.setVisible(true);//making the frame visible
    }

    private JMenuBar GetJMenuBar()
    {
        JMenuBar bar = new JMenuBar();

        bar.add(GetJMenu());

        return  bar;
    }

    private JMenu GetJMenu()
    {
        JMenu menu = new JMenu("Menu");

        menu.add(GetJMenuItemRead());
        menu.add(GetJmenuRemoveEvenLines());
        menu.add(GetJmenuItemSave());

        return  menu;
    }

    private JMenuItem GetJMenuItemRead()
    {
        JMenuItem read = new JMenuItem("Read");

        read.addActionListener(GetJMenuItemReadActionListener());

        return  read;
    }

    private ActionListener GetJMenuItemReadActionListener()
    {
        return actionEvent ->
        {
            JFileChooser chooser = new JFileChooser();
            int returnVal = chooser.showOpenDialog(null);
            if(returnVal == JFileChooser.APPROVE_OPTION && chooser.getSelectedFile().getName().contains("txt"))
            {
                OnChooseFile(chooser.getSelectedFile().getPath());
            }

        };
    }

    private void OnChooseFile(String path)
    {
        List<String> text = new ArrayList<>();

        try
        {
            text = Files.readAllLines(Paths.get(path));

        } catch (IOException e)
        {
            e.printStackTrace();
        }

        textArea.setText("");

        for (String i: text)
        {
            textArea.append(i + "\n");
        }
    }

    private JTextArea GetTextArea()
    {
        textArea = new JTextArea();

        return textArea;
    }

    private JMenuItem GetJmenuRemoveEvenLines()
    {
        JMenuItem removeEvenLines = new JMenuItem("Remove Even Lines");

        removeEvenLines.addActionListener(GetJMenuItemRemoveEvenLinesActionListener());

        return  removeEvenLines;
    }

    private ActionListener GetJMenuItemRemoveEvenLinesActionListener()
    {
        return actionEvent ->
        {
            String[] text = textArea.getText().split("\n");

            textArea.setText("");

            for(int i = 1; i < text.length; i += 2)
            {
                textArea.append(text[i] + '\n');
            }
        };
    }

    private JMenuItem GetJmenuItemSave()
    {
        JMenuItem save = new JMenuItem("Save");

        save.addActionListener(GetJMenuItemSaveActionListener());

        return  save;
    }

    private ActionListener GetJMenuItemSaveActionListener()
    {
        return actionEvent ->
        {
            JFileChooser chooser = new JFileChooser();



            int returnVal = chooser.showSaveDialog(null);
            if(returnVal == JFileChooser.APPROVE_OPTION)
            {
                File targetFile = chooser.getSelectedFile();

                try
                {


                    if(!targetFile.getName().contains(".txt"))
                    {
                        targetFile = new File(targetFile.toString() + ".txt");
                    }

                    if (!targetFile.exists())
                    {
                        targetFile.createNewFile();
                    }

                    FileWriter fw = new FileWriter(targetFile);

                    fw.write(textArea.getText());
                    fw.close();
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
            }

        };
    }
}
