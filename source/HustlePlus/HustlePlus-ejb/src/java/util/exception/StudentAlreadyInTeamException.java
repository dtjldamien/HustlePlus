
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util.exception;

/**
 *
 * @author dtjldamien
 */

public class StudentAlreadyInTeamException extends Exception {

    /**
     * Creates a new instance of <code>StudentNotFoundException</code>
     * without detail message.
     */
    public StudentAlreadyInTeamException() {
    }

    /**
     * Constructs an instance of <code>StudentNotFoundException</code> with
     * the specified detail message.
     *
     * @param msg the detail message.
     */
    public StudentAlreadyInTeamException(String msg) {
        super(msg);
    }
}
