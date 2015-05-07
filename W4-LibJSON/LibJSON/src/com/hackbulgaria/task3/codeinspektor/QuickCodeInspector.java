package com.hackbulgaria.task3.codeinspektor;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import syntaxhighlight.SyntaxHighlighter;
import syntaxhighlighter.SyntaxHighlighterParser;
import syntaxhighlighter.brush.BrushCss;
import syntaxhighlighter.brush.BrushJScript;
import syntaxhighlighter.brush.BrushJava;
import syntaxhighlighter.brush.BrushPhp;
import syntaxhighlighter.theme.ThemeDjango;

public class QuickCodeInspector {

    public static void main(String[] args) {
       final String strPath; // = null;
     //   final String strPath = args[0];
        
//        if (args.length != 1) {
//            System.out.println("You have to provide path to file");
//        } 
//        else {
//            strPath = args[0];
//        }
        
        strPath = ".\\res\\email.java";
        
        SwingUtilities.invokeLater(new Runnable() {
            
            @Override
            public void run() {
                // the SyntaxHighlighter parser
                SyntaxHighlighterParser parser = new SyntaxHighlighterParser(new BrushJava());
                // turn HTML script on
                parser.setHtmlScript(true);
                // set HTML scriptBrushes
                parser.setHTMLScriptBrushes(Arrays.asList(new BrushCss(), new BrushJScript(), new BrushPhp()));
                
                // initialize the highlighter and use RDark theme
                SyntaxHighlighter highlighter = new SyntaxHighlighter(parser, new ThemeDjango());
                // set the line number count from 10 instead of 1
                highlighter.setFirstLine(10);
                // set to highlight line 13, 27, 28, 33, 42
                highlighter.setHighlightedLineList(Arrays.asList(13, 27, 28, 33, 42));
                try {
                    highlighter.setContent(new File(strPath));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                
                JFrame frame = new JFrame("File - " + new File(strPath).getName());
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setContentPane(highlighter);
                frame.setLocationByPlatform(true);
                frame.pack();
                frame.setVisible(true);
            }
        });
        

    }

}
