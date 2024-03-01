/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poly.sv.helpers;

import javax.swing.JTextField;

/**
 *
 * @author Utech
 */
public class DataValidator {
    public static void validateEmpty(JTextField field,StringBuilder sb, String errorMessage) {
        if(field.getText().equals("")) {
            sb.append(errorMessage).append("\n");
            field.requestFocus();
        }
    }
}
