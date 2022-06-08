/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UtilityClasses;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/**
 *
 * @author clare
 */
public class JTextFieldCharLimit extends PlainDocument {
 
    private int limit;
    
    public JTextFieldCharLimit(int limitation)
    {
        
        this.limit = limitation;
        
    }
    
    public void insertString(int offset, String str, AttributeSet set) throws BadLocationException
    {
        
        if (str == null) {
           return;
        }
        else if ((getLength() + str.length()) <= limit) {
            str = str;
            super.insertString(offset, str, set);
        }
        
    }

    
}
