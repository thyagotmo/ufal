package projeto;
import java.util.Date;
/**
 *
 * @author thyagotmo
 */
public class Main {

    
    public static void main(String[] args) {
        
        Mae m = new Mae("Maria");
        Medico medico = new Medico("José","CRM 1020/AL");
        medico.setEspecialidade("Obstetra");
        
        
        Date d = new Date();
        
        Bebe bebe = new Bebe("joão", d, 3.5f, 0.51f, m, medico);
        
        System.out.println(bebe);
        
        
    }
    
}
