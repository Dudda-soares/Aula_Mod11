package Classes;

import java.util.Comparator;

public class CompararNotaAluno implements Comparator<Aluno> {

    /**
     * @param o1 the first object to be compared.
     * @param o2 the second object to be compared.
     * @return
     */
    @Override
    public int compare(Aluno o2, Aluno o1) {
        return Double.compare(o1.getNota(), o2.getNota());
    }
}
