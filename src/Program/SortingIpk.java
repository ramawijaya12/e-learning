package Program;

import java.util.Comparator;

public class SortingIpk implements Comparator<Mahasiswa> {
    @Override
    public int compare(Mahasiswa a, Mahasiswa b ){
          return Float.compare(a.getIPK(),b.getIPK());
            } 
}
