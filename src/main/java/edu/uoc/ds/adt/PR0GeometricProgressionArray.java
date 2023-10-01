package edu.uoc.ds.adt;

public class PR0GeometricProgressionArray {
    private int[] array;

    public PR0GeometricProgressionArray(int a1, int r, int n) {
        array = new int[n];
        inicializar(a1, r, n);
    }

    private void inicializar(int a1, int r, int n) {
        for (int i = 0; i < n; i++) {
            array[i] = a1 * (int) Math.pow(r, i);
        }
    }

    public int[] getArray() {
        return array;
    }

    public int getIndexOf(int elemento) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == elemento) {
                return i;
            }
        }
        return -1;
    }

    public int binarySearch(int elemento) {
        int izq = 0;
        int derecha = array.length - 1;

        while (izq <= derecha) {
            int mid = izq + (derecha - izq) / 2;

            if (array[mid] == elemento) {
                return mid;
            }

            if (array[mid] < elemento) {
                izq = mid + 1;
            } else {
                derecha = mid - 1;
            }
        }

        return -1;
    }


}
