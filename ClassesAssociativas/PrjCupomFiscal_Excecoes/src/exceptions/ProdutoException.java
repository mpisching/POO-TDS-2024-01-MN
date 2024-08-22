/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package exceptions;

/**
 *
 * @author Professor
 */
public class ProdutoException extends Exception {

    /**
     * Creates a new instance of <code>ProdutoException</code> without detail
     * message.
     */
    public ProdutoException() {
    }

    /**
     * Constructs an instance of <code>ProdutoException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public ProdutoException(String msg) {
        super(msg);
    }
}
