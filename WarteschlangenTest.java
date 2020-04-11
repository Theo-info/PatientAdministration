

public class WarteschlangenTest {
    final int N = 9;
    PatientenWarteschlange wartezimmer;
    
    
    public void testeAnmelden(){
        wartezimmer = new PatientenWarteschlange(N);
        
        for(int i = 0; i < N + 3; i++){
            wartezimmer.anmelden(new Patient("Patient" + i));
        }
        System.out.println(wartezimmer);
    }
}
