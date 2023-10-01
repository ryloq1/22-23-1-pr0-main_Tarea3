package edu.uoc.ds.adt;


import edu.uoc.ds.adt.sequential.Stack;
import edu.uoc.ds.adt.sequential.StackArrayImpl;

import java.time.LocalDate;


public class PR0Stack {
    public final int CAPACITY = 10;

    private Stack<LocalDate> stack;

    public PR0Stack() {
        newStack();
    }

    public void newStack() {
        stack = new StackArrayImpl<LocalDate>(CAPACITY);
    }


    public String clearAllStack() {
        StringBuilder sb = new StringBuilder();
        boolean primeraFecha= true;
        while (!stack.isEmpty()) {
            LocalDate fecha = stack.pop();
            int dia = fecha.getDayOfMonth();
            int mes =fecha.getMonthValue();
            String formatoFecha= String.format("%02d/%02d", dia, mes);

            if (primeraFecha) {
                sb.append(formatoFecha);
                primeraFecha = false;
            } else {
                sb.append(", ").append(formatoFecha);
            }
        }
        return sb.toString().trim();
    }

    public Stack<LocalDate> getStack() {
        return this.stack;
    }

    public void push(LocalDate fecha) {
        this.stack.push(fecha);
    }
}
