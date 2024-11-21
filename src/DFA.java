import java.util.Map;
import java.util.Set;

public class DFA {
    //  Estados validos
    private Set<Integer> Q;

    //  Abecedario
    private Map<String, Set<Character>> Sigma;

    //  Func de transición
    private Map<Map.Entry<Integer, Character>, Integer> Delta;

    //  Estado inicial
    private int q0;

    //  Estados de aceptación o final
    private Set<Integer> F;

    public DFA(Set<Integer> Q, Map<String, Set<Character>> Sigma,
               Map<Map.Entry<Integer, Character>, Integer> Delta, int q0, Set<Integer> F) {
        this.Q = Q;
        this.Sigma = Sigma;
        this.Delta = Delta;
        this.q0 = q0;
        this.F = F;
    } // close method

    public int getInitial() {
        return q0;
    } // close method

/*    public Set<Integer> getState() {
        return null;
    }*/

    public int changeState(final int state, final char w) {
        int wIndex = -1;
        if (Sigma.get("alfabeto").contains(w)) {
            wIndex = 0;
        } else if (Sigma.get("digito").contains(w)) {
            wIndex = 1;
        } else if (Sigma.get("operador").contains(w)) {
            wIndex = 2;
        } else if (Sigma.get("delimitador").contains(w)) {
            wIndex = 3;
        }

        Map.Entry<Integer, Character> key = Map.entry(state, w);

        if (!Delta.containsKey(key)) {
            return Delta.getOrDefault(key, 9);
        }

        return Delta.get(key);
    } // close method
} // close class
