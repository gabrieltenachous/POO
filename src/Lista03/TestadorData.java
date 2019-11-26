package Lista03;
import java.util.Calendar;
import java.util.GregorianCalendar;
public class TestadorData extends Data {
    GregorianCalendar g = new GregorianCalendar();
    Calendar c = Calendar.getInstance();
    public TestadorData(int dia, int mes, int ano) {
        super(dia, mes, ano);
    }

    public TestadorData() {
        dia=c.get(Calendar.DAY_OF_MONTH);
        ano=c.get(Calendar.YEAR);
        mes=c.get(Calendar.MONTH)+1;
    }
    
}
