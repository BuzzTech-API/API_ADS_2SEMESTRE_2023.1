/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/**
 *
 * @author Fatec
 */
public final class LengthRestrictedDocument extends PlainDocument {
    private final int limit;

    public LengthRestrictedDocument(int limit) {
        this.limit = limit;
}

    @Override
    public void insertString(int offs, String str, AttributeSet a)
        throws BadLocationException {
    if (str == null)
      return;

    if ((getLength() + str.length()) <= limit) {
      super.insertString(offs, str, a);
    }
  }    
    
}
