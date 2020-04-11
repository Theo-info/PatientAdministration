

public class PatientenWarteschlange {
    private final int N;
    private int n;
    private Patient[] patienten;
    
    public PatientenWarteschlange(int N){
        this.N = N;
        patienten = new Patient[N];
        n = 0;
    }
    
    public int size(){
        return n;
    }
    
    public boolean isEmpty(){
       return n == 0;
    }
    
    public void anmelden(Patient patient){
    }
   
    public Patient aufrufen(){
        return null;
    }
    
    @Override
    public String toString(){
        return "nicht implementiert";
    }
}
