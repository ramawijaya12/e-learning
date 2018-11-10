package Program;

import java.util.Comparator;

public class SortingNim implements Comparator<Mahasiswa> {
    
    @Override
        public int compare(Mahasiswa a, Mahasiswa b ){
            return a.getNim().compareToIgnoreCase(b.getNim());
        }
    
}
