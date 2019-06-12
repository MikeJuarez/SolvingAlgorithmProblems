/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilities;

/**
 *
 * @author user
 */
public class ArrayPrinter {
    
    public static enum ArrayType {
        INTEGER,
        DOUBLE,
        FLOAT,
        STRING
    }
    
    public static void printArray(ArrayType arrayType, Object array) {
        
        if (null != arrayType) switch (arrayType) {
            case INTEGER:
                for (int i = 0; i < ((int[])array).length; i++) {
                    System.out.println(((int[])array)[i]);
                }
                break;
            case DOUBLE:
                for (int i = 0; i < ((double[])array).length; i++) {
                    System.out.println(((double[])array)[i]);
                }
                break;
            case FLOAT:
                for (int i = 0; i < ((float[])array).length; i++) {
                    System.out.println(((float[])array)[i]);
                }
                break;
            case STRING:
                for (int i = 0; i < ((String[])array).length; i++) {
                    System.out.println(((String[])array)[i]);
                }
                break;
            default:
                break;
        }
        
    }
    
}
