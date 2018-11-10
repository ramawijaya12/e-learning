package Program;

import java.util.Comparator;

public class SortingNama implements Comparator<Mahasiswa> {
    
    @Override
    public int compare(Mahasiswa a, Mahasiswa b) {
        return a.getNama().compareToIgnoreCase(b.getNama());
    }
}
    

