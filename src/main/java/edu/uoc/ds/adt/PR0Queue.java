package edu.uoc.ds.adt;


import edu.uoc.ds.adt.sequential.Queue;
import edu.uoc.ds.adt.sequential.QueueArrayImpl;

import java.time.LocalDate;

public class PR0Queue {

    public final int CAPACITY = 10;

    private Queue<LocalDate> queue;

    public PR0Queue() {
        newQueue();
    }
    public void newQueue() {
        queue = new QueueArrayImpl<>(CAPACITY);
    }


    public String clearFullQueue() {
        StringBuilder sb = new StringBuilder();

        while (!queue.isEmpty()) {
            LocalDate fecha = queue.poll();
            int dia = fecha.getDayOfMonth();
            int mes =fecha.getMonthValue();
            String formatoFecha= String.format("%02d/%02d", dia, mes);
            sb.append(formatoFecha);
            if (!queue.isEmpty()) {
                sb.append(", ");
            }
        }
        return sb.toString().trim();
    }

    public Queue<LocalDate> getQueue() {
        return this.queue;
    }

    public void add(LocalDate fecha) {
        this.queue.add(fecha);
        String formattedDate = String.format("%02d/%02d", fecha.getDayOfMonth(), fecha.getMonthValue());
    }

    public static class PR0GeometricProgressionArray {

    }
}
